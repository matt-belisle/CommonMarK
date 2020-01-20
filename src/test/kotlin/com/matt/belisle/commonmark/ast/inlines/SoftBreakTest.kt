package com.matt.belisle.commonmark.ast.inlines

import com.matt.belisle.commonmark.ast.BasicBlockTest
import org.junit.Test

class SoftBreakTest : BasicBlockTest() {
    @Test
    fun specTest(){
        specTest(302)
        specTest("Soft line breaks")
    }
}