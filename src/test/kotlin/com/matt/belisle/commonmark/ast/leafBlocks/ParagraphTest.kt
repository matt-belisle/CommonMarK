package com.matt.belisle.commonmark.ast.leafBlocks

import com.matt.belisle.commonmark.ast.InlineElements.InlineString
import org.junit.Test

import org.junit.Assert.*
import java.lang.AssertionError

class ParagraphTest {
    val testString = "I am a Paragraph"
    val testBlank = "   \t"

    @Test
    fun companionParseSuccessful(){
        val pass = Paragraph.parse(testString)
        assertEquals(pass.inline.size, 1)
        assertEquals(pass.inline[0]::class, InlineString::class)
        assertEquals((Paragraph.parse(testString).inline[0] as InlineString).line, testString)
    }

    @Test(expected = AssertionError::class)
    fun companionParseFail(){
        Paragraph.parse(testBlank)
    }

    @Test
    fun match() {
        val paragraph = Paragraph.parse(testString)
        assertFalse(paragraph.match(testBlank))
        assertTrue(paragraph.match(testString))
    }
}