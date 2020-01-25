package com.matt.belisle.commonmark.ast.leafBlocks

import com.matt.belisle.commonmark.ast.*
import com.matt.belisle.commonmark.ast.containerBlocks.Container
import com.matt.belisle.commonmark.ast.inlineElements.HardBreak
import com.matt.belisle.commonmark.ast.inlineElements.InlineString
import com.matt.belisle.commonmark.ast.inlineElements.SoftBreak
import java.lang.StringBuilder

// The paragraph block accepts any non empty line, as it is assumed if it would've matched any other block
// then it would have been matched before getting to a paragraph
// It removes leading spaces, and ends on a blank line / other block opening
// A paragraph block may also be interpreted as a setext heading if a line containing only - or = is encountered,
// his also closes the paragraph

//private as to only allow the parse function in companion to construct a block
class Paragraph private constructor(parent: Container, indent: Int) : Leaf(parent = parent, indent = indent),
    ILazyMatch {

    var isSetext = false
    var setextLevel: Int = 0

    var ignoreSetext = false

    private constructor(line: String, indentation: Int, parent: Container) : this(parent, indentation) {
        inline.add(InlineString(line))
    }

    // this is the match to continue a paragraph block
    override fun match(line: String): Boolean {
        return super.match(line) && line.isNotBlank()
    }

    override fun close() {
        super.close()
        //remove final trailing spaces
        val last = inline[inline.size -1] as InlineString
        inline.removeAt(inline.size-1)
        inline.add(InlineString(last.line.dropLastWhile { it.isWhitespace() }))

    }

    override fun appendLine(line: String) {
        assert(match(line))
        val trimmed = line.trimStart()
        val (isSetext, setextChar) = isSetext(trimmed.trimEnd())
        if (!ignoreSetext && isSetext && line.countLeadingSpaces() < 4) {
            this.close()
            setextLevel = if (setextChar == '=') 1 else 2
            this.isSetext = true
        } else (inline[0] as InlineString).append(line)
        ignoreSetext = false
    }

    override fun render(): String {
        val builder = StringBuilder()
        val tag = if (isSetext) getHeadingLevel() else "p"

        with(builder) {
            append("<$tag>")
            append(renderInlinePar())
            append("</$tag>\n")
        }

        return builder.toString()
    }

    private fun renderInlinePar(): String{
        val builder = StringBuilder()
        with(builder) {
            for ((index, inlineElement) in inline.withIndex()) {

                if(index != inline.size - 1 && inlineElement is InlineString){
                    // check if the next is a lineEnding
                    val next = inline[index + 1]
                        append(inlineElement.render(trimEnd = (next is SoftBreak || next is HardBreak), entity = true))
                }
                else {
                    append(inlineElement.render())
                }
            }
        }
        return builder.toString()
    }
    private fun getHeadingLevel(): String = if (setextLevel == 1) "h1" else "h2"

    private fun isSetext(line: String): Pair<Boolean, Char> {
        if(line.isEmpty()) return Pair(false, ' ')
        var char = line[0]
        if (char != '-' && char != '=') return Pair(false, ' ')
        line.forEach {
            if (it != char) return Pair(false, ' ')
        }
        return Pair(true, char)
    }


    override fun lazyMatch(line: String): Boolean {
        //can lazy match only if the paragraph would not be interrupted, including setexts
        val setext = isSetext(line)
        // we can ignore the setext on a lazy match iff the character is an '=' sign
        if(setext.first && setext.second == '='){
            ignoreSetext = true
        }
        return match(line) &&
                (!setext.first || ignoreSetext )
    }

    companion object : IStaticMatchableLeaf<Paragraph> {

        var canInterrupt: List<IStaticMatchable<out Block>> = emptyList()

        override val canInterruptParagraph: Boolean = false

        override fun parse(line: String, currentOpenBlock: Block, indentation: Int, parent: Container): Paragraph {
            // must be able to match to parse the line
            assert(this.match(line, currentOpenBlock, indentation))
            //remove leading and trailing spaces and return a new paragraph
            return Paragraph(line.trimStart(), indentation, parent)
        }

        // this will be the match to open a new paragraph block
        override fun match(line: String, currentOpenBlock: Block, indentation: Int): Boolean {
            return line.isNotBlank()
        }

    }
}