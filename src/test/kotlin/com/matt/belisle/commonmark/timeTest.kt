package com.matt.belisle.commonmark

import com.matt.belisle.commonmark.parser.CommonMarkParser
import org.junit.Test
import java.io.File
import java.lang.StringBuilder
import java.time.Duration
import java.time.Instant

class timeTest(){
    @Test
    fun specTest(){
        val b = StringBuilder("hi    ")
        val x = b.dropLastWhile { it.isWhitespace() }
        //TODO 36 all require emphasis
        val testCasesFile = File("src/test/resources/test.md")
        val parser = CommonMarkParser()
        val lines = testCasesFile.readLines().map { "$it\n" }
        for(i in 0..5) {
            val begin = Instant.now()
            val parsed = parser.parse(lines)
            val rendered = parsed.render()
            val end = Instant.now()
            println("TotalTime: ${Duration.between(begin, end)}")
        }
//        specTest(35)
    }
}