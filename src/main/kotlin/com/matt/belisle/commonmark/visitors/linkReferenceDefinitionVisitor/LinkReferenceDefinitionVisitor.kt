package com.matt.belisle.commonmark.visitors.linkReferenceDefinitionVisitor

import CodeFence
import com.matt.belisle.commonmark.ast.Block
import com.matt.belisle.commonmark.ast.Document
import com.matt.belisle.commonmark.ast.containerBlocks.BlockQuote
import com.matt.belisle.commonmark.ast.containerBlocks.ListContainer
import com.matt.belisle.commonmark.ast.containerBlocks.ListItem
import com.matt.belisle.commonmark.ast.inlineElements.InlineString
import com.matt.belisle.commonmark.ast.leafBlocks.*
import com.matt.belisle.commonmark.parser.inlineParsingUtil.Escaping
import com.matt.belisle.commonmark.parser.inlineParsingUtil.InlineLexer
import com.matt.belisle.commonmark.visitors.PostOrderTraversalVisitor
import java.lang.StringBuilder
import java.util.*

// since LRDs are very difficult to determine before all lines are known, and the rules
// lend themselves to being only in a paragraph (no blank lines must start with [ etc)
// this visitor will create LRDs from paragraphs
class LinkReferenceDefinitionVisitor : PostOrderTraversalVisitor() {
    // This visitor is special, in links must be stored somewhere to use ahead, so it
    // will contain a map to get the link data
    val linkReferences: MutableMap<String, LinkReferenceDefinition> = mutableMapOf()
    override fun visit(atxHeading: ATXHeading): List<Block> {
        return listOf(atxHeading)
    }

    override fun visit(blankLine: BlankLine): List<Block> {
        return listOf(blankLine)
    }

    override fun visit(indentedCodeBlock: IndentedCodeBlock): List<Block> {
        return listOf(indentedCodeBlock)
    }
    /*
    * A link reference definition consists of a link label,
    *  indented up to three spaces, followed by a colon (:),
    * optional whitespace (including up to one line ending),
    *  a link destination,
    *  optional whitespace (including up to one line ending),
    * and an optional link title, which if it is present must be separated from the link destination by whitespace.
    * No further non-whitespace characters may occur on the line.
    * */
    override fun visit(paragraph: Paragraph): List<Block> {
        // since in a paragraph the indentation is accounted for
        val paragraphsStrBuilder = (paragraph.inline[0] as InlineString).strBuilder
        val line = paragraphsStrBuilder.toString()
        // goal is to keep trying for linkReferenceDefinitions until
        // 1. there is not a valid LRD
        // 2. the paragraph is empty
        val lexer = InlineLexer(line)
        lexer.advanceWhile { it.isWhitespace() }
        val (isLabel, label) = linkLabel(lexer)
        if(!isLabel){
            return listOf(paragraph)
        }
        if(!lexer.inspect(':')){
            return listOf(paragraph)
        }
        lexer.advanceCharacter()
        lexer.skipSpacesMaximumNewLines(1)

        val (isDestination, destination) = linkDestination(lexer)
        // may not have a title, this allows us to go back to check for more LRDs
        if(!isDestination){
            return listOf(paragraph)
        }
        // non optional space, this MUST BE THE END or else it isnt an LRD
        if(!lexer.inspect { it.isWhitespace() || it == '\n' } && !lexer.isEndOfData() ){
            return listOf(paragraph)
        }
        lexer.advanceWhile { it != '\n' && it.isWhitespace() }
        // title is optional
        if(lexer.isEndOfData()){
            addLinkReference(label.toLowerCase(), destination)
            // the paragraph isnt technically empty if it has a setext line
            if(paragraph.isSetext){
                paragraphsStrBuilder.clear()
                paragraphsStrBuilder.append(paragraph.setextLine)
                paragraph.isSetext = false
                paragraph.setextLine = ""
                return listOf(paragraph)
            }
            return emptyList()
        }
        // optionally skip one new line
        val skippedBetweenDestAndTitle = lexer.skipSpacesMaximumNewLines(1)
        val preTitleIndex =  lexer.saveIndex()
        val endOfDestination = lexer.saveIndex()
        var (isTitle, title, wasData) = linkTitle(lexer)

        if(isTitle){
            // if the title was not the end of the current line
            // it should not match
            //advance past the final char in title

            lexer.advanceCharacter()
            if(!lexer.isEndOfData()) {
                while (!lexer.isEndOfData()) {
                    if (lexer.inspect('\n')) {
                        break
                    } else if (!lexer.inspectWhitespace()) {
                        // there was a character after the title so not an LRD unless...
                        // it was on a new line; then the title was actually omitted see test 179
                        if(skippedBetweenDestAndTitle == 0) {
                            return listOf(paragraph)
                        } else {
                            // since the next line could have been a title there won't be any more LRDs
                            addLinkReference(label,Escaping.unescapeString(destination),Escaping.unescapeString(title))
                            paragraphsStrBuilder.clear()
                            paragraphsStrBuilder.append(line.substring(preTitleIndex))
                            return listOf(paragraph)
                            break
                        }
                    }
                    lexer.advanceCharacter()
                }
                if (!lexer.inspect { it.isWhitespace() }) {
                    return listOf(paragraph)
                }
            }
            addLinkReference(label,Escaping.unescapeString(destination),Escaping.unescapeString(title))
            return if(lexer.isEndOfData()){
                emptyList()
            } else{
                // advance to the end of the current line
                lexer.skipSpacesMaximumNewLines(1)
                paragraphsStrBuilder.clear()
                paragraphsStrBuilder.append(line.substring(lexer.saveIndex()))
                // see if we can get another LRD right after
                visit(paragraph)
            }
        } else if(!wasData){
            addLinkReference(label,destination)
            paragraphsStrBuilder.clear()
            paragraphsStrBuilder.append(line.substring(endOfDestination))
            return visit(paragraph)
        } else {
            return listOf(paragraph)
        }
    }

    private fun addLinkReference(label: String, destination: String, title: String = "") {
        //normalize the label
        val normalized = Escaping.normalizeLabelContent(label)
        if (!linkReferences.containsKey(normalized)) {
            // empty title, add the valid LRD to the map and this is a terminal ending as the input is done
            linkReferences[normalized] = LinkReferenceDefinition(destination, title)
        }
    }

    override fun visit(thematicBreak: ThematicBreak): List<Block> {
        return listOf(thematicBreak)
    }

    override fun visit(htmlBlock: HTMLBlock): List<Block> {
        return listOf(htmlBlock)
    }

    override fun visit(codeFence: CodeFence): List<Block> {
        return listOf(codeFence)
    }

    override fun visit(listItems: ListItem): List<Block> {
       return listOf(listItems)
    }

    override fun visit(document: Document): List<Block> {
        return listOf(document)
    }

    override fun visit(blockQuote: BlockQuote): List<Block> {
        return listOf(blockQuote)
    }

    override fun visit(listContainer: ListContainer): List<Block> {
        return listOf(listContainer)
    }
    // will return whether it contains a valid link label, as well as the corresponding label
    private fun linkLabel(lexer: InlineLexer): Pair<Boolean, String>{
        val falseReturn = Pair(false, "")
        val builder = StringBuilder()
        if(!lexer.inspect('[')){
            return falseReturn
        }
        lexer.advanceCharacter()
        while(!lexer.isEndOfData()){
            builder.append(lexer.returnMatchedWhile { it != ']'  && it != '['})
            // first check whether it was escaped or not
            val char = lexer.getChar()
            if(char == '['){
                if(!Escaping.escapedBracket(lexer)){
                    return falseReturn
                } else {
                    builder.append('[')
                }
            } else if(char == ']'){
                if(!Escaping.escapedBracket(lexer)){
                    lexer.advanceCharacter()
                    val label = builder.toString()
                    if(label.length > 999 || label.isBlank()){
                        return falseReturn
                    }
                    return Pair(true, label)
                } else {
                    builder.append(']')
                }
            }
            lexer.advanceCharacter()
        }
        return falseReturn
    }

    private fun linkDestination(lexer:InlineLexer): Pair<Boolean, String> {
        return if(lexer.inspect('<')) bracketedDestination(lexer) else rawDestination(lexer)
    }

    /*
    a sequence of zero or more characters between an opening < and a closing >
    that contains no line breaks or unescaped < or > characters, or
     */
    private fun bracketedDestination(lexer:InlineLexer): Pair<Boolean, String>{
        val falseReturn = Pair(false, "")
        val builder = StringBuilder()
        // skip the bracket, will be checked in linkDestination
        lexer.advanceCharacter()
        while(!lexer.isEndOfData()){
            // first check whether it was escaped or not
            val char = lexer.getChar()
            lexer.advanceCharacter()
            if(char == '<'){
                if(!Escaping.escapedBracket(lexer)){
                    return falseReturn
                }
            } else if(char == '>'){
                if(!Escaping.escapedBracket(lexer)){
                    return Pair(true, builder.toString())
                }
            } else if(char == '\n'){
                return falseReturn
            }
            builder.append(char)
        }
        // trailing '>' to end the paragraph
        if(lexer.inspect { it == '>' }){
            return Pair(true, builder.toString())
        }
        // reached EOI without matching the bracket
        return falseReturn
    }
    /*
    a nonempty sequence of characters that does not start with <, does not include ASCII space or control characters,
    and includes parentheses only if (a) they are backslash-escaped or (b) they are part of a balanced pair of
    unescaped parentheses.
    (Implementations may impose limits on parentheses nesting to avoid performance issues,
    but at least three levels of nesting should be supported.)
     */
    private fun rawDestination(lexer: InlineLexer): Pair<Boolean, String> {
        val falseReturn = Pair(false, "")
        val builder = StringBuilder()
        // ( will add to stack, ) will pop, if when ending the destination this is not empty
        // then we return false
        // or if when ) it is empty we return false
        val brackets = Stack<Char>()
        while(!lexer.isEndOfData()){
            val char = lexer.getChar()
            lexer.advanceCharacter()
            if(char == ' ' || char == '\n'){
                return if(brackets.isEmpty()){
                    lexer.goBackOne()
                    Pair(true, builder.toString())
                } else {
                    falseReturn
                }
            } else if(char == '('){
                if(!Escaping.escapedBracket(lexer)){
                    brackets.push(char)
                }
            } else if(char == ')'){
                if(!Escaping.escapedBracket(lexer)){
                    if(brackets.isEmpty()){
                        return falseReturn
                    } else{
                        brackets.pop()
                    }
                }
            }

            builder.append(char)
        }
        //EOL may need to add final character if not whitespace
        if(!lexer.inspect { it.isWhitespace() }) builder.append(lexer.getChar())
        // this can end the line
        return Pair(true, builder.toString())
    }
    /*
    a sequence of zero or more characters between straight double-quote characters ("), including a " character only if it is backslash-escaped, or

    a sequence of zero or more characters between straight single-quote characters ('), including a ' character only if it is backslash-escaped, or

    a sequence of zero or more characters between matching parentheses ((...)), including a ( or ) character only if it is backslash-escaped.
    No BLANK LINES
     */
    private fun linkTitle(lexer: InlineLexer): Triple<Boolean, String, Boolean>{
        val falseReturn = Triple(false, "", false)
        val builder = StringBuilder()
        val closer = when(lexer.getChar()){
            '"' -> '"'
            '\'' -> '\''
            '(' -> ')'
            else -> return falseReturn
        }
        lexer.advanceCharacter()
        while(!lexer.isEndOfData()){
            val char = lexer.getChar()
            if(char == closer){
                if(!Escaping.escapedBracket(lexer)){
                    return Triple(true, builder.toString(), true)
                }
            } else if(char == '(' && closer == ')'){
                if(!Escaping.escapedBracket(lexer)){
                    return Triple(false, "", true)
                }
            }
            lexer.advanceCharacter()
            builder.append(char)
        }


        if(lexer.inspect { it == closer }){
            return Triple(true, builder.toString(), true)
        }
        return Triple(false,"",true)
    }

}