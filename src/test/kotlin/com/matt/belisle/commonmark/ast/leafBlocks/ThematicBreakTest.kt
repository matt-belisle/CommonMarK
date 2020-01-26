package com.matt.belisle.commonmark.ast.leafBlocks

import com.matt.belisle.commonmark.ast.BasicBlockTest
import com.matt.belisle.commonmark.ast.inlineElements.InlineString
import org.junit.Test

import org.junit.Assert.*
import java.lang.AssertionError

class ThematicBreakTest: BasicBlockTest() {

    private val passingString: List<Pair<String, Char>> = listOf(
        Pair("---", '-'),
        Pair("___", '_'),
        Pair("***", '*'),
        Pair("----------------", '-'),
        Pair("********", '*'),
        Pair("_____", '_'),
        Pair(" ---", '-'),
        Pair("- --           ", '-'),
        Pair("- - -", '-'),
        Pair("  --      -", '-'),
        Pair("   ---", '-')

    )

    private val failingString: List<String> = listOf(
        "+++",
        "--",
        "-",
        "    ----",
        "    ++++",
        "    ____",
        "*-_",
        "***a",
        "*           *b_",
        "b***"

    )

    @Test(expected = Exception::class)
    fun appendLine() {
        ThematicBreak.parse(passingString[0].first, this.document, 0, document).appendLine("failPls")
    }

    @Test
    fun match() {
        assertFalse(ThematicBreak.parse(passingString[0].first, this.document, 0, document).match("failPls"))
    }

    @Test
    fun successfulParse(){
        passingString.forEach {
            val thematicBreak = ThematicBreak.parse(it.first, this.document, 0, document)

            assertEquals( it.second, thematicBreak.thematicBreakChar)
            assertEquals( it.first, (thematicBreak.inline[0] as InlineString).strBuilder.toString())
        }
    }

    @Test(expected = AssertionError::class)
    fun doesntParse() = failingString.forEach { ThematicBreak.parse(it, this.document, 0, document) }

    @Test
    fun specTest(){
        // TODO 26 fails because of inlines
        specTest(26)
        specTest("Thematic breaks")
    }
}