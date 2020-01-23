package com.matt.belisle.commonmark.ast.inlines

import com.matt.belisle.commonmark.ast.BasicBlockTest
import org.junit.Test

class RawHTMLTest : BasicBlockTest() {
    @Test
    fun specTest(){
        specTest(626)
        specTest("Raw HTML")
    }
}