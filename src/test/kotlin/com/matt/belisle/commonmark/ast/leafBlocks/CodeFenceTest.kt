package com.matt.belisle.commonmark.ast.leafBlocks

import CodeFence
import org.junit.Assert.assertEquals
import org.junit.Test

class CodeFenceTest: BasicBlockTest(){

    @Test
    fun match() {
        val codeFence = CodeFence.parse("~~~", this.document, 0, document)

        assertEquals(3, codeFence.fenceLength)
        assertEquals(0, codeFence.fenceIndent)
        assertEquals("", codeFence.infoString)
    }
}