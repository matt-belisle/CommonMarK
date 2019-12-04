package com.matt.belisle.commonmark.ast.leafBlocks

import com.matt.belisle.commonmark.ast.Block
import com.matt.belisle.commonmark.ast.IStaticMatchableLeaf
import com.matt.belisle.commonmark.ast.containerBlocks.Container
import com.matt.belisle.commonmark.ast.inlineElements.InlineString
import java.lang.Exception

// The paragraph block accepts any non empty line, as it is assumed if it would've matched any other block
// then it would have been matched before getting to a paragraph
// It removes leading spaces, and ends on a blank line / other block opening

//private as to only allow the parse function in companion to construct a block
class BlankLine private constructor(parent: Container, indent: Int) : Leaf(parent = parent, indent = indent) {

    override val canLazyContinue: Boolean = false

    private constructor(parent: Container) : this(parent = parent, indent = 0) {
        // no content in a blank line
        // blank line is always closed
        this.close()
    }

    override fun appendLine(line: String) {
        throw Exception("Tried to append a line to a blank block")
    }

    companion object : IStaticMatchableLeaf<BlankLine> {

        override val canBeConsecutive: Boolean = false
        override val canInterruptParagraph: Boolean = false

        override fun parse(line: String, currentOpenBlock: Block, indentation: Int, parent: Container): BlankLine {
            // must be able to match to parse the line
            assert(this.match(line, currentOpenBlock, indentation))
            //remove leading and trailing spaces and return a new paragraph
            return BlankLine(parent)
        }

        // this will be the match to open a new paragraph block
        override fun match(line: String, currentOpenBlock: Block, indentation: Int) = line.isBlank()

    }
}