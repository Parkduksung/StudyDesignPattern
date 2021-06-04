package com.example.studydesignpattern.category

import org.junit.Assert.*
import org.junit.Test

class DinnerMenuIteratorTest {

    @Test
    fun `Waitress 의 생성자로 DinerMenu 를 주입받았을때 printMenu 의 값이 Diner1,Diner2 이어야 한다`() {

        val waitress = Waitress(DinnerMenu())

        assertEquals("Diner1,Diner2", waitress.printMenu())

    }


    @Test
    fun `Waitress 의 생성자로 PancakeHouseMenu 를 주입받았을때 createIterators 의 값이 pancake1pancake2pancake3pancake4 이어야 한다`() {

        val waitress = Waitress(PancakeHouseMenu())

        assertEquals("pancake1,pancake2,pancake3,pancake4", waitress.printMenu())

    }

}