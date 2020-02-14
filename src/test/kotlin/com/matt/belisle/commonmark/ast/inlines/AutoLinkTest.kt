package com.matt.belisle.commonmark.ast.inlines

import com.matt.belisle.commonmark.ast.BasicBlockTest
import org.junit.Test

class AutoLinkTest : BasicBlockTest() {
    @Test
    fun specTest(){
        specTest(161)
        //TODO 599 fails due to URL Encoding...
        specTest("Autolinks")
    }
}