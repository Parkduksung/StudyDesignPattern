package com.example.studydesignpattern.category.decorator

import com.example.studydesignpattern.BaseTest
import org.junit.Assert.assertEquals
import org.junit.Test

class DecoratorPatternTest : BaseTest() {

    @Test
    fun `vertical , horizontal 기능을 포함한 window 를 만들고 description 출력시, 추가된 내용이 모두 있어야 한다`() {

        val decorator: Window =
            VerticalScrollBarDecorator(HorizontalScrollBarDecorator(SimpleWindow()))


        decorator.getDescription()

        assertEquals(
            decorator.getDescription(),
            "SimpleWindow, including horizontal scrollbars, including vertical scrollbars"
        )

    }

}