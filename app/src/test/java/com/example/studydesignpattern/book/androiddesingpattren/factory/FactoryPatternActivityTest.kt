package com.example.studydesignpattern.book.androiddesingpattren.factory

import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.junit.MockitoJUnitRunner


@RunWith(MockitoJUnitRunner::class)
class FactoryPatternActivityTest {

    @Mock
    lateinit var breadFactory: BreadFactory


    @Before
    fun setup() {
        breadFactory = Mockito.mock(BreadFactory::class.java)
    }

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

    @Test
    fun `BreadFactory 의 getBread 의 parameter 값이 Baguette 이면 생성된 Bread 의 이름이 Baguette 이어야 한다`() {

        Mockito.`when`(breadFactory.getBread("Baguette")).thenReturn(Baguette())

        assert(breadFactory.getBread("Baguette").name() == "Baguette")

    }

    @Test
    fun `BreadFactory 의 getBread 의 parameter 값이 Baguette 이면 생성된 Bread 의 칼로리가 150 이어야 한다`() {

        Mockito.`when`(breadFactory.getBread("Baguette")).thenReturn(Baguette())

        assert(breadFactory.getBread("Baguette").calories() == 150)
    }

    @Test
    fun `BreadFactory 의 getBread 의 parameter 값이 Roll 이면 생성된 Bread 의 이름이 Roll 이어야 한다`() {

        Mockito.`when`(breadFactory.getBread("Roll")).thenReturn(Roll())

        assert(breadFactory.getBread("Roll").name() == "Roll")

    }

    @Test
    fun `BreadFactory 의 getBread 의 parameter 값이 Roll 이면 생성된 Bread 의 칼로리가 200 이어야 한다`() {

        Mockito.`when`(breadFactory.getBread("Roll")).thenReturn(Roll())

        assert(breadFactory.getBread("Roll").calories() == 200)
    }

    @Test
    fun `BreadFactory 의 getBread 의 parameter 값이 Brioche 이면 생성된 Bread 의 이름이 Brioche 이어야 한다`() {

        Mockito.`when`(breadFactory.getBread("Brioche")).thenReturn(Brioche())

        assert(breadFactory.getBread("Brioche").name() == "Brioche")

    }

    @Test
    fun `BreadFactory 의 getBread 의 parameter 값이 Brioche 이면 생성된 Bread 의 칼로리가 175 이어야 한다`() {

        Mockito.`when`(breadFactory.getBread("Brioche")).thenReturn(Brioche())

        assert(breadFactory.getBread("Brioche").calories() == 175)
    }

}