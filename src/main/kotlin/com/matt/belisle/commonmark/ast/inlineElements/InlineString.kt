package com.matt.belisle.commonmark.ast.inlineElements

import com.matt.belisle.commonmark.parser.inlineParsingUtil.EntityReplacement
import java.lang.StringBuilder

// just a string, either no inlines parsed or the text contained needs no special rendering
class InlineString(val line: String) : Inline() {

    override fun render(entities: Boolean): String {
        return render(false, entities)
    }
    fun render(trimEnd: Boolean, entity: Boolean): String{
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

}

