package com.matt.belisle.commonmark.ast.leafBlocks

import com.matt.belisle.commonmark.ast.IMatchable
import com.matt.belisle.commonmark.ast.IParsable
import com.matt.belisle.commonmark.ast.InlineElements.InlineString

// The paragraph block accepts any non empty line, as it is assumed if it would've matched any other block
// then it would have been matched before getting to a paragraph
// It removes leading spaces, and ends on a blank line / other block opening

//private as to only allow the parse function in companion to construct a block
class Paragraph private constructor(): Leaf(){

    override val canLazyContinue: Boolean = true
    override val canBeConsecutive: Boolean = false

    private constructor(line: String) : this() {
        // remove leading and trailing spaces
        inline.add(InlineString(line))
    }

    // this is the match to continue a paragraph block
    override fun match(line: String): Boolean {
        return !super.match(line)|| line.isNotBlank()
    }

    override fun appendLine(line: String) {
        assert(match(line))
        inline.add(InlineString(line.trim()))
    }

    companion object: IMatchable, IParsable<Paragraph>{

        override fun parse(line: String): Paragraph {
            // must be able to match to parse the line
            assert(this.match(line))
            //remove leading and trailing spaces and return a new paragraph
            return Paragraph(line.trim())
        }

        // this will be the match to open a new paragraph block
        override fun match(line: String): Boolean {
            return line.isNotBlank()
        }

    }
}