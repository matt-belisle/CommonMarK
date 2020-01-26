package com.matt.belisle.commonmark.ast.inlines

import com.matt.belisle.commonmark.ast.BasicBlockTest
import org.junit.Test

class BackslashTest : BasicBlockTest() {
    @Test
    fun specTest(){
        //  306 is autolink
        //  308 309 Liks of various types
        specTest("Backslash escapes")
    }
}