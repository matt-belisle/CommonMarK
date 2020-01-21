package com.matt.belisle.commonmark.ast

import com.matt.belisle.commonmark.TestCase
import com.matt.belisle.commonmark.TestCases
import com.matt.belisle.commonmark.parser.CommonMarkParser

import org.junit.Assert
import org.junit.ComparisonFailure

abstract class BasicBlockTest {
    protected var document = Document()

    fun specTest(type: String){
        runSpecTest(TestCases.testCases.filter { it.section == type }, false)
    }
    fun specTest(example: Int){
        runSpecTest(TestCases.testCases.filter { it.example == example }, true)
    }

    fun specTest(test: TestCase){
        runSpecTest(listOf(test), true)
    }

    private fun runSpecTest(tests : List<TestCase>, singleTest: Boolean){
        var failed = false
        val parser = CommonMarkParser()
        tests.forEach {
            println("Parsing ${it.example}")
            val parsed = parser.parse(it.markdown.split('\n').dropLast(1))
            val rendered = parsed.render()
            //TODO for now keep here as just wanting to see block structure is correct, once inlines started do not have this
            try{
                Assert.assertEquals(
                    "test ${it.example} Failed\n Parsed: $rendered\nExpected: ${it.html}",
                    it.html,
                    rendered
                )
            } catch (e: ComparisonFailure){
                if(singleTest) throw e
                println(e.message!!)
                failed = true
            }
        }
        Assert.assertFalse(failed)
    }
}