package com.matt.belisle.commonmark.ast.inlines

import com.matt.belisle.commonmark.ast.BasicBlockTest
import org.junit.Test

class AutoLinkTest : BasicBlockTest() {
    @Test
    fun specTest(){
        specTest(594)
        //TODO 591, 598, 599, 602-606 fail due to entity correction
        specTest("Autolinks")
    }
}