package com.matt.belisle.commonmark.ast.inlines

import com.matt.belisle.commonmark.ast.BasicBlockTest
import org.junit.Test

class LinkTest : BasicBlockTest() {
    @Test
    fun specTest(){
        specTest(487)
        specTest("Links")
    }
}