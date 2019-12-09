package com.matt.belisle.commonmark.ast.containerBlocks

import com.matt.belisle.commonmark.ast.leafBlocks.BlankLine

// this is a meta container, it does nothing to the parsing of the blocks and is instantiated by a visitor
class ListContainer(parent: Container, indent: Int, val markerType: MarkerType, private val startingNumber: Int) : Container(parent = parent, indent = indent) {
    override fun dropPrefix(line: String) = line

    override fun close() {
        super.close()
        // if any are loose they are all loose
        val loose = children.drop(1).any { (it as ListItem).loose }
        if(loose){
            children.forEach { (it as ListItem).loose = true }
            return
        } else {
            // the last checked all but last as if the last one is loose because only the last block is
            // a blank line then the list is actually tight
            val lastChild = children.last() as ListItem
            if(lastChild.children.drop(1).dropLast(1).any { it is BlankLine }){
                children.forEach { (it as ListItem).loose = true }
            } else{
                children.forEach { (it as ListItem).loose = false }
            }
        }
    }

    override fun render(): String {
        val start = if(startingNumber != 1) " start=\"$startingNumber\"" else ""
        val openingTag = when(markerType){
            MarkerType.NUMERIC_DOT, MarkerType.NUMERIC_BRACKET -> "<ol$start>\n"
            else -> "<ul>\n"
        }
        val closingTag = when(markerType){
            MarkerType.NUMERIC_DOT, MarkerType.NUMERIC_BRACKET -> "</ol>\n"
            else -> "</ul>\n"
        }

        val builder = StringBuilder()
        with(builder) {
            append(openingTag)
            children.forEach { append( it.render() ) }
            append(closingTag)
        }

        return builder.toString()
    }
}