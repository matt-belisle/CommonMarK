package com.matt.belisle.commonmark.ast.containerBlocks

import com.matt.belisle.commonmark.ast.*
import com.matt.belisle.commonmark.ast.leafBlocks.BlankLine
import com.matt.belisle.commonmark.ast.leafBlocks.Paragraph
import com.matt.belisle.commonmark.ast.leafBlocks.ThematicBreak
import java.lang.StringBuilder
import kotlin.math.log10


private enum class MarkerType {NUMERIC_DOT, NUMERIC_BRACKET, PLUS, MINUS, STAR}
private data class NumericListMatch(val match: Boolean, val marker: MarkerType, val startingNumber: Int, val restOfLine: String)
private data class BulletListMatch(val match: Boolean, val marker: MarkerType, val restOfLine: String)

class ListContainer private constructor(parent: Container, private val startingNumber: Int, private val markerType: MarkerType, indent: Int) :
    Container(parent = parent, indent = 0), IMetaContainer{


    init {
        // add an empty list item to parse to
        // leading zeros in numeric do not affect indent
        addChild(ListItem(this, indent))
    }
    // no prefix on the list itself, this is just a dummy container
    override fun dropPrefix(line: String) = line


    override fun match(line: String): Boolean {
        // look for a new listItem, or check the last listItem for matching
        // if new listItem call appendLine maybe
        val (match, marker) = matchWithData(line, this, indent)
        if(match){
            return if(marker == this.markerType){
                // will cause this to be the last block parsed i believe
                children.last().close()
                true
            } else {
                false
            }
        }
        return children.last().match(line)
    }
    override fun appendLine(line: String): String {
        val trimmed = line.trimStart()
        val leadingWhitespace = line.countLeadingSpaces()

        val bulletListMatch = bulletListMatch(trimmed, this)
        if(bulletListMatch.match){
            val indent = bulletListMatch.restOfLine.countLeadingSpaces()
            children.last().close()
            children.add(ListItem(this, leadingWhitespace + 1 + indent))
            return " ".repeat(leadingWhitespace + 1) + bulletListMatch.restOfLine
        }

        val numericListMatch = numericListMatch(trimmed, this)
        if(numericListMatch.match){
            val indent = numericListMatch.restOfLine.countLeadingSpaces()
            children.last().close()
            // to get string length of a number just do log10 and add one (log10(1) = 0 but length is 1)
            val markerLength = if(numericListMatch.startingNumber == 0) 0 else (log10(numericListMatch.startingNumber.toDouble()).toInt() + 1)
            children.add(ListItem(this, leadingWhitespace + markerLength + 1 + indent))
            return " ".repeat(leadingWhitespace   + markerLength + 1) + numericListMatch.restOfLine
        }
        return line
    }

    override fun close() {
        // this will close all children first, which will help determine if tight or not
        super.close()
        val tight = children.drop(1).any { (it as ListItem).containsBlankLine}
        if(tight){
            children.forEach { (it as ListItem).loose = false }
            return
        } else {
            // any of them except the last one
            val lastChild = children.last() as ListItem
            if(lastChild.children.drop(1).any { it is BlankLine }){
                children.forEach { (it as ListItem).loose = false }
            }
        }
    }

    override fun render(): String {
        val start = if(startingNumber != 1) " start=\"$startingNumber\"" else ""
        val openingTag = when(markerType){
            MarkerType.NUMERIC_DOT, MarkerType.NUMERIC_BRACKET -> "<ol$start>\n"
            else -> "<ul>\n"
        }
        val closingTag = when(markerType){
            MarkerType.NUMERIC_DOT, MarkerType.NUMERIC_BRACKET -> "</ol>\n"
            else -> "</ul>\n"
        }

        val builder = StringBuilder()
        with(builder) {
            append(openingTag)
            children.forEach { append( it.render() ) }
            append(closingTag)
        }

        return builder.toString()
    }

    companion object : IStaticMatchableContainer<ListContainer> {
        override fun match(line: String, currentOpenBlock: Block, indentation: Int): Boolean {
            return matchWithData(line, currentOpenBlock, indentation).first
        }
        private fun matchWithData(line: String, currentOpenBlock: Block, indentation: Int): Pair<Boolean, MarkerType> {
            val (matchNumeric, markerNumeric) = numericListMatch(line.trimStart(), currentOpenBlock)
            val (matchBullet, markerBullet) = bulletListMatch(line.trimStart() , currentOpenBlock)

            // When both a thematic break and a list item are possible interpretations of a line,
            // the thematic break takes precedence
            val markerType = if(matchNumeric) markerNumeric else markerBullet
            return Pair(line.countLeadingSpaces() < indentCheck(indentation) &&
                    (matchNumeric || matchBullet) &&
                    !ThematicBreak.match(line, currentOpenBlock, indentation), markerType)
        }
        override val canBeConsecutive: Boolean = true
        override val canInterruptParagraph: Boolean = true

        override fun parse(
            line: String,
            currentOpenBlock: Block,
            indentation: Int,
            parent: Container
        ): Pair<ListContainer, String> {

            assert(match(line, currentOpenBlock, indentation))
            val leadingWhitespace = line.countLeadingSpaces()
            val trimmed = line.trimStart()

            val bulletListMatch = bulletListMatch(trimmed, currentOpenBlock)
            if(bulletListMatch.match){
                //blank lines add no extra indent other than necessary one space
                val indent = if(bulletListMatch.restOfLine.isNotBlank()) bulletListMatch.restOfLine.countLeadingSpaces() else 1
                return Pair(ListContainer(parent, -1, bulletListMatch.marker, leadingWhitespace + 1 + indent), " ".repeat(leadingWhitespace + 1) + bulletListMatch.restOfLine)
            }

            val numericListMatch = numericListMatch(trimmed, currentOpenBlock)
            if(numericListMatch.match){
                //blank lines add no indent other than necessary one space
                val indent = if(numericListMatch.restOfLine.isNotBlank()) numericListMatch.restOfLine.countLeadingSpaces() else 1
                // to get string length of a number just do log10 and add one (log10(1) = 0 but length is 1)
                val markerLength = if(numericListMatch.startingNumber == 0) 0 else (log10(numericListMatch.startingNumber.toDouble()).toInt() + 1)
                return Pair(ListContainer(parent, numericListMatch.startingNumber,
                    numericListMatch.marker,
                    // change indent of returned as the new listItem needs to match it
                    // indent for the new block is whitespace before the marker, the numeric length, the ./), then the following indent
                    leadingWhitespace + markerLength + 1 + indent) , " ".repeat(leadingWhitespace   + markerLength + 1) + numericListMatch.restOfLine)
            }
            // shouldn't ever get here so crash if so
            throw Exception("Invalid List Marker")
        }

        // returns in order, is it a match, does it end in a '.' or ')'
        // to be a numericListMarker
        private fun numericListMatch(line: String, currentOpenBlock: Block): NumericListMatch{
            val falseReturn = NumericListMatch(false, MarkerType.NUMERIC_DOT, 0, "")
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
            val startingNumberString = builder.toString()
            // must have been long enough to contain '.' or ')' after numeric
            if(line.length == startingNumberString.length) return falseReturn
            // drop the numericMatch, the following '.', ')'
            val droppedMatch = line.drop(startingNumberString.length + 1)
            // numeric must be less than 10 digits
            // it can be an empty list item as long as it is not interrupting a paragraph
            // the following character if it is not blank must be a space
            if(startingNumberString.length >= 10 ||  (currentOpenBlock is Paragraph && droppedMatch.isBlank()) || (droppedMatch.isNotBlank() && droppedMatch[0] != ' ' )){
                return falseReturn
            }

            return NumericListMatch(true,
                endsInDot,
                startingNumberString.toInt(),
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
                    (dropped.isBlank() && currentOpenBlock is Paragraph) ||
                    (dropped.isNotEmpty() && dropped[0] != ' ')){
                    return falseReturn
                }

                return BulletListMatch(true, marker, dropped)
            }
            return falseReturn
        }
    }
}

