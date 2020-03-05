package com.matt.belisle.commonmark.parser.inlineParsingUtil

import com.matt.belisle.commonmark.ast.inlineElements.Inline
import com.matt.belisle.commonmark.parser.createInlines
import java.lang.StringBuilder
import java.util.*

object EntityReplacement {
    private val htmlReservedEntities: Map<String, Entity> = mapOf<String, Entity>(
    "\"" to  Entity(listOf(34), "&quot;"),
    "<" to Entity(listOf(60), "&lt;"),
    ">" to Entity(listOf(62), "&gt;"),
    "&" to Entity(listOf(38), "&amp;"),
    "'" to Entity(listOf(39), "&apos;")
    )

    fun replaceHTMLReserved(string: String): String {
        val builder = StringBuilder()
        for(char in string) {
            if (char.toString() in htmlReservedEntities.keys) {
                // safe as we just checked
                builder.append(htmlReservedEntities.getValue(char.toString()).characters)
            } else {
                builder.append(char)
            }
        }
            return builder.toString()
    }
    // this will inspect an inline and return a list containing the entities replaced
    fun inspect(string: String, html: Boolean): List<Inline> {
        if(string.isNotEmpty()) {
            val lexer = InlineLexer(string)
            var metadata = if (html) {
                inspectWithHTMLReplacement(lexer)
            } else {
                val mutMetaData: MutableList<InlineMetaData> = mutableListOf()
                do {
                    lexer.advanceWhile { it != '&' }
                    val savedIndex = lexer.saveIndex()
                    val isEntity = isEntity(lexer)
                    if(isEntity.first){
                        mutMetaData.add(InlineMetaData(savedIndex, lexer.saveIndex(), InlineTypes.ENTITY, isEntity.second))
                    }
                     else{
                        lexer.advanceCharacter()
                    }
                } while (!lexer.isEndOfData())
                mutMetaData
            }

            return createInlines(PriorityQueue(metadata), string)
        } else{
            return emptyList()
        }
    }
    //HTML reserved characters: " , ', &, <, >
    private fun inspectWithHTMLReplacement(lexer: InlineLexer): List<InlineMetaData>{
        val metadata: MutableList<InlineMetaData> = mutableListOf()
        do {
            lexer.advanceWhile { htmlReserved(it) }
            htmlEntities(lexer, metadata)
            lexer.advanceCharacter()
        } while (!lexer.isEndOfData())
        if(metadata.size > 0 && metadata[metadata.size - 1].end != lexer.line.length - 1){
            // edge case on two entities in a row to end the string
            lexer.goTo(lexer.line.length - 1)
            htmlEntities(lexer, metadata)
        }
        return metadata
    }
    private fun htmlEntities(lexer: InlineLexer, metadata: MutableList<InlineMetaData>){
        val savedIndex = lexer.saveIndex()
//        if (lexer.inspect { it == '\'' }) {
//            metadata.add(InlineMetaData(savedIndex, savedIndex, InlineTypes.ENTITY, Entity(listOf(39), "&apos;")))
        //}
        if (lexer.inspect { it == '"' }) {
            metadata.add(InlineMetaData(savedIndex, savedIndex, InlineTypes.ENTITY, Entity(listOf(34), "&quot;")))
        } else if (lexer.inspect { it == '<' }) {
            metadata.add(InlineMetaData(savedIndex, savedIndex, InlineTypes.ENTITY, Entity(listOf(60), "&lt;")))
        } else if (lexer.inspect { it == '>' }) {
            metadata.add(InlineMetaData(savedIndex, savedIndex, InlineTypes.ENTITY, Entity(listOf(62), "&gt;")))
        } else if (lexer.inspect { it == '&' }) {
            val isEntity = isEntity(lexer)
            if (isEntity.first) {
                // the entity may be one of the reserved ones, in which case dont replace with its character
                if (htmlReservedEntities.containsKey(isEntity.second.characters)) {
                    metadata.add(InlineMetaData(savedIndex, lexer.saveIndex(), InlineTypes.ENTITY,
                        htmlReservedEntities.getValue(isEntity.second.characters)
                    ))
                } else{
                    metadata.add(InlineMetaData(savedIndex, lexer.saveIndex(), InlineTypes.ENTITY, isEntity.second))
                }
            } else {
                metadata.add(InlineMetaData(savedIndex, savedIndex, InlineTypes.ENTITY, Entity(listOf(38), "&amp;")))
                lexer.goTo(savedIndex)
            }
        }
    }
    private fun isEntity(lexer: InlineLexer): Pair<Boolean, Entity>{
        val savedIndex = lexer.saveIndex()
        lexer.advanceCharacter()
        if(lexer.isEndOfData()){
            return Pair(false, Entity(emptyList(), ""))
        }
        val numeric = lexer.inspect('#')
        lexer.advanceCharacter()
        if(lexer.isEndOfData()){
            return Pair(false, Entity(emptyList(), ""))
        }
        val hex: Boolean = lexer.inspect {it == 'X' || it == 'x'}
        lexer.goBackOne()
        val characters = lexer.advanceWhile { it != ';' }
        // was not stopped by EOL
        if(lexer.inspect { it == ';' }) {
            //Named first
            val entity = lexer.subString(savedIndex, lexer.saveIndex() + 1)
            if (HTML_ENTITIES.containsKey(entity)) {
                return Pair(true, HTML_ENTITIES.getValue(entity))
            }
            if (numeric) {
                //first decimal check
                // at most 7 digits first char is #
                if (!hex && characters in 2..8) {
                    lexer.goTo(savedIndex + 2)
                    if (lexer.advanceWhile { it.isDigit() } == characters - 1) {
                        //parse out the numeric
                        val isNumeric = lexer.subString(savedIndex + 2, lexer.saveIndex())
                        // get the unicodeCharacter
                        val codePoint = isNumeric.toInt()
                        val char = getCharFromCodepoint(codePoint)
                        return Pair(true, Entity(listOf(codePoint), char.toString()))
                    }
                    // at most 6 hex digits, first 2 are #x
                } else if (hex && characters in 3..8) {
                    //could be a hex entity
                    lexer.goTo(savedIndex + 3)
                    if (lexer.advanceWhile { it.toUpperCase() in Escaping.HEX_DIGITS } == characters - 2) {
                        val isNumeric = lexer.subString(savedIndex + 3, lexer.saveIndex())
                        // get the unicodeCharacter
                        val codePoint = isNumeric.toInt(16)
                        val char = getCharFromCodepoint(codePoint)
                        return Pair(true, Entity(listOf(codePoint), char.toString()))
                    }
                }
            }
        }
        return Pair(false, Entity(emptyList(), ""))
    }

    private fun getCharFromCodepoint(codePoint: Int) = if(codePoint != 0) codePoint.toChar() else '\uFFFD'

    private fun htmlReserved(it: Char) = it != '\'' && it != '"' && it != '&' && it != '<' && it != '>'
}