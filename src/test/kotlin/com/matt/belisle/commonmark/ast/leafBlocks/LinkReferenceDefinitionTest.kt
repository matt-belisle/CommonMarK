package com.matt.belisle.commonmark.ast.leafBlocks
import com.matt.belisle.commonmark.ast.BasicBlockTest
import org.junit.Test

class LinkReferenceDefinitionTest: BasicBlockTest(){

    @Test
    fun specTest() {
        specTest(173)
        specTest("Link reference definitions")

    }
}