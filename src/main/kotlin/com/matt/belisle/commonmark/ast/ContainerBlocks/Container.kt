package com.matt.belisle.commonmark.ast.ContainerBlocks

import com.matt.belisle.commonmark.ast.Block

// A container block contains other blocks ex: BlockQuote, List, ListItem

abstract class Container: Block(indent = 0){

    val children: List<Block> = emptyList()
}