package com.matt.belisle.commonmark

import kotlinx.serialization.Serializable
import kotlinx.serialization.internal.ArrayListSerializer
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonConfiguration
import java.io.File

@Serializable
data class TestCase(val markdown: String, val html: String, val example: Int, val start_line: Int, val end_line: Int, val section: String)

object TestCases {
    val testCases: List<TestCase>
    init {
        val json = Json(JsonConfiguration.Stable)
        val testCasesFile = File("src/test/resources/TestCases.json")
        val lines = testCasesFile.readLines().joinToString("")
        testCases = json.parse(ArrayListSerializer(TestCase.serializer()), lines)
    }

}