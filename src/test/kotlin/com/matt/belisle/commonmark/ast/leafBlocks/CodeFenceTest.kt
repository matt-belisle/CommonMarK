package com.matt.belisle.commonmark.ast.leafBlocks

import CodeFence
import com.matt.belisle.commonmark.ast.BasicBlockTest
import org.junit.Assert.assertEquals
import org.junit.Test

class CodeFenceTest: BasicBlockTest(){

    @Test
    fun specTest() {
        specTest(100)
        specTest("Fenced code blocks")

    }
}