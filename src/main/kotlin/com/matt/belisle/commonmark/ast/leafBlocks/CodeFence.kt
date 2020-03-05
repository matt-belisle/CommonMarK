import com.matt.belisle.commonmark.ast.*
import com.matt.belisle.commonmark.ast.containerBlocks.Container
import com.matt.belisle.commonmark.ast.inlineElements.Emphasis
import com.matt.belisle.commonmark.ast.inlineElements.Inline
import com.matt.belisle.commonmark.ast.leafBlocks.Leaf

import com.matt.belisle.commonmark.ast.inlineElements.InlineString
import com.matt.belisle.commonmark.ast.leafBlocks.LinkReferenceDefinition
import com.matt.belisle.commonmark.parser.InlineParser
import java.lang.StringBuilder

// The paragraph block accepts any non empty line, as it is assumed if it would've matched any other block
// then it would have been matched before getting to a paragraph
// It removes leading spaces, and ends on a blank line / other block opening

//private as to only allow the parse function in companion to construct a block
class CodeFence private constructor(
    indent: Int,
    val fenceChar: Char,
    val fenceIndent: Int,
    val fenceLength: Int,
    val infoString: MutableList<Inline>,
    parent: Container
) : Leaf(indent = indent, parent = parent) {

    //match is just anything until it detects the end

    override fun appendLine(line: String) {
        assert(match(line))
        val removeIndent = line.removeLeadingChar(' ', fenceIndent)
        val trimmed = line.trim()
        val leadingFenceChar = trimmed.countLeadingChar(fenceChar)

        // close if the closing fence block is found
        if (line.countLeadingSpaces() < indentCheck(indent) && leadingFenceChar >= fenceLength && leadingFenceChar == trimmed.length) {
            close()
        }else if(inline.size ==  0){
            inline.add(InlineString(removeIndent))
            return
        } else {
            (inline[0] as InlineString).append(removeIndent)
        }
    }

    override fun render(): String {
        val builder = StringBuilder()
        val renderedInfoString = infoString.fold("", {acc, inline -> "$acc${inline.render()}"})
        with(builder) {
            append("<pre>")
            val infoStringHTML =
                if (renderedInfoString.isNotEmpty()) " class=\"language-${renderedInfoString.trim().split(' ').first()}\"" else ""
            append("<code$infoStringHTML>")
            inline.forEach { append("${it.render()}\n") }
            append("</code>")
            append("</pre>\n")
        }
        return builder.toString()
    }

    override fun analyzeInlines(inlineParser: InlineParser,
                                delimiters: List<Emphasis<*>>,
                                linkReferences: Map<String, LinkReferenceDefinition>) {
        val analyzed = inlineParser.analyzeLine(infoString, delimiters = delimiters, linkReferences = linkReferences);
        infoString.clear()
        infoString.addAll(analyzed)

    }

    companion object : IStaticMatchableLeaf<CodeFence> {

        override val canInterruptParagraph: Boolean = true

        override fun parse(line: String, currentOpenBlock: Block, indentation: Int, parent: Container): CodeFence {
            // must be able to match to parse the line
            assert(this.match(line, currentOpenBlock, indentation))
            val (codeFenceChar, codeFenceLength, codeFenceIndent) = getCodeFenceLengthIndent(line)
            //remove leading and trailing spaces and return a new paragraph
            val infoString = line.substring(codeFenceIndent + codeFenceLength)
            return CodeFence(indentation, codeFenceChar, codeFenceIndent, codeFenceLength, mutableListOf(InlineString(infoString)), parent)
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
            // the label in a back ticked code fence may not contain a '`'
            if (codeFenceChar == '`' && trimmed.substring(codeFenceLength).contains('`')) return Triple(' ', 0, 0)
            return Triple(codeFenceChar, codeFenceLength, indent)
        }
    }

}