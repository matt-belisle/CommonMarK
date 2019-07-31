package com.matt.belisle.commonmark.ast.leafBlocks

import com.matt.belisle.commonmark.ast.Root
import org.junit.Assert.*
import org.junit.Test

class CodeFenceTest{

    @Test
    fun match() {
        val codeFence = CodeFence.parse("~~~", Root(), 0)

        assertEquals(3, codeFence.fenceLength)
        assertEquals(0, codeFence.fenceIndent)
        assertEquals("", codeFence.infoString)
    }
}