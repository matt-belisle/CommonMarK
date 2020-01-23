package com.matt.belisle.commonmark.ast.inlines

import com.matt.belisle.commonmark.ast.BasicBlockTest
import org.junit.Test

class HardBreakTest : BasicBlockTest() {
    @Test
    fun specTest(){
        specTest(630)
        //TODO 635,656 fail due to no emphasis
        specTest("Hard line breaks")
    }
}