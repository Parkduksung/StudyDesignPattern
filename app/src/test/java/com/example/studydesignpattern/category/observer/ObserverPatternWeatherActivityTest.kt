package com.example.studydesignpattern.category.observer

import org.junit.After
import org.junit.Assert.*
import org.junit.Before
import java.io.ByteArrayOutputStream
import java.io.PrintStream

class ObserverPatternWeatherActivityTest {

    private val standardOut: PrintStream? = System.out
    private val outputStreamCaptor: ByteArrayOutputStream = ByteArrayOutputStream()


    @Before
    fun setUp() {
        System.setOut(PrintStream(outputStreamCaptor))
    }


    @After
    fun tearDown() {
        System.setOut(standardOut)
    }



}