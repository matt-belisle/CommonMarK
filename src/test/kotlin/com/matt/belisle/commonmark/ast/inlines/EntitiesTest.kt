package com.matt.belisle.commonmark.ast.inlines

import com.matt.belisle.commonmark.ast.BasicBlockTest
import org.junit.Test

class EntitiesTest : BasicBlockTest() {
    @Test
    fun specTest(){
        specTest("Entity and numeric character references")
    }
}