package com.matt.belisle.commonmark.ast.leafBlocks.util

//Start condition: line begins with a complete open tag
// (with any tag name other than script, style, or pre) or a complete closing tag, followed only by whitespace or the end of the line.
// note that script style or pre are ran in type 1 which should always be ran before this so this doesn't account for that
class HTMLType7Matcher(line: String) {
    private val lexer = Lexer(line)

    fun startsWithMatch(): Boolean{
        if(!lexer.inspect('<')){
            return false
        }
        lexer.advanceCharacter()
        // closing tag if the next character is /
        return if(lexer.inspect('/')){
            lexer.advanceCharacter()
            closingTag()
        } else {
            openTag()
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
        if(!lexer.inspect('>'))
            return false
        lexer.advanceCharacter()
        return lexer.restOfLineIsEmpty()
    }

    //A closing tag consists of the string </, a tag name, optional whitespace, and the character >.
    private fun closingTag(): Boolean {
        if(!tagName()){
            return false
        }

        // optional so just remove if we can
        lexer.skipSpaces()

        if(!lexer.inspect('>')){
            return false
        }
        lexer.advanceCharacter()
        return lexer.restOfLineIsEmpty()

    }
    // A tag name consists of an ASCII letter followed by zero or more ASCII letters, digits, or hyphens (-).
    private fun tagName(): Boolean {
        if(!lexer.isAsciiChar()){
            return false
        }
        // one character is enough to be a valid tagName, so the advanceWhile will move the lexer to the point the name is done
        // (with any tag name other than script, style, or pre)
        val tagName = lexer.returnMatchedWhile { com.matt.belisle.commonmark.parser.inlineMatchers.isAsciiChar(it) || it.isDigit() || it == '-'}
        return !lexer.isEndOfLine() &&
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
        return !lexer.isEndOfLine()
    }

    // An attribute value specification consists of optional whitespace,
    // a = character, optional whitespace, and an attribute value.
    // note the initial whitespace is handled in attribute
    private fun attributeValueSpecification(): Boolean {
        if(!lexer.inspect('='))
            return false

        lexer.advanceCharacter()
        lexer.skipSpaces()
        return !lexer.isEndOfLine() && attributeValue()

    }
    //An attribute value consists of an unquoted attribute value,
    // a single-quoted attribute value, or a double-quoted attribute value.
    private fun attributeValue(): Boolean {
        when {
            lexer.inspect('\'') -> singleQuotedAttributeValue()
            lexer.inspect('"') -> doubleQuotedAttributeValue()
            else -> unquotedAttributeValue()
        }
        return !lexer.isEndOfLine()
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
        if(lexer.isEndOfLine())
            return
        else {
            lexer.advanceCharacter()
        }
    }
    //A single-quoted attribute value consists of ', zero or more characters not including ', and a final '.
    private fun singleQuotedAttributeValue() {
        // pre check the initial quote
        lexer.advanceCharacter()
        lexer.advanceWhile { it != '\'' }
        if(lexer.isEndOfLine())
            return
        else {
            lexer.advanceCharacter()
        }
    }

    // An attribute name consists of an ASCII letter, _, or :,
    // followed by zero or more ASCII letters, digits, _, ., :, or -
    private fun attributeName(): Boolean {
        if(!lexer.inspect(this::testAttributeNameOpener))
            return false

        lexer.advanceCharacter()

        lexer.advanceWhile { testAttributeNameOpener(it) || it.isDigit() || it == '.' || it == '-' }
        return !lexer.isEndOfLine()
    }

    private fun testAttributeNameOpener(it: Char): Boolean = com.matt.belisle.commonmark.parser.inlineMatchers.isAsciiChar(
        it
    ) || it == '_'|| it == ':'


}