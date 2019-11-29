package com.matt.belisle.commonmark.ast.leafBlocks

import com.matt.belisle.commonmark.ast.InlineElements.InlineString
import org.junit.Test

import org.junit.Assert.*
import java.lang.AssertionError

class ParagraphTest: BasicBlockTest() {
    val testString = "I am a Paragraph"
    val testBlank = "   \t"

    @Test
    fun companionParseSuccessful(){
        val pass = Paragraph.parse(testString, this.document,0)
        assertEquals(pass.inline.size, 1)
        assertEquals(pass.inline[0]::class, InlineString::class)
        assertEquals((Paragraph.parse(testString, this.document, 0).inline[0] as InlineString).line, testString)
    }

    @Test(expected = AssertionError::class)
    fun companionParseFail(){
        Paragraph.parse(testBlank, this.document, 0)
    }

    @Test
    fun match() {
        val paragraph = Paragraph.parse(testString, this.document,0)
        assertFalse(paragraph.match(testBlank))
        assertTrue(paragraph.match(testString))
    }
}