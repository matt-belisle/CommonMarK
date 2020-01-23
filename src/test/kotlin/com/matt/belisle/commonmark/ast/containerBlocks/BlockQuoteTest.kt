package com.matt.belisle.commonmark.ast.containerBlocks

import com.matt.belisle.commonmark.TestCase
import com.matt.belisle.commonmark.ast.BasicBlockTest
import org.junit.Test

class BlockQuoteTest: BasicBlockTest(){


    @Test
    fun specTest() {
        specTest(202)
        specTest("Block quotes")

    }

    @Test
    fun testThis(){
        specTest(
            TestCase("> foo\n``` bar\n", "",0,0,0,"")
        )
    }
}