package com.matt.belisle.commonmark.ast.leafBlocks

import com.matt.belisle.commonmark.ast.BasicBlockTest
import com.matt.belisle.commonmark.ast.inlineElements.InlineString
import com.matt.belisle.commonmark.parser.CommonMarkParser
import org.junit.Assert.*
import org.junit.Test

class ParagraphTest: BasicBlockTest() {
    val testString = "I am a Paragraph"
    val testBlank = "   \t"

    @Test
    fun specTests() {
        specTest(194)
        specTest("Paragraphs")
    }
}