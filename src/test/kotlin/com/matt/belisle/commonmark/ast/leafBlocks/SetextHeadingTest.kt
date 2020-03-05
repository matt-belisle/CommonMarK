package com.matt.belisle.commonmark.ast.leafBlocks

import com.matt.belisle.commonmark.ast.BasicBlockTest
import org.junit.Test

class SetextHeadingTest: BasicBlockTest() {
    @Test
    fun specTests(){
        specTest(51)
        specTest("Setext headings")
    }
}