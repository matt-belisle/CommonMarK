package com.matt.belisle.commonmark.ast.inlineElements

import com.matt.belisle.commonmark.parser.inlineParsingUtil.EntityReplacement
import kotlin.text.StringBuilder

// just a string, either no inlines parsed or the text contained needs no special rendering
class InlineString(line: String) : Inline() {
    val strBuilder = StringBuilder(line)
    override fun render(entities: Boolean): String {
        return render(trimEnd = false, entity = entities)
    }
    fun render(trimEnd: Boolean = false, entity: Boolean): String{
        val line = strBuilder.toString()
        if(!entity || line.isEmpty()){
            if(trimEnd){
                return line.trimEnd()
            }
            return line
        }
        val entities = EntityReplacement.inspect(line, true)
        if(entities.size == 1 && entities[0] is InlineString){
            return if(trimEnd){
                line.dropLastWhile { it.isWhitespace() }
            } else line
        }
        val builder = StringBuilder()

        with(builder) {
            entities.forEachIndexed { index, inline ->
                if(index != entities.size - 1){
                    append(inline.render())
                }
            }
            if(entities.last() is InlineString){
                append(if(trimEnd){
                    (entities.last() as InlineString).render(true)
                } else entities.last().render())
            } else {
                append(entities.last().render())
            }
        }

        return builder.toString()

    }
    fun append(line:String){
        strBuilder.append("\n")
        strBuilder.append(line)
    }

}

