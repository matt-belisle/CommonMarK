package com.matt.belisle.commonmark.ast.leafBlocks

import com.matt.belisle.commonmark.ast.*
import com.matt.belisle.commonmark.ast.containerBlocks.Container
import com.matt.belisle.commonmark.ast.inlineElements.InlineString

class ATXHeading private constructor(val headingLevel: Int, indentation: Int, parent: Container) :
    Leaf(parent = parent, indent = indentation) {

    // you cannot append a line to an ATXHeading so this will error out the parser
    override fun appendLine(line: String) {
        throw Exception("Cannot append a line to an ATX HEADING")
    }

    // expects a well formed heading line, i.e. leading and trailing hashtags removed
    private constructor(line: String, headingLevel: Int, indentation: Int, parent: Container) : this(
        headingLevel,
        indentation,
        parent
    ) {
        this.inline.add(InlineString(line))
        // since nothing can be added to this close it
        this.close()
    }

    override fun match(line: String): Boolean {
        // this block cannot be continued so it will never match with a following line
        return false
    }

    override fun render(): String {
        val text = if(inline.isEmpty()) {
            ""
        } else {
            inline.first().render()
        }
        return "<h$headingLevel>${text}</h$headingLevel>\n"
    }

    companion object : IStaticMatchableLeaf<ATXHeading> {

        override val canInterruptParagraph: Boolean = true

        override fun match(line: String, currentOpenBlock: Block, indentation: Int): Boolean {
            //only need to check that the initial #s are correctly formatted, parse can take care of the post ones

            // spec says up to three leading spaces okay
            if (line.countLeadingSpaces() < indentCheck(indentation)) {
                val (trimmed, leadingTags) = trimAndGetLeadingHashTags(line)
                // at most 6 levels of header
                // the character following the hashtags must be a space
                // OR the line can be only hashtags (up to 6)
                return leadingTags in 1..6 && (trimmed.length == leadingTags || trimmed[leadingTags] == ' ')
            }
            return false
        }

        override fun parse(line: String, currentOpenBlock: Block, indentation: Int, parent: Container): ATXHeading {
            assert(match(line, currentOpenBlock, indentation))
            val (trimmed, leadingTags) = trimAndGetLeadingHashTags(line)
            // empty heading, keep levels but no content
            if (trimmed.length == leadingTags) {
                return ATXHeading("", leadingTags, indentation, parent)
            }

            // the heading has some value... most likely, still need to count trailing #s and remove them
            val endingTags = trimmed.countTrailingChar('#')

            // they can be removed safely
            val tagsRemoved =
                if (endingTags > 0 && trimmed[trimmed.length - endingTags - 1] == ' ') {
                    // may have more than one trailing space... get rid of them all
                    trimmed.substring(leadingTags, trimmed.length - endingTags).trim()
                } else {
                    trimmed.substring(leadingTags).trim()
                }
            // still need to remove the escaped hashtag's backslash
            return ATXHeading(tagsRemoved.replace("\\#", "#"), leadingTags, indentation, parent)

        }

        private fun trimAndGetLeadingHashTags(line: String): Pair<String, Int> {
            val trimmed = line.trim()
            return Pair(trimmed, trimmed.countLeadingChar('#'))
        }


    }

}