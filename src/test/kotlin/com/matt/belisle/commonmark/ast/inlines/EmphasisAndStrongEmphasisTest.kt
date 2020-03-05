package com.matt.belisle.commonmark.ast.inlines

import com.matt.belisle.commonmark.ast.BasicBlockTest
import org.junit.Test


class EmphasisAndStrongEmphasisTest : BasicBlockTest() {
    @Test
    fun specTest(){
        /* TODO 353 is import error due to unicode whitespace*/
//        specTest(473)
        specTest("Emphasis and strong emphasis")
    }
}