package com.matt.belisle.commonmark.parser.inlineParsingUtil

//Start condition: line begins with a complete open tag
// (with any tag name other than script, style, or pre) or a complete closing tag, followed only by whitespace or the end of the line.
// note that script style or pre are ran in type 1 which should always be ran before this so this doesn't account for that
class HTMLMatcher(line: String) {
    private val lexer = InlineLexer(line)

    //Inline Elements
    fun startsWithMatch(): Pair<Boolean, Int>{
        val match = rawHTML()
        return if(match){
            Pair(true, lexer.saveIndex())
        } else{
            Pair(false, 0)
        }
    }
    private fun rawHTML(): Boolean {
        if(!lexer.inspect('<')){
            return false
        }
        lexer.advanceCharacter()
        return when {
            lexer.inspect('/') -> {
                lexer.advanceCharacter()
                return closingTag()
            }
            lexer.inspect('!') -> {
                lexer.advanceCharacter()
                return when {
                    lexer.inspect('-') -> {
                        htmlComment()
                    }
                    lexer.inspect("[CDATA[") -> {
                        cData()
                    }
                    else -> {
                        declaration()
                    }
                }
            }
            lexer.inspect('?') -> {
                lexer.advanceCharacter()
                processingInstruction()
            }
            else -> {
                val match = openTag()
                if(match){
                    lexer.goBackOne()
                }
                return match
            }
        }
    }


    //For the HTML Leaf Block
    fun type7Matcher(): Boolean {
        if(!lexer.inspect('<')){
            return false
        }
        lexer.advanceCharacter()
        // closing tag if the next character is /
        return if(lexer.inspect('/')){
            lexer.advanceCharacter()
            closingTag() && lexer.isEndOfData()
        } else {
            val openingTag = openTag()
            if(openingTag && lexer.line.length == lexer.saveIndex()){
                return true
            }
            if(openingTag && !lexer.inspect { it == '>' }){
                lexer.goBackOne()
                lexer.restOfLineIsEmpty()
            } else openingTag && lexer.inspect { it == '>' }
        }
    }
    //An open tag consists of a < character, a tag name, zero or more attributes, optional whitespace, an optional / character, and a > character.
    private fun openTag(): Boolean{
        if(!tagName()){
            return false
        }
        // between tag name could be either / > or whitespace, if there's no whitespace it must be a / or >
        while(lexer.inspectWhitespace()){
            lexer.skipSpaces()
            // we had optional whitespace before the end of the tag no more attributes
            if(lexer.inspect { it == '/' || it == '>'})
                break

            // we should then have an attribute
            if(lexer.inspect(this::testAttributeNameOpener) && !attribute())
                return false

        }
        // either /> or >
        if(lexer.inspect('/')) {
            lexer.advanceCharacter()
        }
        // must have this to finish the tag
        if(!lexer.inspect{ it == '>' }) {
            return false
        }
        lexer.advanceCharacter()
        return true
    }

    //A closing tag consists of the string </, a tag name, optional whitespace, and the character >.
    private fun closingTag(): Boolean {
        if(!tagName()){
            return false
        }

        // optional so just remove if we can
        lexer.skipSpaces()

        return lexer.inspect(this::testClosingBrace)

    }
    // A tag name consists of an ASCII letter followed by zero or more ASCII letters, digits, or hyphens (-).
    private fun tagName(): Boolean {
        if(!lexer.isAsciiChar()){
            return false
        }
        // one character is enough to be a valid tagName, so the advanceWhile will move the lexer to the point the name is done
        // (with any tag name other than script, style, or pre)
        val tagName = lexer.returnMatchedWhile { isAsciiChar(it) || it.isDigit() || it == '-'}
        return (lexer.inspect(this::testClosingBrace) || !lexer.isEndOfData()) &&
                !(tagName.equals("script", true) ||
                        tagName.equals("style", true) ||
                        tagName.equals("pre", true))

    }
    // An attribute consists of whitespace, an attribute name, and an optional attribute value specification.
    private fun attribute(): Boolean {
        if(!attributeName()){
            return false
        }

        // this is LL2 here, and will be solved here
        if(lexer.inspectWhitespace()){
            lexer.skipSpaces()
            // we had optional whitespace but not an attribute value specification, this is fine as it is optional,
            // we could be starting another attribute which needs the whitespace
            // the lexer trims all the whitespace, this is fine as we just need one for the inspect to work
            if(!lexer.inspect('=')) {
                lexer.goBackOne()
                return true
            }
        }
        if(lexer.inspect('=') && !attributeValueSpecification()){
            return false
        }
        return lexer.inspect(this::testClosingBrace) || !lexer.isEndOfData()
    }

    // An attribute value specification consists of optional whitespace,
    // a = character, optional whitespace, and an attribute value.
    // note the initial whitespace is handled in attribute
    private fun attributeValueSpecification(): Boolean {
        if(!lexer.inspect('='))
            return false

        lexer.advanceCharacter()
        lexer.skipSpaces()
        return !lexer.isEndOfData() && attributeValue()

    }
    //An attribute value consists of an unquoted attribute value,
    // a single-quoted attribute value, or a double-quoted attribute value.
    private fun attributeValue(): Boolean {
        val char = lexer.line[lexer.saveIndex()]
        when {
            lexer.inspect('\'') -> singleQuotedAttributeValue()
            lexer.inspect('"') -> doubleQuotedAttributeValue()
            else -> unquotedAttributeValue()
        }
        if((char == '\'' || char == '"')) {
            if ( !lexer.inspect { it == char }){
                return false
            } else{
                if (!lexer.isEndOfData()) {
                    lexer.advanceCharacter()
                }
            }
        }
        return lexer.inspect(this::testClosingBrace) || !lexer.isEndOfData()
    }
    //An unquoted attribute value is a nonempty string of characters not including whitespace, ", ', =, <, >, or `.
    private fun unquotedAttributeValue() {
        lexer.advanceWhile { !it.isWhitespace() && it != '"' && it != '\'' && it != '=' && it != '<'  && it != '>' && it != '`'}
    }
    //A double-quoted attribute value consists of ", zero or more characters not including ", and a final ".
    private fun doubleQuotedAttributeValue() {
        // pre check the initial quote
        lexer.advanceCharacter()
        lexer.advanceWhile { it != '"' }


    }
    //A single-quoted attribute value consists of ', zero or more characters not including ', and a final '.
    private fun singleQuotedAttributeValue() {
        // pre check the initial quote
        lexer.advanceCharacter()
        lexer.advanceWhile { it != '\'' }

    }

    // An attribute name consists of an ASCII letter, _, or :,
    // followed by zero or more ASCII letters, digits, _, ., :, or -
    private fun attributeName(): Boolean {
        if(!lexer.inspect(this::testAttributeNameOpener))
            return false

        lexer.advanceCharacter()

        lexer.advanceWhile { testAttributeNameOpener(it) || it.isDigit() || it == '.' || it == '-' }
        return !lexer.isEndOfData()
    }

    private fun htmlComment(): Boolean {
        val startingDashes = lexer.advanceWhile { it == '-' }
        if(startingDashes != 2 || lexer.inspect { it == '>' }){
            return false
        }
        var dashes: Int
        do {
            lexer.advanceWhile { it != '-' }
            dashes = lexer.advanceWhile { it == '-' }
        }while(dashes != 2 && !lexer.isEndOfData())
        if(dashes != 2){
            return false
        }
        if(lexer.inspect { it == '>' }){
            return true
        }
        return false
    }


    private fun cData(): Boolean {
        do {
            lexer.advanceWhile { it != ']' }
        } while(lexer.isEndOfData())
        return if(lexer.inspect("]]>")){
            lexer.advanceCharacter(2)
            true
        }else {
            false
        }
    }

    private fun processingInstruction(): Boolean {
        do {
            lexer.advanceWhile { it != '?' }
        } while(lexer.isEndOfData() && !lexer.inspect(">"))
        lexer.advanceCharacter()
        return lexer.inspect {it == '>'}
    }

    private fun declaration(): Boolean {
        // uppercase name followed by whitespace
        lexer.advanceWhile { it.isUpperCase() }
        if(!lexer.inspectWhitespace()){
            return false
        }
        lexer.advanceWhile { it != '>' }
        // its either at the end of the line or not this will still work
        return lexer.inspect { it == '>'}
    }


    private fun testAttributeNameOpener(it: Char): Boolean = isAsciiChar(it) || it == '_'|| it == ':'
    private fun testClosingBrace(it: Char): Boolean = it == '>'

}