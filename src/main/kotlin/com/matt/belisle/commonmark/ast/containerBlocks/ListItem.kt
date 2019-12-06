package com.matt.belisle.commonmark.ast.containerBlocks

import com.matt.belisle.commonmark.ast.countLeadingSpaces
import com.matt.belisle.commonmark.ast.leafBlocks.BlankLine
import com.matt.belisle.commonmark.ast.leafBlocks.Paragraph

class ListItem(parent: Container, indent: Int) : Container(parent = parent, indent = indent) {
    var loose = true
    var containsBlankLine = false

    override fun close(){
        super.close()
        if(children.any { it is BlankLine }) {
            containsBlankLine = true
            loose = false
        }
    }

    override fun render(): String {
        val builder = StringBuilder()
        //TODO when inlines implemented need to change to account for tight/loose
        //only one paragraph and the rest blank for special print
//        if(children.count { it is Paragraph } <= 1 && children.count{it is Paragraph || it is BlankLine} == children.size) {
//            val para = children.find { it is Paragraph }
//            return "<li>${(para!! as Paragraph).renderInline()}</li>\n"
//        }
        with(builder) {
            append("<li>")
            children.forEach {
                if(loose && it is Paragraph){
                    append(it.renderInline())
                } else {
                    val render = it.render()
                    if(render.isNotEmpty()) {
                        if(render.first() != '\n' && last() != '\n')
                        append('\n')
                        append(it.render())
                    }
                }
            }
            append("</li>\n")
        }
        return builder.toString()
    }

    override fun dropPrefix(line: String): String {
        return line
        return if(line.countLeadingSpaces() >= indent)
            line.drop(indent)
        else
            line.trimStart()
    }

    //TODO implement
//    override val canLazyContinue: Boolean = true
//    override val canBeConsecutive: Boolean = false
//    override val canInterruptParagraph: Boolean = true


    override fun match(line: String): Boolean {
        // needs to be either indented far enough to be apart of the list item or blank
        return line.countLeadingSpaces() >= indent || line.isBlank()
    }
    // there is no companion object for this as the List companion matches and creates these
}