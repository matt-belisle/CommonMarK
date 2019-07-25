package com.matt.belisle.commonmark.ast

// A container block contains other blocks ex: BlockQuote, List, ListItem

abstract class Container: Block(){

    val children: List<Block> = emptyList()
}