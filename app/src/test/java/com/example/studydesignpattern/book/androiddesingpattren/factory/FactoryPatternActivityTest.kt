package com.example.studydesignpattern.book.androiddesingpattren.factory

import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.junit.MockitoJUnitRunner


@RunWith(MockitoJUnitRunner::class)
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

//    petService = Mockito.mock(PetService::class.java)
//    Mockito.`when`(petService.listPets()).thenReturn(getPetList())

    @Test
    fun `BreadFactory 의 getBread 의 parameter 값이 Baguette 이면 생성된 Bread 의 이름이 Baguette 이어야 한다`() {

        val breadFactory = Mockito.mock(BreadFactory::class.java)
        Mockito.`when`(breadFactory.getBread("Baguette")).thenReturn(Baguette())

        assert(breadFactory.name() == "Baguette")

    }

    @Test
    fun `BreadFactory 의 getBread 의 parameter 값이 Baguette 이면 생성된 Bread 의 칼로리가 150 이어야 한다`() {

        val breadFactory = Mockito.mock(BreadFactory::class.java)
        Mockito.`when`(breadFactory.getBread("Baguette")).thenReturn(Baguette())

        assert(breadFactory.calories() == 150)
    }


}