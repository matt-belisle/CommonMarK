package com.matt.belisle.commonmark.ast.containerBlocks

import com.matt.belisle.commonmark.ast.BasicBlockTest
import org.junit.Test

class ListItemTest: BasicBlockTest(){


    @Test
    fun specTest() {
        //TODO 259 fails because of '>' parsing not happening yet
        specTest("List items")
    }
}