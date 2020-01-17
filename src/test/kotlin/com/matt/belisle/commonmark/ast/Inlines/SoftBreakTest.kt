package com.matt.belisle.commonmark.ast.Inlines

import com.matt.belisle.commonmark.ast.BasicBlockTest
import org.junit.Test

class SoftBreakTest : BasicBlockTest() {
    @Test
    fun specTest(){
        specTest(645)
        specTest("Soft line breaks")
    }
}