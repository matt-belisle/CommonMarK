package com.matt.belisle.commonmark.ast.containerBlocks

import com.matt.belisle.commonmark.ast.Block
import com.matt.belisle.commonmark.ast.IStaticMatchableContainer
import com.matt.belisle.commonmark.ast.countLeadingSpaces
import com.matt.belisle.commonmark.ast.indentCheck

class BlockQuote(parent: Container, indent: Int) : Container(parent = parent, indent = indent) {

    // only call if matched
    override fun dropPrefix(line: String): String {
        return dropMarker(line)
    }


    override fun render(): String {
        val builder = StringBuilder()
        with(builder){
            append("<blockquote>\n")
            children.forEach { append(it.render()) }
            append("</blockquote>\n")
        }
        return builder.toString()
    }


    override fun match(line: String): Boolean {
        if (!super.match(line)) {
            // open check
            return false
        }

        val trimmed = line.trimStart()

        if (trimmed.isNotEmpty()) {
            return trimmed[0] == '>'
        }
        return false
    }

    companion object : IStaticMatchableContainer<BlockQuote> {

        override val canInterruptParagraph: Boolean = true

        override fun match(line: String, currentOpenBlock: Block, indentation: Int): Boolean {

            /* A block quote marker consists of 0-3 spaces of initial indent,
            plus (a) the character > together with a following space,
            or (b) a single character > not followed by a space.
            */
            // just for matching, this is fine to just make indentCheck and check leadingChar is a '>'
            //single character no space

            val (leadingSpaces, endOfSpaces) = line.countLeadingSpaces()
            return line.isNotBlank() && leadingSpaces < indentCheck(indentation) &&  line[endOfSpaces] == '>'
        }

        override fun parse(
            line: String,
            currentOpenBlock: Block,
            indentation: Int,
            parent: Container
        ): Pair<BlockQuote, String> {
            assert(match(line, currentOpenBlock, indentation))
            // pass indentation through as blockquotes don't add any indent level
            return Pair(BlockQuote(parent, indentation), dropMarker(line.trimStart()))
        }

    //TODO tab needs to be expanded here
        fun dropMarker(line: String): String {
            val trimmed = expandSpacesPastMarker(line.trimStart())
            // if we can match a blockQuote marker then remove it, if not return the line as was
            return if (line.countLeadingSpaces().first < 4 && trimmed[0] == '>') trimmed.drop(if (trimmed.length > 1 && trimmed[1] == ' ') 2 else 1) else line
        }

        //assumes a line in the format >\s...
        private fun expandSpacesPastMarker(str: String): String {
            if(str.length < 2) return str
            if(str[1] == ' ') return str
            else if(str[1].isWhitespace()){
                //expand all tabs into spaces until first char
                //insert space to create correct tab stop
                val droppedMarker = str.drop(1)
                val (leadingSpaces, leadingSpaceIndex) = droppedMarker.prependIndent(" ").countLeadingSpaces()
                val builder = StringBuilder()
                builder.append(">")
                builder.append(" ".repeat(leadingSpaces - 1))
                builder.append(droppedMarker.substring(leadingSpaceIndex - 1))
                return builder.toString()
            }
            return str
        }
    }

}