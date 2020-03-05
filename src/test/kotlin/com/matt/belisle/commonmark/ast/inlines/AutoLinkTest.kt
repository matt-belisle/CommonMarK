package com.matt.belisle.commonmark.ast.inlines

import com.matt.belisle.commonmark.ast.BasicBlockTest
import org.junit.Test

class AutoLinkTest : BasicBlockTest() {
    @Test
    fun specTest(){
        specTest(599)
        specTest("Autolinks")
    }
}