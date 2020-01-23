package com.matt.belisle.commonmark.ast.leafBlocks

import com.matt.belisle.commonmark.ast.BasicBlockTest
import org.junit.Test

class HTMLBlockTest: BasicBlockTest(){


    @Test
    fun specTest() {
        // TODO 118 122 125 137 138 145 146 157 Emphasis
//        specTest(152)
        specTest("HTML blocks")
    }
}