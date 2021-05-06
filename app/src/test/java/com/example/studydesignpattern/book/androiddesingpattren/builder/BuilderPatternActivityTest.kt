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


}