package com.matt.belisle.commonmark.ast.containerBlocks

import com.matt.belisle.commonmark.ast.BasicBlockTest
import org.junit.Test

class ListContainerTest : BasicBlockTest() {
    @Test
    fun specTest(){
        specTest(276)
//        specTest("List items")
        specTest("Lists")
    }

}