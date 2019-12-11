package com.matt.belisle.commonmark.ast.leafBlocks

import com.matt.belisle.commonmark.ast.BasicBlockTest
import org.junit.Test

class IndentedCodeBlockTest: BasicBlockTest() {
    @Test
    fun specTests(){
        //TODO 80 requires inline parsing
        specTest("Indented code blocks")
//        specTest(85)
    }
}