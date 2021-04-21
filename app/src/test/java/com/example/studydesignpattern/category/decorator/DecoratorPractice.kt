package com.example.studydesignpattern.category.decorator

import org.junit.Test

class DecoratorPractice {


    @Test
    fun `빵의 종류를 베이글로 하였을때, 명세서에 Description Add Bagel 이라고 명세되어야 한다`() {

        val bagel = Bagel()

        assert(bagel.getDescription() == "Description Add Bagel")
    }

    @Test
    fun `빵의 종류를 베이글로 하였을때, 칼로리는 250 이어야 한다`() {

        val bagel = Bagel()

        assert(bagel.getKcal() == 250)

    }

    @Test
    fun `빵의 종류를 번으로 하였을때, 명세서에 Description Add Bun 이라고 명세되어야 한다`() {

        val bun = Bun()

        assert(bun.getDescription() == "Description Add Bun")
    }

    @Test
    fun `빵의 종류를 번으로 하였을때, 칼로리는 150 이어야 한다`() {

        val bun = Bun()

        assert(bun.getKcal() == 150)

    }

    @Test
    fun `빵의 종류가 토스트된 베이글일때, 명세서에 Description Add Bagel Add Toasted 이라고 명세되어야 한다`() {

        val toastedBagel = Toasted(Bagel())

        assert(toastedBagel.getDescription() == "Description Add Bagel Add Toasted")

    }

    @Test
    fun `빵의 종류가 토스트된 베이글일때, 칼로리가 300 이어야 한다`() {

        val toastedBagel = Toasted(Bagel())

        assert(toastedBagel.getKcal() == 300)

    }

    @Test
    fun `빵의 종류가 오븐된 베이글일때, 명세서에 Description Add Bagel Add Oven 이라고 명세되어야 한다`() {

        val ovenBagel = Oven(Bagel())

        assert(ovenBagel.getDescription() == "Description Add Bagel Add Oven")

    }

    @Test
    fun `빵의 종류가 오븐된 베이글일때, 칼로리가 260 이어야 한다`() {

        val ovenBagel = Oven(Bagel())

        assert(ovenBagel.getKcal() == 260)

    }

}