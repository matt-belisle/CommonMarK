package com.matt.belisle.commonmark.ast.inlines

import com.matt.belisle.commonmark.ast.BasicBlockTest
import org.junit.Test

class LinkTest : BasicBlockTest() {
    @Test
    fun specTest(){
        //TODO 503 import error, unicode whitespace thing
        //TODO 513, 516 Image
        specTest(515)
        specTest("Links")
    }
}