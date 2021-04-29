package com.example.studydesignpattern.category.templatemethod

import org.junit.Assert.*
import org.junit.Test

class TemplateMethodPatternTest {


    @Test
    fun `ConcreteClass 의 hock1 의 결과가 ABSTRACT hook1 implementation 이어야 한다`(){

        val concreteClass = ConcreteClass()

        assert(concreteClass.hock1() == "ABSTRACT hook1 implementation")


    }

    @Test
    fun `ConcreteClass 의 hock2 의 결과가 ABSTRACT hook2 implementation 이어야 한다`(){

        val concreteClass = ConcreteClass()

        assert(concreteClass.hock2() == "ABSTRACT hook2 implementation")
    }

    @Test
    fun `ConcreteClass 의 templateMethod 의 결과는 ABSTRACT hook1 implementation ABSTRACT hook2 implementation 이어야 한다` (){

        val concreteClass = ConcreteClass()

        assert(concreteClass.templateMethod() == "ABSTRACT hook1 implementation ABSTRACT hook2 implementation")

    }

}