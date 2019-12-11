package com.matt.belisle.commonmark.ast.containerBlocks

import com.matt.belisle.commonmark.ast.Block
import com.matt.belisle.commonmark.ast.IStaticMatchableContainer
import com.matt.belisle.commonmark.ast.countLeadingSpaces
import com.matt.belisle.commonmark.ast.indentCheck
import com.matt.belisle.commonmark.ast.leafBlocks.BlankLine
import com.matt.belisle.commonmark.ast.leafBlocks.Paragraph
import com.matt.belisle.commonmark.ast.leafBlocks.ThematicBreak


enum class MarkerType {NUMERIC_DOT, NUMERIC_BRACKET, PLUS, MINUS, STAR}
data class NumericListMatch(val match: Boolean, val marker: MarkerType, val startingNumber: Int, val markerLength: Int, val restOfLine: String)
data class BulletListMatch(val match: Boolean, val marker: MarkerType, val restOfLine: String)

class ListItem private constructor(parent: Container, val startingNumber: Int, val markerType: MarkerType, indent: Int) :
    Container(parent = parent, indent = indent) {
    // criteria must be met to be loose
    var loose = false

    override fun dropPrefix(line: String) = line


    override fun match(line: String): Boolean {
        if(children.size == 1 && children.first() is BlankLine && line.isBlank()){
            return false
        }
        return line.countLeadingSpaces() >= indent ||
                line.isBlank()
    }

    override fun close() {
        // this will close all children first, which will help determine if tight or not
        super.close()
        // if any of the not first children are blank lines then we have a loose list, the
        // list container itself will check if the last of any of the non-terminal list items
        // end in a blank line
            val leadingBlankLine = if (children.first() is BlankLine) 1 else 0
            val trailingBlankLine = if (children.last() is BlankLine && children.size > 1) 1 else 0
            loose = children.drop(leadingBlankLine).dropLast(trailingBlankLine).any { it is BlankLine }
    }

    override fun render(): String {
        val builder = StringBuilder()

        with(builder) {
            append("<li>")
            children.forEach {
                //if the list is loose we dont put <p> tags around paragraphs
                if(!loose && it is Paragraph && !it.isSetext){
                    append(it.renderInline())
                } else {
                    val render = it.render()
                    if(render.isNotEmpty()) {
                        if(render.first() != '\n' && this.last() != '\n')
                            append('\n')
                        append(it.render())
                    }
                }
            }
            append("</li>\n")
        }
        return builder.toString()
    }

    companion object : IStaticMatchableContainer<ListItem> {

        override val canBeConsecutive: Boolean = true
        override val canInterruptParagraph: Boolean = true

        override fun match(line: String, currentOpenBlock: Block, indentation: Int): Boolean {
            if(line.countLeadingSpaces() > indentCheck(indentation)) return false
            return matchWithData(line, currentOpenBlock, indentation).first
        }

        private fun matchWithData(line: String, currentOpenBlock: Block, indentation: Int): Pair<Boolean, MarkerType> {
            // cannot be interpreted as a indented code block
            if(indentCheck(indentation) < line.countLeadingSpaces()) return Pair(false, MarkerType.NUMERIC_BRACKET)
            val (matchNumeric, markerNumeric, startingNumber) = numericListMatch(line.trimStart(), currentOpenBlock)
            val (matchBullet, markerBullet) = bulletListMatch(line.trimStart() , currentOpenBlock)

            if(currentOpenBlock is Paragraph){
                if(matchNumeric && startingNumber != 1){
                    return Pair(false, MarkerType.NUMERIC_BRACKET)
                }
            }

            // When both a thematic break and a list item are possible interpretations of a line,
            // the thematic break takes precedence
            val markerType = if(matchNumeric) markerNumeric else markerBullet
            return Pair(line.countLeadingSpaces() < indentCheck(indentation) &&
                    (matchNumeric || matchBullet) &&
                    !ThematicBreak.match(line, currentOpenBlock, indentation), markerType)
        }



        // returns in order, is it a match, does it end in a '.' or ')'
        // to be a numericListMarker
        private fun numericListMatch(line: String, currentOpenBlock: Block): NumericListMatch{
            val falseReturn = NumericListMatch(false, MarkerType.NUMERIC_DOT, 0, 0,"")
            var endsInDot = MarkerType.NUMERIC_DOT
            val builder = StringBuilder()
            for(char in line) {
                if (char.isDigit()) {
                    builder.append(char)
                }
                else if (char == '.') {
                    endsInDot = MarkerType.NUMERIC_DOT
                    break
                }
                else if (char == ')') {
                    endsInDot = MarkerType.NUMERIC_BRACKET
                    break
                }
                else {
                    return falseReturn
                }
            }
            if(builder.isEmpty()) return falseReturn
            val startingNumberString = builder.toString()
            val startingNumber = startingNumberString.toInt()
            // must have been long enough to contain '.' or ')' after numeric
            if(line.length == startingNumberString.length) return falseReturn
            // drop the numericMatch, the following '.', ')'
            val droppedMatch = line.drop(startingNumberString.length + 1)
            // numeric must be less than 10 digits
            if(startingNumberString.length >= 10) return falseReturn
            if(currentOpenBlock is Paragraph && droppedMatch.isBlank()){
                // cannot append a new list item if this would be considered part of the paragraph
                // which means the indent on the number must be less
                    return falseReturn
            }
            if(droppedMatch.isNotBlank() && droppedMatch[0] != ' ' ){
                return falseReturn
            }
            return NumericListMatch(true,
                endsInDot,
                startingNumber,
                startingNumberString.length + 1,
                droppedMatch)
        }
        // A bullet list marker is a -, +, or * character
        private fun bulletListMatch(line: String, currentOpenBlock: Block): BulletListMatch{
            val falseReturn = BulletListMatch(false, MarkerType.NUMERIC_DOT, "")
            if(line.isNotEmpty()){
                val dropped = line.drop(1)
                val marker: MarkerType = when(line[0]) {
                    '+' -> MarkerType.PLUS
                    '-' -> MarkerType.MINUS
                    '*' -> MarkerType.STAR
                    else -> MarkerType.NUMERIC_DOT
                }
                //these are similar to the rules for numeric
                if((marker == MarkerType.NUMERIC_DOT) ||
                    // it cannot interrupt a paragraph BUT to continue the paragraph but not make a new the list it must be nested less than the paragraph
                    (dropped.isBlank() && (currentOpenBlock is Paragraph && currentOpenBlock.indent <= line.countLeadingSpaces())) ||
                    (dropped.isNotEmpty() && dropped[0] != ' ')){
                    return falseReturn
                }

                return BulletListMatch(true, marker, dropped)
            }
            return falseReturn
        }

        override fun parse(
            line: String,
            currentOpenBlock: Block,
            indentation: Int,
            parent: Container
        ): Pair<ListItem, String> {

            assert(match(line, currentOpenBlock, indentation))
            val leadingWhitespace = line.countLeadingSpaces()
            val trimmed = line.trimStart()

            val bulletListMatch = bulletListMatch(trimmed, currentOpenBlock)
            if(bulletListMatch.match){
                //blank lines add no extra indent other than necessary one space
                val markerLength = 1
                var indent = if(bulletListMatch.restOfLine.isNotBlank()) bulletListMatch.restOfLine.countLeadingSpaces() else 1
                // for indented code blocks
                if(indent > 4){
                    indent = 2
                }
                return Pair(ListItem(parent, -1, bulletListMatch.marker, leadingWhitespace + markerLength + indent),
                    " ".repeat(leadingWhitespace + 1) + bulletListMatch.restOfLine)
            }

            val numericListMatch = numericListMatch(trimmed, currentOpenBlock)
            if(numericListMatch.match){
                //blank lines add no indent other than necessary one space
                var indent = if(numericListMatch.restOfLine.isNotBlank()) numericListMatch.restOfLine.countLeadingSpaces() else 1
                // for indented code blocks
                if(indent > 4){
                    indent = 1
                }
                return Pair(ListItem(parent, numericListMatch.startingNumber,
                    numericListMatch.marker,
                    // change indent of returned as the new listItem needs to match it
                    // indent for the new block is whitespace before the marker, the numeric length, the ./), then the following indent
                    leadingWhitespace + numericListMatch.markerLength + indent) ,
                    " ".repeat(leadingWhitespace   + numericListMatch.markerLength) + numericListMatch.restOfLine)
            }
            // shouldn't ever get here so crash if so
            throw Exception("Invalid List Marker")
        }
    }
}

