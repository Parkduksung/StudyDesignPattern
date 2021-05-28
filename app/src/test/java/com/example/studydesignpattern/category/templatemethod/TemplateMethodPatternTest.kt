package com.example.studydesignpattern.category.templatemethod

import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class TemplateMethodPatternTest {


    @Test
    fun `ColdBrew 의 totalCaffeine 은 10 이어야 한다`() {

        val coldBrew = ColdBrew()

        assert(coldBrew.totalCaffeine() == 10)
    }

    @Test
    fun `ColdBrew 의 temperature 값은 4 이어야 한다`() {

        val coldBrew = ColdBrew()

        assert(coldBrew.temperature() == 4)
    }


    @Test
    fun `Americano 의 totalCaffeine 은 8 이어야 한다`() {

        val americano = Americano()

        assert(americano.totalCaffeine() == 8)

    }

    @Test
    fun `Americano 의 temperature 값은 2 이어야 한다`() {
        val americano = Americano()

        assert(americano.temperature() == 2)
    }

    @Test
    fun `ColdBrew 의 prepareRecipe 값은 "카페인 10 온도 4" 이어야 한다`() {

        val coldBrew: CaffeineBeverage = ColdBrew()

        assertEquals(coldBrew.prepareRecipe(), "카페인 10 온도 4")
    }


    @Test
    fun `Americano 의 prepareRecipe 값은 "카페인 8 온도 2" 이어야 한다`() {

        val americano: CaffeineBeverage = Americano()

        assertEquals(americano.prepareRecipe(), "카페인 8 온도 2")
    }

}

