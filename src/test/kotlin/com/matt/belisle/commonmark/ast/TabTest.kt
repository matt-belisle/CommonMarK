package com.matt.belisle.commonmark.ast

import org.junit.Test

class TabTest: BasicBlockTest() {
    @Test
    fun specTests(){
        specTest(7)
        specTest("Tabs")
    }
}