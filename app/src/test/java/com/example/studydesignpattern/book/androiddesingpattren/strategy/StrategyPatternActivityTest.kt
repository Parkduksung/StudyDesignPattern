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


}