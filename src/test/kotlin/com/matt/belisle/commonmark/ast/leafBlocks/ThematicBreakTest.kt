package com.matt.belisle.commonmark.ast.leafBlocks

import com.matt.belisle.commonmark.ast.InlineElements.InlineString
import org.junit.Test

import org.junit.Assert.*
import java.lang.AssertionError

class ThematicBreakTest {

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
        ThematicBreak.parse(passingString[0].first, root, 0).appendLine("failPls")
    }

    @Test
    fun match() {
        assertFalse(ThematicBreak.parse(passingString[0].first, root, 0).match("failPls"))
    }

    @Test
    fun successfulParse(){
        passingString.forEach {
            val thematicBreak = ThematicBreak.parse(it.first, root, 0)

            assertEquals( it.second, thematicBreak.thematicBreakChar)
            assertEquals( it.first, (thematicBreak.inline[0] as InlineString).line)
        }
    }

    @Test(expected = AssertionError::class)
    fun doesntParse() = failingString.forEach { ThematicBreak.parse(it, root, 0) }
}