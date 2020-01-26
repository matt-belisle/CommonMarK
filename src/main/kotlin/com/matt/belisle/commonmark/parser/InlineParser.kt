package com.matt.belisle.commonmark.parser

import com.matt.belisle.commonmark.ast.Document
import com.matt.belisle.commonmark.ast.containerBlocks.Container
import com.matt.belisle.commonmark.ast.inlineElements.*
import com.matt.belisle.commonmark.ast.leafBlocks.Leaf
import com.matt.belisle.commonmark.parser.inlineParsingUtil.*
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
    // this is a lot of the CPU time
    private fun elaborateInlines(inlines: List<Inline>): String{
        //should be only called on lists of inlineStrings
        return (inlines[0] as InlineString).strBuilder.toString()
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
                    autoLinks: Boolean = true,
                    html: Boolean = true, delimiters: List<Emphasis<*>> = listOf(EmphasisUnderscore.Companion, EmphasisAsterisk.Companion)): List<Inline> {
        // this will keep inlines in order of index on the string, this will require some fancy work to create the inlines successfully
        // I'm thinking a subString matcher on beginning and end then remaking all internal metadata with indexes shifted by start of outer container
        val inlineLocations: PriorityQueue<InlineMetaData> = PriorityQueue()

        // get map of character to emphasis run, emphasis should not be ran is delimiters is empty
        val emphasis = delimiters.isNotEmpty()

        val runCreators: MutableMap<Char, (Int, Char, Char, Int) -> Run> = mutableMapOf()
        for(item in delimiters){
            runCreators[item.delimiter] = item::makeRun
        }
        val validDelimiters = runCreators.keys
        val emphasisRuns = DelimiterLinkedList<Run>()

        val toParse = elaborateInlines(inlines)
        val lexer = InlineLexer(toParse)

        while(!lexer.isEndOfLine()){
            inspectCharacter(
                lexer,
                hardBreak,
                softBreak,
                inlineLocations,
                codeSpans,
                backslashEscape,
                autoLinks,
                html,
                validDelimiters,
                runCreators,
                emphasisRuns
            )
            // next character
            lexer.advanceCharacter()
        }
        // final character missed by above loop, but the final character may have been used by the final inline
        val lastInlinesEnd = if(inlineLocations.isNotEmpty()) inlineLocations.last().end else -1
        if(lexer.saveIndex() == lexer.line.length - 1 && lastInlinesEnd < lexer.saveIndex()){
            inspectCharacter(
                lexer,
                hardBreak,
                softBreak,
                inlineLocations,
                codeSpans,
                backslashEscape,
                autoLinks,
                html,
                validDelimiters,
                runCreators,
                emphasisRuns
            )
        }
        //process emphasis as we know where the runs are, this is why the inline metadata needs to be priority queue
        processEmphasis(emphasisRuns, lexer, null, inlineLocations)
        return createInlines(inlineLocations, toParse, delimiters)
    }

    private fun inspectCharacter(
        lexer: InlineLexer,
        hardBreak: Boolean,
        softBreak: Boolean,
        inlineLocations: PriorityQueue<InlineMetaData>,
        codeSpans: Boolean,
        backslashEscape: Boolean,
        autoLinks: Boolean,
        html: Boolean,
        validDelimiters: MutableSet<Char>,
        runCreators: MutableMap<Char, (Int, Char, Char, Int) -> Run>,
        emphasisRuns: DelimiterLinkedList<Run>
    ) {
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
            lexer.inspect('<') -> {
                //this can be either HTML or autolink
                val matchedAutoLink = autoLinks(lexer, savedIndex, autoLinks)
                addInlineMetadata(matchedAutoLink, inlineLocations)

                if (matchedAutoLink.type == InlineTypes.NONE) {
                    val matchedHTML = html(lexer, "", savedIndex, html)
                    addInlineMetadata(matchedHTML, inlineLocations)
                }
            }
            lexer.inspect { validDelimiters.contains(it) } -> {
                val startingIndex = lexer.saveIndex()
                val char = lexer.getChar()
                val precedingChar = lexer.getChar(startingIndex - 1)
                var lengthOfRun = lexer.advanceWhile { it == char }
                val followingCharacter = lexer.getChar(lexer.saveIndex())
                // wouldn't be in here if this didnt exist, so this is a safe call
                val run = runCreators[char]!!.invoke(lengthOfRun, precedingChar, followingCharacter, startingIndex)
                if (run.runType != RunType.NONE) {
                    emphasisRuns.addAtTail(run)
                }
                // stops double counting of the last character as these are not put into inlineMetadata yet
                if(!lexer.isEndOfLine()) {
                    lexer.goBackOne()
                }
            }
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
                return InlineMetaData(lexer.saveIndex(), savedIndex, InlineTypes.HARD_BREAK)
            }
            lexer.goTo(savedIndex)
            // type two a \ immediately before the \n
            lexer.goBackOne()
            if(lexer.inspect('\\')){
                return InlineMetaData(lexer.saveIndex(), savedIndex, InlineTypes.HARD_BREAK)
            }
        }
        if(softBreak){
            // if it wasn't a hardbreak and we can do a softbreak than it must be a softbreak
            return InlineMetaData(savedIndex, savedIndex, InlineTypes.SOFT_BREAK)
        }
        return InlineMetaData(savedIndex, savedIndex, InlineTypes.NONE)
    }

    private fun codeSpans(lexer: InlineLexer, savedIndex: Int, codeSpans: Boolean): InlineMetaData {
        /*
            A backtick string is a string of one or more backtick characters (`) that is neither preceded nor followed by a backtick.

            A code span begins with a backtick string and ends with a backtick string of equal length.
            The contents of the code span are the characters between the two backtick strings, normalized in the following ways:


            First, line endings are converted to spaces.
            If the resulting string both begins and ends with a space character, but does not consist entirely of space characters,
            a single space character is removed from the front and back.
            This allows you to include code that begins or ends with backtick characters, which must be separated by whitespace from the opening or closing backtick strings.
        */
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
                    return InlineMetaData(savedIndex, lexer.saveIndex() + addToEnd, InlineTypes.CODE_SPAN)
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
                        return InlineMetaData(savedIndex, lexer.saveIndex(), InlineTypes.AUTO_LINK)
                    }
                }
            }
        }
        // didn't match so return parser to where it was
        lexer.goTo(savedIndex)
        return InlineMetaData(savedIndex, savedIndex, InlineTypes.NONE)
    }

    private fun html(lexer: InlineLexer, line: String, savedIndex: Int, html: Boolean): InlineMetaData{
        if(html){
            val htmlMatcher = HTMLMatcher(lexer.subString(savedIndex))
            val (matched, newIndex) = htmlMatcher.startsWithMatch()
            if(matched){
                lexer.goTo(savedIndex + newIndex - 1)
                return InlineMetaData(savedIndex, savedIndex + newIndex, InlineTypes.RAW_HTML)
            }
            lexer.goTo(savedIndex)
            val falseReturn = InlineMetaData(savedIndex, savedIndex, InlineTypes.NONE)

        }
        return InlineMetaData(savedIndex, savedIndex, InlineTypes.NONE)
    }

    private fun processEmphasis(runs: DelimiterLinkedList<Run>, lexer: InlineLexer, stackBottom: Node<Run>?, inlineMetaData: PriorityQueue<InlineMetaData>){
        var currentPosition = if(stackBottom == null) runs.head else stackBottom.next
        while(currentPosition != null){
            if(currentPosition.element.canClose()){
                //look back for a potential opener
                val closingRun = currentPosition.element
                var lookBack = currentPosition.prev
                while(lookBack != null && lookBack != stackBottom && !(lookBack.element.canOpen() && lookBack.element.delimiter == closingRun.delimiter)){
                    lookBack = lookBack.prev
                }
                //if lookBack is either null or stackBottom we did not find an opener
                // if it is neither of those we can safely say we found our opener
                if(lookBack != null && lookBack != stackBottom){
                    val openingRun = lookBack.element
                    val openLength = openingRun.length
                    val closeLength = closingRun.length
                    /*
                     the condition that a delimiter that can both open and close
                     cannot form emphasis if the sum of the lengths of the delimiter runs containing the
                     opening and closing delimiters is a multiple of 3 unless both lengths are multiples of 3.
                     */
                    if((closeLength + openLength) % 3 == 0){
                        if(closeLength % 3 == 0 && openLength % 3 == 0){
                            // we can make one
                            openEmphasis(lookBack, currentPosition, inlineMetaData, runs)
                        } else{
                            // we cannot make one so this one is not the opener for this one
                        }
                    } else {
                        // the multiple clause is gone so we can form one
                       openEmphasis(lookBack, currentPosition, inlineMetaData, runs)
                    }
                }
            }
            currentPosition = currentPosition.next
            while(currentPosition != null && !currentPosition.element.canClose()){
                currentPosition = currentPosition.next
            }
        }
    }
}

private fun openEmphasis(openingNode: Node<Run>, closingNode: Node<Run>, inlineMetaData: PriorityQueue<InlineMetaData>, runs: DelimiterLinkedList<Run>) {
    val openLength = openingNode.element.length
    val closeLength = closingNode.element.length
    val openingRun = openingNode.element
    val closingRun = closingNode.element
    if(openLength >= 2 && closeLength >=  2){
        // strong emphasis
        shortenAndRemoveRun(2, openingNode, closingNode, runs)
        inlineMetaData.add(InlineMetaData(openingRun.indexAfterRun, closingRun.startingIndex,InlineTypes.STRONG_EMPHASIS, closingRun.delimiter))
    } else {
        // weak emphasis
        shortenAndRemoveRun(1, openingNode, closingNode, runs)
        inlineMetaData.add(InlineMetaData(openingRun.indexAfterRun, closingRun.startingIndex,InlineTypes.WEAK_EMPHASIS, closingRun.delimiter))
    }
}

private fun shortenAndRemoveRun(amountToRemove: Int, openingNode: Node<Run>, closingNode: Node<Run>, runs: DelimiterLinkedList<Run>){
    val openingRun = openingNode.element
    val closingRun = closingNode.element
    openingRun.length -= amountToRemove
    if(openingRun.length == 0){
        //remove it, this will be used later, the node still will have its old prev and next so its okay
        runs.remove(closingNode)
    }
    closingRun.length -= amountToRemove
    if(closingRun.length == 0){
        //remove it
        runs.remove(openingNode)
    }
}

fun createInlines(inlineMetaData: PriorityQueue<InlineMetaData>, line: String, delimiters: List<Emphasis<*>> = emptyList()): List<Inline>{
    // so we can do some inspection on it without losing when we pop
    val list = inlineMetaData.toList().sorted()
    val inlines = mutableListOf<Inline>()
    // I believe the only container Inline is emphasis (that is parsed at first pass, link titles and such will be parsed again)
    // for simplicity until ones with internal inlines can be created none of these will have internals

    // an Inline String will need to be created if the current ending is less than the next start
    var currentEnd = 0
    var i : Int = 0
    while(i < list.size){
        val it = list[i]
        if(currentEnd < it.start){
            inlines.add(InlineString(line.substring(currentEnd, it.start)))
        }
        // make the next inline
        if(it.type == InlineTypes.STRONG_EMPHASIS || it.type == InlineTypes.WEAK_EMPHASIS){
            val embedded: MutableList<InlineMetaData> = mutableListOf()
            i++
            while(i < list.size && list[i].end < it.end){
                embedded.add(list[i])
                // normalize for recursive call
                list[i].start -=it.start+1
                list[i].end -= it.start+1
                i++
            }
            val embeddedInlines = createInlines(PriorityQueue(embedded), line.substring(it.start + 1, it.end), delimiters)

            it.extra = Pair(it.extra, embeddedInlines)
            i--
        }
        inlines.add(createInline(it, line, delimiters))
        i++
        currentEnd = it.end + 1
    }
    if(currentEnd != line.length){
        // add the final inlineString
        inlines.add(InlineString(line.substring(currentEnd)))
    }
    return inlines
}

fun createInline(inlineMetaData: InlineMetaData, line: String, delimiters: List<Emphasis<*>>): Inline{
    return when(inlineMetaData.type){
        InlineTypes.HARD_BREAK -> HardBreak()
        InlineTypes.SOFT_BREAK -> SoftBreak()
        InlineTypes.CODE_SPAN -> CodeSpan(line.substring(inlineMetaData.start, inlineMetaData.end))
        InlineTypes.BACKSLASH -> BackslashEscape(line[inlineMetaData.end])
        // + 1 to remove leading <
        InlineTypes.AUTO_LINK -> AutoLink(line.substring(inlineMetaData.start + 1, inlineMetaData.end))
        InlineTypes.RAW_HTML -> RawHTML(line.substring(inlineMetaData.start,inlineMetaData.end + 1))
        InlineTypes.ENTITY -> InlineEntity(inlineMetaData.extra as Entity)
        InlineTypes.STRONG_EMPHASIS -> createEmphasis(inlineMetaData, delimiters)
        InlineTypes.WEAK_EMPHASIS -> createEmphasis(inlineMetaData, delimiters)
        else -> throw ParsingException("Unknown inline type ${inlineMetaData.type}")
    }
}

fun createEmphasis(inlineMetaData: InlineMetaData, delimiters: List<Emphasis<*>>): Inline{
    val extraData: Pair<Char, List<Inline>> = inlineMetaData.extra as Pair<Char, List<Inline>>
    // since emphasis have their inlines already made line is unnecessary
    val type: Emphasis<*> = delimiters.find { it.delimiter == extraData.first }!!
    return type.createEmphasis(extraData.second, inlineMetaData.type == InlineTypes.STRONG_EMPHASIS) as Inline

}