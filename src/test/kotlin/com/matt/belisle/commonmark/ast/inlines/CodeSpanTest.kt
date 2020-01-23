package com.matt.belisle.commonmark.ast.inlines

import com.matt.belisle.commonmark.ast.BasicBlockTest
import org.junit.Test

class CodeSpanTest : BasicBlockTest() {
    @Test
    fun specTest(){
        //TODO 333 is an import issue, but should pass
        //TODO 346 is autolink URI Encoding
        specTest(344)
        specTest("Code spans")
    }
}