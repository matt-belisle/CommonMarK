package com.matt.belisle.commonmark.ast.inlineElements

abstract class Emphasis<T> {
    abstract val delimiter: Char
    abstract fun makeRun(length: Int, before: Char, after: Char, startingIndex: Int): Run


    /*
    A left-flanking delimiter run is a delimiter run that is (1) not followed by Unicode whitespace,
    and either (2a) not followed by a punctuation character,
    or (2b) followed by a punctuation character and preceded by Unicode whitespace or a punctuation character.
    For purposes of this definition, the beginning and the end of the line count as Unicode whitespace.
    */
    internal fun leftFlanking(after: Char, before: Char): Boolean {

        //1
        if (after.isWhitespace()) {
            return false
        }
        val followingPunctuation = isPunctuation(after)
        val precedingPunctuation = isPunctuation(before)
        //2b
        if (followingPunctuation && (precedingPunctuation || before.isWhitespace())) {
            return true
        }
        //2a
        return !followingPunctuation
    }

    abstract fun createEmphasis(inlines: List<Inline>, strong: Boolean): T


    /*
    A right-flanking delimiter run is a delimiter run that is (1) not preceded by Unicode whitespace,
    and either (2a) not preceded by a punctuation character,
    or (2b) preceded by a punctuation character and followed by Unicode whitespace or a punctuation character. For purposes of this definition,
    the beginning and the end of the line count as Unicode whitespace.
     */
    // this is just left flanking reversed.
    internal fun rightFlanking(after: Char, before: Char) = leftFlanking(before, after)

    internal fun getRunType(opener: Boolean, closer: Boolean): RunType {
        return if(opener && closer){
                RunType.BOTH
            } else if(opener){
                RunType.OPENER
            } else if(closer) {
                RunType.CLOSER
            } else {
                RunType.NONE
            }
    }


    internal fun isPunctuation(char: Char): Boolean {
        //I'm only going to deal with ASCII to start
        //TODO Add unicode punctuation
        return when (char) {
            '!' -> true
            '"' -> true
            '#' -> true
            '$' -> true
            '%' -> true
            '&' -> true
            '\'' -> true
            '(' -> true
            ')' -> true
            '*' -> true
            '+' -> true
            '-' -> true
            '.' -> true
            '/' -> true
            ':' -> true
            ';' -> true
            '<' -> true
            '=' -> true
            '>' -> true
            '?' -> true
            '@' -> true
            '[' -> true
            '\\' -> true
            ']' -> true
            '^' -> true
            '_' -> true
            '`' -> true
            '{' -> true
            '|' -> true
            '}' -> true
            '~' -> true
            else -> false

        }
    }
}