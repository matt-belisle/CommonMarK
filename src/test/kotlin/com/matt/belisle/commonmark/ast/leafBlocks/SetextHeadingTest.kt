package com.matt.belisle.commonmark.ast.leafBlocks

import com.matt.belisle.commonmark.ast.BasicBlockTest
import org.junit.Test

class SetextHeadingTest: BasicBlockTest() {
    @Test
    fun specTests(){
        specTest(76)
        //TODO 50 51 52 61 72 need inline
        specTest("Setext headings")
    }
}