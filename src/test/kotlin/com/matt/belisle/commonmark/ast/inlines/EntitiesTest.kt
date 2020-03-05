package com.matt.belisle.commonmark.ast.inlines

import com.matt.belisle.commonmark.ast.BasicBlockTest
import org.junit.Test

class EntitiesTest : BasicBlockTest() {
    @Test
    fun specTest(){
        //TODO: 311 import issue with nbsp
        // 319 LRD
        specTest(318)
        specTest("Entity and numeric character references")
    }
}