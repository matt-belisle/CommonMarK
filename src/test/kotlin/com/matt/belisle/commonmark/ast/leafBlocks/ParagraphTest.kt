package com.matt.belisle.commonmark.ast.leafBlocks

import com.matt.belisle.commonmark.TestCase
import com.matt.belisle.commonmark.TestCases
import com.matt.belisle.commonmark.ast.inlineElements.InlineString
import com.matt.belisle.commonmark.parser.CommonMarkParser
import org.junit.Test

import org.junit.Assert.*
import java.lang.AssertionError

class ParagraphTest: BasicBlockTest() {
    val testString = "I am a Paragraph"
    val testBlank = "   \t"

    @Test
    fun companionParseSuccessful(){
        val pass = Paragraph.parse(testString, this.document,0, document)
        assertEquals(pass.inline.size, 1)
        assertEquals(pass.inline[0]::class, InlineString::class)
        assertEquals((Paragraph.parse(testString, this.document, 0, document).inline[0] as InlineString).line, testString)
    }

    @Test(expected = AssertionError::class)
    fun companionParseFail(){
        Paragraph.parse(testBlank, this.document, 0, document)
    }

    @Test
    fun match() {
        val paragraph = Paragraph.parse(testString, this.document,0, document)
        assertFalse(paragraph.match(testBlank))
        assertTrue(paragraph.match(testString))
    }

    @Test
    fun setextHeadings() {
        var paragraph = Paragraph.parse(testString, this.document, 0, document)
        paragraph.appendLine("-")
        assertFalse(paragraph.isOpen())
        assertTrue(paragraph.isSetext)
        assertEquals(paragraph.inline.size, 1)
        assertEquals(paragraph.setextLevel, 2)

        paragraph = Paragraph.parse(testString, this.document, 0, document)
        paragraph.appendLine("=")
        assertFalse(paragraph.isOpen())
        assertTrue(paragraph.isSetext)
        assertEquals(paragraph.inline.size, 1)
        assertEquals(paragraph.setextLevel, 1)

        paragraph = Paragraph.parse(testString, this.document, 0, document)
        paragraph.appendLine("- -")
        assertTrue(paragraph.isOpen())
        assertFalse(paragraph.isSetext)
        assertEquals(paragraph.inline.size, 2)

        paragraph = Paragraph.parse(testString, this.document, 0, document)
        paragraph.appendLine("    -")
        assertTrue(paragraph.isOpen())
        assertFalse(paragraph.isSetext)


        val parser = CommonMarkParser()
        val parsed = parser.parse("_____________________________________".split('\n'))
        println(parsed.render())
    }

    @Test
    fun specTests() {
        specTest("Paragraphs")
    }
}