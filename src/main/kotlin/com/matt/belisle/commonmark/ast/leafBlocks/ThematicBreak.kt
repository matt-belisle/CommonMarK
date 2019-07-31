package com.matt.belisle.commonmark.ast.leafBlocks

import com.matt.belisle.commonmark.ast.*
import com.matt.belisle.commonmark.ast.InlineElements.InlineString

class ThematicBreak private constructor(val thematicBreakChar: Char, indentation: Int) : Leaf(indentation) {
    override val canBeConsecutive: Boolean = true
    override val canLazyContinue: Boolean = false

    //cannot append anything to a thematic break so this will throw an error
    override fun appendLine(line: String) {
        throw Exception("Cannot append a line to a Thematic Break")

    }


    private constructor(line: String, thematicBreakChar: Char, indentation: Int) : this(thematicBreakChar, indentation) {
        this.inline.add(InlineString(line))
    }

    override fun match(line: String): Boolean {
        // this block cannot be continued so it will never match with a following line
        return false
    }

    companion object : IStaticMatchable, IParsable<ThematicBreak> {
        override fun parse(line: String, currentOpenBlock: Block, indentation: Int): ThematicBreak {
            assert(match(line, currentOpenBlock, indentation))
            val (char, _) = getThematicCharacter(line)
            // since asserting match this is safe
            return ThematicBreak(line, char!!, indentation)
        }

        override fun match(line: String,currentOpenBlock: Block, indentation: Int): Boolean {
            return line.countLeadingSpaces() < indentCheck(indentation) && getThematicCharacter(line).second
        }

        // iterates through the line and gets the character that the thematic break uses , '-' '_' '*'
        private fun getThematicCharacter(line: String): Pair<Char?, Boolean> {
            var char: Char? = null
            var count = 0
            line.forEach {
                if (it == ' ') {
                    // no op spaces are fine
                } else if (it != char) {
                    if (char != null || (it != '_' && it != '-' && it != '*')) {
                        return Pair(null, false)
                    } else {
                        char = it
                        count++
                    }
                } else if (it == char) {
                    count++
                }
            }
            return Pair(char, count > 2)
        }
    }


}