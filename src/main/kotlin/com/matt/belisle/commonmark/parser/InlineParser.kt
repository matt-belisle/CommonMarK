package com.matt.belisle.commonmark.parser

import com.matt.belisle.commonmark.ast.Document
import com.matt.belisle.commonmark.ast.containerBlocks.Container
import com.matt.belisle.commonmark.ast.inlineElements.*
import com.matt.belisle.commonmark.ast.leafBlocks.Leaf
import com.matt.belisle.commonmark.parser.inlineParsingUtil.AutoLinkURIMatcher
import com.matt.belisle.commonmark.parser.inlineParsingUtil.InlineLexer
import com.matt.belisle.commonmark.parser.inlineParsingUtil.InlineMetaData
import com.matt.belisle.commonmark.parser.inlineParsingUtil.InlineTypes
import kotlinx.coroutines.*
import java.util.*
// This is the basic Inline parsing logic, give it a list of inline tasks to do in order, and it will do them to all leaves
// As spec says this can be done asynchronously so thats what we will do using coroutines
// NOTE:: the parser can only accept custom inlines in the form of new delimiters for emphasis, ie surrounding text in a new delimiter
// it will not be accepting new things like code spans (although similar could be done with emphasis)

class InlineParser {
    fun parse(document: Document): Document {

       runBlocking { parseLeaves(allLeaves(document)) }

        return document
    }

    private suspend fun parseLeaves(leaves: List<Leaf>){
        coroutineScope {
            // launches all leaves into seperate coroutines to be dealt with as they can
            leaves.forEach { launch { analyzeBlock(it) } }
        }
    }

    private fun analyzeBlock(leaf: Leaf){

        // this will use double dispatch for the line, this allows the block to decide what fields will be analyzed
        // this is useful for code fence, which wants its info string to be analyzed but NOT its body or tables
        // for github flavored as each cell could be analyzed
        leaf.analyzeInlines(this)
    }

    private fun allLeaves(container: Container): List<Leaf>{
        val ret = mutableListOf<Leaf>()
        container.children.forEach {
            if(it is Leaf){
                ret.add(it)
            } else {
                ret.addAll(allLeaves((it as Container)))
            }
        }
        return ret
    }

    private fun elaborateInlines(inlines: List<Inline>): String{
        return inlines.fold("", {acc, it -> "$acc${it.render()}\n"})
    }

    /* TODO: allow leaf to decide which inlines can be run on it, codeblocks and such still need
    *  TODO: their HTML reserved characters to be replaced this could be done in a variety of ways through input
    *  TODO: such as default inputs to functions that can be turned off
    *  TODO: or a list of types that can be done
    *   IM leaning towards first as custom blocks can easily use it then
    */

    /*
        The intent of this way of analyzing is to limit the passes through of the line, this will parse once to the end
        and that will be enough
        This is not only going to read once though as whenever an opener (i.e. < for autolinks) the parser will scan ahead
        to decide whether it is an autolink or not, the runtime is dependent on how many potential openers it has for html
        and autolinks
        otherwise one pass through should be sufficient
     */
    fun analyzeLine(inlines: List<Inline>,
                    softBreak: Boolean = true,
                    hardBreak: Boolean = true,
                    codeSpans: Boolean = true,
                    backslashEscape: Boolean = true,
                    autoLinks: Boolean = true): List<Inline> {
        // this will keep inlines in order of index on the string, this will require some fancy work to create the inlines successfully
        // I'm thinking a subString matcher on beginning and end then remaking all internal metadata with indexes shifted by start of outer container
        val inlineLocations: PriorityQueue<InlineMetaData> = PriorityQueue()

        // remove final \n
        val toParse = elaborateInlines(inlines).dropLast(1)
        val lexer = InlineLexer(toParse)

        while(!lexer.isEndOfLine()){
            val savedIndex = lexer.saveIndex()
            //softBreak and hardBreak
            when {
                lexer.inspect('\n') -> {

                    // try to match a lineBreak
                    val matched = lineBreaks(lexer, savedIndex, hardBreak, softBreak)
                    addInlineMetadata(matched, inlineLocations)
                    // reset state to where we were
                    lexer.goTo(savedIndex)
                }
                lexer.inspect('`') -> {
                    val matched = codeSpans(lexer, savedIndex, codeSpans)
                    addInlineMetadata(matched, inlineLocations)
                }
                lexer.inspect('\\') -> {
                    val matched = backslashEscape(lexer, savedIndex, backslashEscape)
                    addInlineMetadata(matched, inlineLocations)
                }
                lexer.inspect ('<') -> {
                    //this can be either HTML or autolink
                    //TODO autolink first, may do some preprocessing as both are concerned with things between brackets
                    val matchedAutoLink = autoLinks(lexer,savedIndex, autoLinks)
                    addInlineMetadata(matchedAutoLink, inlineLocations)
                    //TODO HTML

                }
                // next character
            }
            // next character
            lexer.advanceCharacter()
        }

        return createInlines(inlineLocations, toParse)
    }

    private fun createInlines(inlineMetaData: PriorityQueue<InlineMetaData>, line: String): List<Inline>{
        // so we can do some inspection on it without losing when we pop
        val list = inlineMetaData.toList()
        val inlines = mutableListOf<Inline>()
        // for simplicity until ones with internal inlines can be created none of these will have internals

        // an Inline String will need to be created if the current ending is less than the next start
        var currentEnd = 0
        list.forEach {
            if(currentEnd < it.start){
                inlines.add(InlineString(line.substring(currentEnd, it.start)))
            }
            // make the next inline
            inlines.add(createInline(it, line))
            currentEnd = it.end + 1
        }
        if(currentEnd != line.length){
            // add the final inlineString
            inlines.add(InlineString(line.substring(currentEnd)))
        }
        return inlines
    }

    private fun createInline(inlineMetaData: InlineMetaData, line: String): Inline{
        return when(inlineMetaData.type){
            InlineTypes.HARDBREAK -> HardBreak()
            InlineTypes.SOFTBREAK -> SoftBreak()
            InlineTypes.CODESPAN -> CodeSpan(line.substring(inlineMetaData.start, inlineMetaData.end))
            InlineTypes.BACKSLASH -> BackslashEscape(line[inlineMetaData.end])
            // + 1 to remove leading <
            InlineTypes.AUTOLINK -> AutoLink(line.substring(inlineMetaData.start + 1, inlineMetaData.end))
            else -> throw ParsingException("Unknown inline type ${inlineMetaData.type}")
        }
    }

    private fun addInlineMetadata(inlineMetaData: InlineMetaData, inlines: PriorityQueue<InlineMetaData>){
        if(inlineMetaData.type != InlineTypes.NONE){
            inlines.add(inlineMetaData)
        }
    }

    private fun lineBreaks(lexer: InlineLexer, savedIndex: Int, hardBreak: Boolean, softBreak: Boolean): InlineMetaData {
        if(hardBreak){
            // type one two or more spaces before \n
            val spaces = lexer.reverseWhile { it.isWhitespace() }
            // 2 as a newline is whitespace
            if(spaces > 2){
                // we have a hard line break from current index until savedIndex
                lexer.advanceCharacter()
                return InlineMetaData(lexer.saveIndex(), savedIndex, InlineTypes.HARDBREAK)
            }
            lexer.goTo(savedIndex)
            // type two a \ immediately before the \n
            lexer.goBackOne()
            if(lexer.inspect('\\')){
                return InlineMetaData(lexer.saveIndex(), savedIndex, InlineTypes.HARDBREAK)
            }
        }
        if(softBreak){
            // if it wasn't a hardbreak and we can do a softbreak than it must be a softbreak
            return InlineMetaData(savedIndex, savedIndex, InlineTypes.SOFTBREAK)
        }
        return InlineMetaData(savedIndex, savedIndex, InlineTypes.NONE)
    }
    /*
     A backtick string is a string of one or more backtick characters (`) that is neither preceded nor followed by a backtick.

A code span begins with a backtick string and ends with a backtick string of equal length.
 The contents of the code span are the characters between the two backtick strings, normalized in the following ways:


 First, line endings are converted to spaces.
If the resulting string both begins and ends with a space character, but does not consist entirely of space characters,
a single space character is removed from the front and back.
This allows you to include code that begins or ends with backtick characters, which must be separated by whitespace from the opening or closing backtick strings.
     */
    private fun codeSpans(lexer: InlineLexer, savedIndex: Int, codeSpans: Boolean): InlineMetaData {
        if(codeSpans){
            if(lexer.inspect('`') && !lexer.isEndOfLine()) {
                // our opening string of backticks
                val run = lexer.advanceWhile { it == '`' }
                // opening run was the end of the line
                if(lexer.isEndOfLine()){
                    //stops index out of bounds as analyzer always advances one
                    lexer.goBackOne()
                    return InlineMetaData(savedIndex, savedIndex, InlineTypes.NONE)
                }
                var closingRun: Int
                // get the correct closing run
                do {
                    lexer.advanceWhile { it != '`' }
                    closingRun = lexer.advanceWhile { it == '`' }
                }while(closingRun != run && !lexer.isEndOfLine())
                val addToEnd: Int
                addToEnd = if(lexer.isEndOfLine() && lexer.inspect { it == '`' }){
                    closingRun++
                    1
                } else {
                    0
                }
                //make sure we got the closing run and not end of line
                // note the end of the line could end with a code span so this is sufficient
                // it will fall to noneType if this if statement doesn't return
                if(closingRun == run){
                    lexer.goBackOne()
                    return InlineMetaData(savedIndex, lexer.saveIndex() + addToEnd, InlineTypes.CODESPAN)
                } else {
                    // we want to skip the run that was started, as to not double count the run with shorter length
                    lexer.goTo(savedIndex + run)
                }
            }
        }
        return InlineMetaData(savedIndex, savedIndex, InlineTypes.NONE)
    }

    private fun backslashEscape(lexer: InlineLexer, savedIndex: Int, backslashEscape: Boolean): InlineMetaData {
        if(backslashEscape){
            if(!lexer.isEndOfLine()){
                lexer.advanceCharacter(1)
                if(lexer.inspect { it in ESCAPABLE }){
                    return InlineMetaData(savedIndex, savedIndex + 1, InlineTypes.BACKSLASH)
                }
            }
        }
        // didn't match so return parser to where it was
        lexer.goTo(savedIndex)
        return InlineMetaData(savedIndex, savedIndex, InlineTypes.NONE)
    }

    private fun autoLinks(lexer: InlineLexer, savedIndex: Int, autoLinks: Boolean): InlineMetaData {
        if(autoLinks){
            //there is two types but both are between '<' '>' so start by getting the string in the middle
            if(lexer.inspect('<')){
                lexer.advanceWhile { it != '>' }
                // this check is because we may have gotten to the end of the line and not matched a '>'
                if(lexer.inspect { it == '>' }){
                    //the '>' was found so we may have a match
                    // remove leading and trailing <>
                    val subString = lexer.subString(savedIndex + 1, lexer.saveIndex())
                    if(subString.isEmpty()){
                        lexer.goTo(savedIndex)
                        return InlineMetaData(savedIndex, savedIndex, InlineTypes.NONE)
                    }

                    // check the two types: Link and Mail

                    // this will match type 1
                    val autoLinkURIMatcher = AutoLinkURIMatcher(subString)
                    // mail is just the regex in AutoLink
                    if(autoLinkURIMatcher.match() || EMAIL_REGEX.matchEntire(subString) != null){
                        return InlineMetaData(savedIndex, lexer.saveIndex(), InlineTypes.AUTOLINK)
                    }
                }
            }
        }
        // didn't match so return parser to where it was
        lexer.goTo(savedIndex)
        return InlineMetaData(savedIndex, savedIndex, InlineTypes.NONE)
    }
}