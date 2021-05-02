package com.example.studydesignpattern.category

import org.junit.Assert.*
import org.junit.Test

class FacadePatternTest {

    @Test
    fun `Circle 의 run 의 값은 RunCircle 이다`() {
        val circle = Circle()

        assert(circle.run() == "RunCircle")
    }

    @Test
    fun `Rhombus 의 run 의 값은 RunRhombus 이다`() {

        val rhombus = Rhombus()

        assert(rhombus.run() == "RunRhombus")
    }

    @Test
    fun `Triangle 의 run 의 값은 RunTriangle 이다`() {

        val triangle = Triangle()

        assert(triangle.run() == "RunTriangle")
    }




}