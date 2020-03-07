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
        val tests =
            listOf(
                "hello15",
                "hello500",
                "hello1000",
                "hello5000",
                "hello10000",
                "hello50000",
                "hello100000",
                "test",
                "code"
            )
        //this was taking up ~20% of runtime for a debug flag, not indicative of performance
        System.setProperty("kotlinx.coroutines.debug","off")
        for(file in tests) {
            val testCasesFile = File("src/test/resources/$file.md")
            val parser = CommonMarkParser()
            val lines = testCasesFile.readLines().map { "$it" }
            val times = mutableListOf<Duration>()
            // warm up the JVM...
            val parsed = parser.parse(lines)
            val rendered = parsed.render()
            for (i in 0..1000) {
                val begin = Instant.now()
                val parsed = parser.parse(lines)
                val rendered = parsed.render()
                val end = Instant.now()
                times.add(Duration.between(begin, end))
            }
            val seconds = times.map { it.toMillis() }
            println("$file, ${seconds.average()}")
        }
//        specTest(35)
    }
}