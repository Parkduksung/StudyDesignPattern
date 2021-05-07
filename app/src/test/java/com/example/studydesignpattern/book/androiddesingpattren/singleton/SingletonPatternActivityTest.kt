package com.example.studydesignpattern.book.androiddesingpattren.singleton

import org.junit.Assert.*
import org.junit.Test

class SingletonPatternActivityTest {


    @Test
    fun `SingletonPerson 의 getName 기본값은 Parkduksung 이어야 한다`() {

        val person = SingletonPerson

        assert(person.getName() == "Parkduksung")
    }

    @Test
    fun `SingletonPerson 의 setName 으로 duksung 했을때 getName 값은 duksung 이어야 한다`() {
        val person = SingletonPerson.apply {
            setName("duksung")
        }

        assert(person.getName() == "duksung")
    }

}