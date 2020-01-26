package com.matt.belisle.commonmark.ast.inlines

import com.matt.belisle.commonmark.ast.BasicBlockTest
import org.junit.Test


class EmphasisAndStrongEmphasisTest : BasicBlockTest() {
    @Test
    fun specTest(){
        /* TODO 353 is import error due to unicode whitespace
         403, 418, 421, 432, 472, 473 links not done
         */
        specTest(468)
        specTest("Emphasis and strong emphasis")
    }
}