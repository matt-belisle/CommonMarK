package com.matt.belisle.commonmark.ast.containerBlocks

import com.matt.belisle.commonmark.ast.BasicBlockTest
import org.junit.Test

class ListContainerTest : BasicBlockTest() {
    @Test
    fun specTest(){
    // TODO 287 fails as link ref definition
    // TODO 279, 278 fail as HTML

        specTest("Lists")
    }

}