package com.matt.belisle.commonmark.ast.leafBlocks

import com.matt.belisle.commonmark.ast.Block
import com.matt.belisle.commonmark.ast.IParsable
import com.matt.belisle.commonmark.ast.IStaticMatchable
import com.matt.belisle.commonmark.ast.InlineElements.InlineString

// The paragraph block accepts any non empty line, as it is assumed if it would've matched any other block
// then it would have been matched before getting to a paragraph
// It removes leading spaces, and ends on a blank line / other block opening

//private as to only allow the parse function in companion to construct a block
class BlankLine private constructor(indentation: Int): Leaf(indentation = indentation){

    override val canLazyContinue: Boolean = false
    override val canBeConsecutive: Boolean = false

    private constructor() : this(0) {
        // no content in a blank line
        // blank line is always closed
        this.close()
    }


    override fun match(line: String): Boolean {
        return !super.match(line)
    }

    override fun appendLine(line: String) {
        assert(match(line))
        inline.add(InlineString(line.trim()))
    }

    companion object: IStaticMatchable, IParsable<BlankLine>{

        override fun parse(line: String, currentOpenBlock: Block, indentation: Int): BlankLine {
            // must be able to match to parse the line
            assert(this.match(line, currentOpenBlock, indentation))
            //remove leading and trailing spaces and return a new paragraph
            return BlankLine()
        }

        // this will be the match to open a new paragraph block
        override fun match(line: String, currentOpenBlock: Block, indentation: Int) = line.isBlank()

    }
}