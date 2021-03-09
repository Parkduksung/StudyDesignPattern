package com.example.studydesignpattern

import org.junit.Test

class StrategyPatternTest(private val stringFormatterStrategy: (String) -> String) {

    fun printString(string: String) {
        println(stringFormatterStrategy(string))
    }
}

val lowerCaseFormatter: (String) -> String = { it.toLowerCase() }
val upperCaseFormatter: (String) -> String = { it.toUpperCase() }

class StrategyTest {

    @Test
    fun strategy() {

        val inputString = "LOREM ipsum DOLOR sit amet"

        val lowerCasePrinter = StrategyPatternTest(lowerCaseFormatter)
        lowerCasePrinter.printString(inputString)

        val upperCasePrinter = StrategyPatternTest(upperCaseFormatter)
        upperCasePrinter.printString(inputString)

        val prefixPrinter = StrategyPatternTest { "Prefix: $it" }
        prefixPrinter.printString(inputString)
    }

}