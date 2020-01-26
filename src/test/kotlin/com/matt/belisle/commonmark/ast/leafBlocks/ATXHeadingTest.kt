package com.matt.belisle.commonmark.ast.leafBlocks

import com.matt.belisle.commonmark.ast.BasicBlockTest
import com.matt.belisle.commonmark.ast.inlineElements.InlineString
import org.junit.Assert.*
import org.junit.Test
import java.lang.AssertionError


class ATXHeadingTest: BasicBlockTest() {

    @Test
    fun specTest(){
        specTest("ATX headings")
//        specTest(35)
    }
}