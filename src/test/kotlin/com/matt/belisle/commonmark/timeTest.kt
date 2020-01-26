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
        val testCasesFile = File("src/test/resources/test.md")
        val parser = CommonMarkParser()
        val lines = testCasesFile.readLines().map { "$it" }
        val times = mutableListOf<Duration>()
        // warm up the JVM...
        val parsed = parser.parse(lines)
        val rendered = parsed.render()
        for(i in 0..20) {
            val begin = Instant.now()
            val parsed = parser.parse(lines)
            val rendered = parsed.render()
            val end = Instant.now()
            times.add(Duration.between(begin,end))
            println("TotalTime: ${Duration.between(begin, end)}")
        }
        val seconds = times.map { it.toMillis() }

        println("Average Time: ${seconds.average()} ")
//        specTest(35)
    }
}