package com.matt.belisle.commonmark.ast.leafBlocks

import com.matt.belisle.commonmark.TestCases
import com.matt.belisle.commonmark.ast.Document
import com.matt.belisle.commonmark.parser.CommonMarkParser
import junit.framework.Assert.assertFalse
import org.junit.Assert
import org.junit.ComparisonFailure

abstract class BasicBlockTest {
    internal var document = Document()

    fun specTest(type: String){
        var failed = false
        val tests = TestCases.testCases.filter { it.section == type }
        val parser = CommonMarkParser()
        tests.forEach {
            val rendered = parser.parse(it.markdown.split('\n').dropLast(1)).render()
            //TODO for now keep here as just wanting to see block structure is correct, once inlines started do not have this
           try{
                Assert.assertEquals(
                    "test ${it.example} Failed\n Parsed: $rendered\nExpected: ${it.html}",
                    it.html,
                    rendered
                )
            } catch (e: ComparisonFailure){
               println(e.message!!)
               failed = true
           }
        }
        assertFalse(failed)
    }
}