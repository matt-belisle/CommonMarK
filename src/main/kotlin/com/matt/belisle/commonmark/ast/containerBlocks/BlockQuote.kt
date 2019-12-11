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
            // we either directly match this blockquote
            return trimmed[0] == '>'
                 //else {
//                lazyContinue(line)
//            }
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

            val leadingSpaces = line.countLeadingSpaces()
            return line.isNotBlank() && leadingSpaces < indentCheck(indentation) &&  line[leadingSpaces] == '>'
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


        fun dropMarker(line: String): String {
            val trimmed = line.trimStart()
            // if we can match a blockQuote marker then remove it, if not return the line as was
            return if (line.countLeadingSpaces() < 4 && trimmed[0] == '>') trimmed.drop(if (line.length > 1 && line[1] == ' ') 2 else 1) else line
        }
    }
}