package com.matt.belisle.commonmark.ast.inlines

import com.matt.belisle.commonmark.ast.BasicBlockTest
import org.junit.Test

class LinkTest : BasicBlockTest() {
    @Test
    fun specTest(){
        //TODO 486, 498,499,500, 522 URI Encoding otherwise correct
        //TODO 503 import error, unicode whitespace thing
        //TODO 513 Image
        specTest(515)
        specTest("Links")
    }
}