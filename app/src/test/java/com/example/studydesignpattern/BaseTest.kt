package com.example.studydesignpattern

import org.junit.After
import org.junit.Before
import java.io.ByteArrayOutputStream
import java.io.PrintStream

abstract class BaseTest {
    protected val standardOut: PrintStream? = System.out
    protected val outputStreamCaptor: ByteArrayOutputStream = ByteArrayOutputStream()

    @Before
    fun setUp() {
        System.setOut(PrintStream(outputStreamCaptor))
    }

    @After
    fun tearDown() {
        System.setOut(standardOut)
    }
}