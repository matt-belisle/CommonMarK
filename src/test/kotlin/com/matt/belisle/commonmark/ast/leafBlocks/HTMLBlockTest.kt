package com.matt.belisle.commonmark.ast.leafBlocks

import com.matt.belisle.commonmark.ast.BasicBlockTest
import org.junit.Test

class HTMLBlockTest: BasicBlockTest(){


    @Test
    fun specTest() {
        // TODO 137 138 inline HTML
        // TODO 118 122 125 145 146 157 Emphasis
        // TODO 152 153 160 &gt replacement

        specTest("HTML blocks")
    }
}