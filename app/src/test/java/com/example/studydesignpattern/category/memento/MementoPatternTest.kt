package com.example.studydesignpattern.category.memento

import org.junit.Assert.*
import org.junit.Test

class MementoPatternTest {


    @Test
    fun `User("initial Log") 의 log 값은 "initial Log" 이어야 한다`() {

        val user = User("initial Log")

        assertEquals(user.log, "initial Log")

    }

    @Test
    fun `User("initial Log") 의 createMemento 의 log 값은 "initial Log" 이어야 한다`() {

        val user = User("initial Log")

        assertEquals(user.createLogMemento().log, "initial Log")

    }

    @Test
    fun `User("initial Log") 의 restore(LogMemento("second Log")) 후의 log 값은 "second Log" 이어야 한다`() {

        val user = User("initial Log")

        user.restore(LogMemento("second Log"))

        assertEquals(user.log, "second Log")

    }


    @Test
    fun `LogCollect 에 User("initial Log") createMemento 를 saveLog 하고 restore(0) log 값은 initial Log 이어야 한다`() {

        val logCollect = LogCollect()
        val user = User("initial Log")

        logCollect.saveLog(user.createLogMemento())

        assertEquals(logCollect.restore(0).log, "initial Log")
    }


    @Test
    fun `LogCollect 에 User("initial Log") 가 saveLog 되어있는 상태에서 log값을 "second Log" 로 바꾸고 createMemento 를 saveLog 하고 restore(1) log 값은 second Log 이어야 한다`() {

        val logCollect = LogCollect()
        val user = User("initial Log")
        logCollect.saveLog(user.createLogMemento())

        user.log = "second Log"

        logCollect.saveLog(user.createLogMemento())

        assertEquals(logCollect.restore(1).log, "second Log")
    }


    @Test
    fun `LogCollect 에 User("initial Log") 가 saveLog 되어있는 상태에서 log값을 "second Log" 로 바꾸고 createMemento 를 saveLog 하고 log 값을 "third Log" 바꾸고 앞에 저장하는걸 반복하였을때, logCollect 의 restore(0) 값은 "initial Log" , restore(1) 값은 "second Log" restore(2) 는 "third Log" 이어야 한다`() {

        val logCollect = LogCollect()
        val user = User("initial Log")
        logCollect.saveLog(user.createLogMemento())

        user.log = "second Log"
        logCollect.saveLog(user.createLogMemento())

        user.log = "third Log"
        logCollect.saveLog(user.createLogMemento())

        assertEquals(logCollect.restore(0).log, "initial Log")
        assertEquals(logCollect.restore(1).log, "second Log")
        assertEquals(logCollect.restore(2).log, "third Log")
    }

}