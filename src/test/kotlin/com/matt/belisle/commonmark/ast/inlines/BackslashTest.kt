package com.matt.belisle.commonmark.ast.inlines

import com.matt.belisle.commonmark.ast.BasicBlockTest
import org.junit.Test

class BackslashTest : BasicBlockTest() {
    @Test
    fun specTest(){
        //  309 LRD
        specTest("Backslash escapes")
    }
}