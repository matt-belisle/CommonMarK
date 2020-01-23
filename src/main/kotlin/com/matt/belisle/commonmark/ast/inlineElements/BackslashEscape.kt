package com.matt.belisle.commonmark.ast.inlineElements

import com.matt.belisle.commonmark.parser.inlineParsingUtil.EntityReplacement

// all escapable characters
val ESCAPABLE = listOf('!' , '"' , '#' , '$' , '%' , '&' , '\'' , '(' , ')' , '*' , '+' , ',' , '-' , '.' , '/' , ':' ,
    ';' , '<' , '=' , '>' , '?' , '@' , '[' , '\\' , ']' , '^' , '_' , '`' , '{' , '|' , '}' , '~')

// Represents a backslash escaped character
class BackslashEscape(private val char: Char) : Inline(){
    override fun render(entity:Boolean): String {
        if(entity){
            val entities = EntityReplacement.inspect(char.toString(), true)[0]
            return entities.render()
        }
        return char.toString()
    }
}