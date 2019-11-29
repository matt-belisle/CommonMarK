package com.matt.belisle.commonmark.ast.leafBlocks

import com.matt.belisle.commonmark.ast.Block
import com.matt.belisle.commonmark.ast.IParsable
import com.matt.belisle.commonmark.ast.IStaticMatchable
import com.matt.belisle.commonmark.ast.InlineElements.InlineString

// The paragraph block accepts any non empty line, as it is assumed if it would've matched any other block
// then it would have been matched before getting to a paragraph
// It removes leading spaces, and ends on a blank line / other block opening
// A paragraph block may also be interpreted as a setext heading if a line containging only - or = is encountered,
// his also closes the paragraph

//private as to only allow the parse function in companion to construct a block
class Paragraph private constructor(indentation: Int): Leaf(indentation = indentation){

    override val canLazyContinue: Boolean = true
    override val canBeConsecutive: Boolean = false
    var isSetext = false
    var setextLevel: Int = 0
    private constructor(line: String, indentation: Int) : this(indentation) {
        // remove leading and trailing spaces
        inline.add(InlineString(line))
    }

    // this is the match to continue a paragraph block
    override fun match(line: String): Boolean {
        return !super.match(line)|| line.isNotBlank()
    }

    override fun appendLine(line: String) {
        assert(match(line))
        val trimmed = line.trim()
        val (isSetext, setextChar) = isSetext(trimmed)
        if(isSetext) {
            this.close()
            setextLevel = if(setextChar == '=') 1 else 2
            this.isSetext = true
        }
        inline.add(InlineString(trimmed))
    }
    private fun isSetext(line: String): Pair<Boolean,Char>{
        var char = line[0]
        if(char != '-' || char != '=') return Pair(false, ' ')
        line.forEach {
            if(it != char) return Pair(false, ' ')
        }
        return Pair(true, char)
    }

    companion object: IStaticMatchable, IParsable<Paragraph>{

        override fun parse(line: String, currentOpenBlock: Block, indentation: Int): Paragraph {
            // must be able to match to parse the line
            assert(this.match(line, currentOpenBlock, indentation))
            //remove leading and trailing spaces and return a new paragraph
            return Paragraph(line.trim(), indentation)
        }

        // this will be the match to open a new paragraph block
        override fun match(line: String, currentOpenBlock: Block, indentation: Int): Boolean {
            return line.isNotBlank()
        }

    }
}