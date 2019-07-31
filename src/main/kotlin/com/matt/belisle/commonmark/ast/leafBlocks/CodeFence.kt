import com.matt.belisle.commonmark.ast.*
import com.matt.belisle.commonmark.ast.leafBlocks.Leaf

import com.matt.belisle.commonmark.ast.InlineElements.InlineString

// The paragraph block accepts any non empty line, as it is assumed if it would've matched any other block
// then it would have been matched before getting to a paragraph
// It removes leading spaces, and ends on a blank line / other block opening

//private as to only allow the parse function in companion to construct a block
class CodeFence private constructor(
    indentation: Int,
    val fenceChar: Char,
    val fenceIndent: Int,
    val fenceLength: Int,
    val infoString: String
) : Leaf(indentation = indentation) {

    override val canLazyContinue: Boolean = true
    override val canBeConsecutive: Boolean = false

    // this is the match to continue a paragraph block
    override fun match(line: String): Boolean {
        return !super.match(line)
    }

    override fun appendLine(line: String) {
        assert(match(line))
        val removeIndent = line.removeLeadingChar(' ', fenceIndent)
        val trimmed = line.trim()
        val leadingFenceChar = trimmed.countLeadingChar(fenceChar)
        // close if the closing fence block is found
        if (line.countLeadingSpaces() < indentCheck(indent) && leadingFenceChar >= fenceLength && fenceLength == trimmed.length) {
            close()
        } else {
            inline.add(InlineString(removeIndent))
        }
    }

    companion object : IStaticMatchable, IParsable<CodeFence> {

        override fun parse(line: String, currentOpenBlock: Block, indentation: Int): CodeFence {
            // must be able to match to parse the line
            assert(this.match(line, currentOpenBlock, indentation))
            val (codeFenceChar, codeFenceLength, codeFenceIndent) = getCodeFenceLengthIndent(line)
            //remove leading and trailing spaces and return a new paragraph
            val infoString = line.substring(codeFenceIndent + codeFenceLength)
            return CodeFence(indentation, codeFenceChar, codeFenceIndent, codeFenceLength, infoString)
        }

        // this will be the match to open a new codeFence
        override fun match(line: String, currentOpenBlock: Block, indentation: Int): Boolean {
            // need 3 or more of the code fence character to create a code fence
            return line.isNotBlank() && getCodeFenceLengthIndent(line).second > 2
        }

        private fun getCodeFenceLengthIndent(line: String): Triple<Char, Int, Int> {
            val indent = line.countLeadingSpaces()
            val trimmed = line.trim()
            val leadingTildes = trimmed.countLeadingChar('~')
            val leadingBackTicks = trimmed.countLeadingChar('`')

            //one of the two must be there for it to be a fenced code block
            val (codeFenceChar, codeFenceLength) = when {
                leadingBackTicks > leadingTildes -> Pair('`', leadingBackTicks)
                leadingTildes > leadingBackTicks -> Pair('~', leadingTildes)
                else -> Pair(' ', 0)
            }

            return Triple(codeFenceChar, codeFenceLength, indent)
        }
    }

}