package com.matt.belisle.commonmark.ast.leafBlocks

import com.matt.belisle.commonmark.ast.*
import com.matt.belisle.commonmark.ast.containerBlocks.Container
import com.matt.belisle.commonmark.ast.inlineElements.InlineString
import java.lang.StringBuilder


class IndentedCodeBlock(indent: Int, parent: Container) : Leaf(indent = indent, parent = parent) {

    private var lastNonBlankLine: Int = -1

    override fun match(line: String): Boolean {
        return super.match(line) && (line.countLeadingSpaces() >= indentCheck(indent) || line.isBlank())
    }

    // add the line as is, removing the prefixed spaces
    override fun appendLine(line: String) {
        inline.add(InlineString(line.removeLeadingChar(' ', indentCheck(indent))))

        if(line.isNotBlank()){
            lastNonBlankLine = inline.size - 1
        }
    }
    private constructor(line:String, indent: Int, parent: Container):this(indent, parent){
        appendLine(line)
    }

    override fun render(): String {
        val builder = StringBuilder()
        with(builder) {
            append("<pre><code>")
            for (i in 0..lastNonBlankLine) {
                val inlineString = inline[i]
                append(inlineString.render())
//                if(inlineString != inline.last())
                append('\n')
            }
            append("</code></pre>\n")
        }
        return builder.toString()
    }

    companion object: IStaticMatchable<IndentedCodeBlock> {

        override val canLazyContinue: Boolean = false
        override val canBeConsecutive: Boolean = true
        override val canInterruptParagraph: Boolean = false

        override fun parse(line: String, currentOpenBlock: Block, indentation: Int, parent: Container): IndentedCodeBlock {
            // must be able to match to parse the line
            assert(this.match(line, currentOpenBlock, indentation))
            //remove leading and trailing spaces and return a new paragraph
            return IndentedCodeBlock(line, indentation, parent)
        }

        // this will be the match to open a new paragraph block
        override fun match(line: String, currentOpenBlock: Block, indentation: Int): Boolean {
            return  line.countLeadingSpaces() >= indentCheck(indentation) && line.isNotBlank()
        }

    }
}