package com.matt.belisle.commonmark.ast.leafBlocks

import com.matt.belisle.commonmark.ast.Document
import org.junit.Assert.*
import org.junit.Test

class CodeFenceTest: BasicBlockTest(){

    @Test
    fun match() {
        val codeFence = CodeFence.parse("~~~", this.document, 0)

        assertEquals(3, codeFence.fenceLength)
        assertEquals(0, codeFence.fenceIndent)
        assertEquals("", codeFence.infoString)
    }
}