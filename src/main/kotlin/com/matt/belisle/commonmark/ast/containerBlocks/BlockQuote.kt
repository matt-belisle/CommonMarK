package com.matt.belisle.commonmark.ast.containerBlocks

import com.matt.belisle.commonmark.ast.Block
import com.matt.belisle.commonmark.ast.IStaticMatchableContainer
import com.matt.belisle.commonmark.ast.countLeadingSpaces
import com.matt.belisle.commonmark.ast.indentCheck

class BlockQuote(parent: Container) : Container(parent = parent) {

    // only call if matched
    override fun dropPrefix(line: String): String {
        assert(match(line))
        return dropMarker(line.trim())
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

        val trimmed = line.trim()

        if (trimmed.isNotEmpty()) {
            // we either directly match this blockquote
            return if (trimmed[0] == '>') {
                true
                //or we match lazily down lower, actions by parser are same regardless
            } else {
                lazyContinue(line)
            }
        }
        return false
    }

    companion object : IStaticMatchableContainer<BlockQuote> {

        override val canBeConsecutive: Boolean = false
        override val canInterruptParagraph: Boolean = true

        override fun match(line: String, currentOpenBlock: Block, indentation: Int): Boolean {

            /* A block quote marker consists of 0-3 spaces of initial indent,
            plus (a) the character > together with a following space,
            or (b) a single character > not followed by a space.
            */
            // just for matching, this is fine to just make indentCheck and check leadingChar is a '>'
            //single character no space

            val leadingSpaces = line.countLeadingSpaces()
            return line.isNotEmpty() && leadingSpaces < indentCheck(indentation) &&  line[leadingSpaces] == '>'
        }

        override fun parse(
            line: String,
            currentOpenBlock: Block,
            indentation: Int,
            parent: Container
        ): Pair<BlockQuote, String> {
            assert(match(line, currentOpenBlock, indentation))

            val trimmed = line.trimStart()
            return Pair(BlockQuote(parent), dropMarker(line.trim()))
        }


        fun dropMarker(line: String): String =
            if (line[0] == '>') line.drop(if (line.length > 1 && line[1] == ' ') 2 else 1) else line
    }
}