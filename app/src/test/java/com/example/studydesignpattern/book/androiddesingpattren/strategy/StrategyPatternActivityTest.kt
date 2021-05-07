package com.example.studydesignpattern.book.androiddesingpattren.strategy

import org.junit.Test

class StrategyPatternActivityTest {


    @Test
    fun `소주의 도수는 18도 이어야 한다`() {

        val soju = Soju()

        assert(soju.alcohol() == 18)

    }

    @Test
    fun `소주의 가격은 3000원 이어야 한다`() {

        val soju = Soju()

        assert(soju.price() == 3000)
    }

    @Test
    fun `맥주의 도수는 5도 이어야 한다`() {

        val bear = Bear()

        assert(bear.alcohol() == 5)

    }

    @Test
    fun `맥주의 가격은 2500원 이어야 한다`() {

        val bear = Bear()

        assert(bear.price() == 2500)
    }


    @Test
    fun `양주의 도수는 40도 이어야 한다`() {

        val whiskey = Whiskey()

        assert(whiskey.alcohol() == 40)

    }

    @Test
    fun `양주의 가격은 30000원 이어야 한다`() {

        val whiskey = Whiskey()

        assert(whiskey.price() == 30000)
    }


    @Test
    fun `DrinkImpl 에 setDrink 를 Soju 로 했을 시에 alcohol 이 18 가격이 3000 이어야 한다`() {

        val drinkImpl = DrinkImpl().apply {
            setDrink(Soju())
        }

        assert(drinkImpl.getDrink().alcohol() == 18)
        assert(drinkImpl.getDrink().price() == 3000)

    }

    @Test
    fun `DrinkImpl 에 setDrink 를 Bear 로 했을 시에 alcohol 이 5 가격이 2500 이어야 한다`() {
        val drinkImpl = DrinkImpl().apply {
            setDrink(Bear())
        }

        assert(drinkImpl.getDrink().alcohol() == 5)
        assert(drinkImpl.getDrink().price() == 2500)
    }

    @Test
    fun `DrinkImpl 에 setDrink 를 Whiskey 로 했을 시에 alcohol 이 40 가격이 30000 이어야 한다`() {
        val drinkImpl = DrinkImpl().apply {
            setDrink(Whiskey())
        }

        assert(drinkImpl.getDrink().alcohol() == 40)
        assert(drinkImpl.getDrink().price() == 30000)
    }

    @Test
    fun `DrinkImpl 에 setDrink 를 Soju 이고 나서 setDrink 값을 Whiskey 로 바꾸게 되면 alcohol 이 40 가격이 30000 이어야 한다`() {

        val drinkImpl = DrinkImpl().apply {
            setDrink(Soju())
        }

        assert(drinkImpl.getDrink().alcohol() == 18)
        assert(drinkImpl.getDrink().price() == 3000)

        drinkImpl.setDrink(Whiskey())

        assert(drinkImpl.getDrink().alcohol() == 40)
        assert(drinkImpl.getDrink().price() == 30000)
    }

}