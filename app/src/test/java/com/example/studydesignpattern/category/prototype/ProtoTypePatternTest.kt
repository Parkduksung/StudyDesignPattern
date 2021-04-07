package com.example.studydesignpattern.category.prototype

import com.example.studydesignpattern.BaseTest
import org.junit.Assert.assertEquals
import org.junit.Test

class ProtoTypePatternTest : BaseTest() {

    @Test
    fun `clone 을 하여 생성시, 올바르게 출력된다`() {

        //given
        val protoTypePatternA = ProtoTypePattern()

        //when
        val protoTypePatternB = protoTypePatternA.clone()

        //then
        assertEquals("cloneProtoTypePattern", outputStreamCaptor.toString())
    }
}