package com.example.studydesignpattern.book.androiddesingpattren.builder

import org.junit.Assert.*
import org.junit.Test

class BuilderPatternActivityTest {

    @Test
    fun `Bagel 의 name 은 Bagel 이다`() {
        val bagel = Bagel()
        assert(bagel.name() == "Bagel")
    }

    @Test
    fun `Bagel 의 calories 는 200 이다`() {
        val bagel = Bagel()
        assert(bagel.calories() == 200)
    }

    @Test
    fun `Bun 의 name 은 Bun 이다`() {
        val bun = Bun()
        assert(bun.name() == "Bun")
    }

    @Test
    fun `Bun 의 calories 는 250 이다`() {
        val bun = Bun()
        assert(bun.calories() == 250)
    }


    @Test
    fun `CreamCheese 의 name 은 CreamCheese 이다`() {
        val creamCheese = CreamCheese()
        assert(creamCheese.name() == "CreamCheese")
    }

    @Test
    fun `CreamCheese 의 calories 는 300 이다`() {
        val creamCheese = CreamCheese()
        assert(creamCheese.calories() == 300)
    }

    @Test
    fun `SmokedSalmon 의 name 은 SmokedSalmon 이다`() {
        val smokedSalmon = SmokedSalmon()
        assert(smokedSalmon.name() == "SmokedSalmon")
    }

    @Test
    fun `SmokedSalmon 의 calories 는 400 이다`() {
        val smokedSalmon = SmokedSalmon()
        assert(smokedSalmon.calories() == 400)
    }

    @Test
    fun `Sandwich 의 addIngredient 에 Bun 을 추가하면 getCalories 값은 250 이어야 한다`() {

        val sandwich = Sandwich().apply {
            addIngredient(Bun())
        }

        assert(sandwich.getCalories() == 250)

    }

    @Test
    fun `Sandwich 의 addIngredient 에 Bun 을 추가하면 getSandwich 값은 Add Bun 이어야 한다`() {

        val sandwich = Sandwich().apply {
            addIngredient(Bun())
        }

        print(sandwich.getSandwich())

        assert(sandwich.getSandwich() == "Description Add Bun")
    }

}