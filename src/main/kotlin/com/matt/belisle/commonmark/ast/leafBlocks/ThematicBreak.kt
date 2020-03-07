package com.matt.belisle.commonmark.ast.leafBlocks

import com.matt.belisle.commonmark.ast.*
import com.matt.belisle.commonmark.ast.containerBlocks.Container
import com.matt.belisle.commonmark.ast.inlineElements.InlineString

class ThematicBreak private constructor(val thematicBreakChar: Char, parent: Container, indentation: Int) :
    Leaf(parent, indentation) {

    //cannot append anything to a thematic break so this will throw an error
    override fun appendLine(line: String) {
        throw Exception("Cannot append a line to a Thematic Break")

    }


    private constructor(line: String, thematicBreakChar: Char, indentation: Int, parent: Container) : this(
        thematicBreakChar,
        parent,
        indentation
    ) {
        this.inline.add(InlineString(line))
    }

    override fun match(line: String): Boolean {
        // this block cannot be continued so it will never match with a following line
        return false
    }

    override fun render(): String {
        return "<hr />\n"
    }

    companion object : IStaticMatchableLeaf<ThematicBreak> {

        override val canInterruptParagraph: Boolean = true

        override fun parse(line: String, currentOpenBlock: Block, indentation: Int, parent: Container): ThematicBreak {
            assert(match(line, currentOpenBlock, indentation))
            val (char, _) = getThematicCharacter(line)
            // since asserting match this is safe
            return ThematicBreak(line, char!!, indentation, parent)
        }

        override fun match(line: String, currentOpenBlock: Block, indentation: Int): Boolean {
            val (thematicChar, match, count) = getThematicCharacter(line)
            // last check should be taken as a setext
            return line.countLeadingSpaces().first < indentCheck(indentation) && match && !(currentOpenBlock is Paragraph && thematicChar == '-' && line.trim().length == count)
        }

        // iterates through the line and gets the character that the thematic break uses , '-' '_' '*'
        private fun getThematicCharacter(line: String): Triple<Char?, Boolean, Int> {
            var char: Char? = null
            var count = 0
            line.forEach {
                if (it.isWhitespace()) {
                    // no op spaces are fine
                } else if (it != char) {
                    if (char != null || (it != '_' && it != '-' && it != '*')) {
                        return Triple(null, false, 0)
                    } else {
                        char = it
                        count++
                    }
                } else if (it == char) {
                    count++
                }
            }
            return Triple(char, count > 2, count)
        }
    }


}