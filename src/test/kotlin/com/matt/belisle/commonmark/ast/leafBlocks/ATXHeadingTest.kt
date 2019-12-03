package com.matt.belisle.commonmark.ast.leafBlocks

import com.matt.belisle.commonmark.ast.inlineElements.InlineString
import org.junit.Assert.*
import org.junit.Test
import java.lang.AssertionError


class ATXHeadingTest: BasicBlockTest() {
    private val passingString: List<Triple<String, String, Int>> = listOf(
        Triple("# foo *bar* *baz*", "foo *bar* *baz*", 1),
        Triple("#                  foo                      ", "foo", 1),
        Triple("# foo", "foo", 1),
        Triple("## foo", "foo", 2),
        Triple("### foo", "foo", 3),
        Triple("#### foo", "foo", 4),
        Triple("##### foo", "foo", 5),
        Triple("###### foo", "foo", 6),
        Triple("#", "", 1),
        Triple("##", "", 2),
        Triple("###", "", 3),
        Triple("####", "", 4),
        Triple("##### ", "", 5),
        Triple("######", "", 6),
        Triple("## foo ##", "foo", 2),
        Triple("## foo #################################", "foo", 2),
        Triple("##### foo ##", "foo", 5),
        Triple("### foo ###     ", "foo", 3),
        Triple("### foo ### b", "foo ### b", 3),
        Triple("# foo#", "foo#", 1),
        Triple("## foo #\\##", "foo ###", 2),
        Triple("# foo \\#", "foo #", 1)
    )

    private val failingString: List<String> = listOf(
        "####### foo",
        "#5 bolt",
        "#hashtag",
        "\\## foo",
        "    # foo"
    )

    @Test
    fun match() = passingString.forEach { assertTrue("${it.first} failed to be matched", ATXHeading.match(it.first, this.document,0)) }

    @Test
    fun doesntMatch() = failingString.forEach { assertFalse("$it was matched", ATXHeading.match(it, this.document,0)) }

    @Test(expected = AssertionError::class)
    fun doesntParse() = failingString.forEach { ATXHeading.parse(it, this.document, 0, document) }

    @Test
    fun parses() {
        passingString.forEach {

            val ATX = ATXHeading.parse(it.first, this.document,0, document)

            val text = ATX.inline[0] as InlineString
            assertEquals("Parsed String ${text.line}, is not equal to the correct String ${it.second}", text.line, it.second)

            assertEquals("Parsed heading level is incorrect ${ATX.headingLevel}, should be: ${it.third}",ATX.headingLevel, it.third)

        }
    }

    @Test(expected = Exception::class)
    fun appendLine(){
        val ATX = ATXHeading.parse(passingString[0].first, this.document, 0, document)
        ATX.appendLine("AHHHH")
    }
}