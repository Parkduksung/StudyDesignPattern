package com.example.studydesignpattern.category.factorymethod

import com.example.studydesignpattern.BaseTest
import org.junit.Assert.assertEquals
import org.junit.Test

class FactoryMethodPatternTest : BaseTest() {


    @Test
    fun `타입이 product1 인 생성된 팩토리에서 operation 을 실행할때, 올바르게 출력된다`() {

        //given
        val creator : Creator = CreatorFactory("product1")

        //when
        creator.operation()

        //then
        assertEquals("CreateProduct1",outputStreamCaptor.toString())
    }

}