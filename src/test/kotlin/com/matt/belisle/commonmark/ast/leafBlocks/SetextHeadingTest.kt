package com.matt.belisle.commonmark.ast.leafBlocks

import com.matt.belisle.commonmark.ast.BasicBlockTest
import org.junit.Test

class SetextHeadingTest: BasicBlockTest() {
    @Test
    fun specTests(){
        specTest(59)
        //TODO 50 51 52 need inline
        specTest("Setext headings")
    }
}