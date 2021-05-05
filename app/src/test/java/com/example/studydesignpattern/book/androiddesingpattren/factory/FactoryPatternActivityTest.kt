package com.example.studydesignpattern.book.androiddesingpattren.factory

import org.junit.Assert.*
import org.junit.Test

class FactoryPatternActivityTest {


    @Test
    fun `Baguette 의 name 은 Baguette 이어야 한다`() {

        val baguette = Baguette()

        assert(baguette.name() == "Baguette")

    }


    @Test
    fun `Baguette 의 calories 는 150 이어야 한다`() {

        val baguette = Baguette()

        assert(baguette.calories() == 150)


    }

    @Test
    fun `Roll 의 name 은 Roll 이어야 한다`() {
        val roll = Roll()

        assert(roll.name() == "Roll")

    }


    @Test
    fun `Roll 의 calories 는 200 이어야 한다`() {
        val roll = Roll()

        assert(roll.calories() == 200)


    }

    @Test
    fun `Brioche 의 name 은 Brioche 이어야 한다`() {
        val brioche = Brioche()

        assert(brioche.name() == "Brioche")

    }


    @Test
    fun `Brioche 의 calories 는 175 이어야 한다`() {
        val brioche = Brioche()

        assert(brioche.calories() == 175)

    }


}