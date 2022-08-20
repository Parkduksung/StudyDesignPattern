package com.example.studydesignpattern.category.composite

import org.junit.Assert.assertEquals
import org.junit.Test

class CompositeExamTest1 {

    @Test
    fun `Num(1) 의 getCount()  값은 1 이어야 한다`() {

        val num = Num(1)

        assertEquals(num.getCount(), 1)

    }

    @Test
    fun `Num(2) 의 getCount()  값은 2 이어야 한다`() {

        val num = Num(2)

        assertEquals(num.getCount(), 2)
    }


    @Test
    fun `Sum(Num(1),Num(2)) 의 getCount()  값은 3 이어야 한다`() {

        val num1 = Num(1)
        val num2 = Num(2)

        val sum = Sum(num1, num2)

        assertEquals(sum.getCount(), 3)
    }

    @Test
    fun `Sum(Sum(Num(1),Num(2)),Num(3)) 의 getCount()  값은 6 이어야 한다`() {

        val num1 = Num(1)
        val num2 = Num(2)
        val num3 = Num(3)

        val sum1 = Sum(num1, num2)

        val sum2 = Sum(sum1, num3)
        assertEquals(sum2.getCount(), 6)
    }


    @Test
    fun `결과 테스트`() {

        val sample = Sum(Sum(Num(1), Num(2)), Num(3))
        assertEquals(sample.getCount(), 6)

    }
}

interface Component {
    fun getCount(): Int
}

class Num(private val num: Int) : Component {
    override fun getCount(): Int = num
}

class Sum(private vararg val num: Component) : Component {
    override fun getCount(): Int = num.sumOf { it.getCount() }
}
