package com.matt.belisle.commonmark.ast.inlines

import com.matt.belisle.commonmark.ast.BasicBlockTest
import org.junit.Test

class ImageTest : BasicBlockTest() {
    @Test
    fun specTest(){
        specTest(570)
        specTest("Images")
    }
}