package com.matt.belisle.commonmark.ast.leafBlocks

import com.matt.belisle.commonmark.ast.BasicBlockTest
import org.junit.Test

class HTMLBlockTest: BasicBlockTest(){


    @Test
    fun specTest() {
        specTest(118)
        specTest("HTML blocks")
    }
}