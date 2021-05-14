package com.example.studydesignpattern.category.command

import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.junit.MockitoJUnitRunner
import org.testng.AssertJUnit.assertEquals

@RunWith(MockitoJUnitRunner::class)
class CommandPatternTest {

    companion object{
        private const val CHECK_STRING_SLEEP = "잠잔다"
    }

    lateinit var sleepCommand: SleepCommand

    @Mock
    lateinit var sleep: Sleep


    @Test
    fun `sleepCommand 의 생성자가 Sleep 일때 start 가 잠잔다 이어야 한다`() {
        sleep = Mockito.mock(Sleep::class.java)
        sleepCommand = SleepCommand(sleep)

        Mockito.`when`(sleep.start()).thenReturn(CHECK_STRING_SLEEP)

        assertEquals(sleepCommand.execute() , CHECK_STRING_SLEEP)
    }


    @Test
    fun `Eat 의 execute 의 값이 먹는다 이어야 한다`() {

        val eat = Eat()

        assert(eat.start() == "먹는다")

    }

    @Test
    fun `Sleep 의 execute 의 값이 잠잔다 이어야 한다`() {

        val sleep = Sleep()

        assert(sleep.start() == "잠잔다")

    }

    @Test
    fun `ConcreteCommand(Sleep()) 의 execute 값이 잠잔다 이어야 한다`() {

        val concreteCommandSleep = SleepCommand(Sleep())

        assert(concreteCommandSleep.execute() == "잠잔다")

    }

    @Test
    fun `ConcreteCommand(Eat()) 의 execute 값이 먹는다 이어야 한다`() {
        val concreteCommandEat = EatCommand(Eat())

        assert(concreteCommandEat.execute() == "먹는다")
    }


    @Test
    fun `Human 이 setBehavior 를 Eat, Sleep 하였을 때 먹는다잠잔다 이어야 한다`() {

        val human = Human()
        val concreteCommandEat: Behavior = EatCommand(Eat())
        val concreteCommandSleep: Behavior = SleepCommand(Sleep())

        human.apply {
            setBehavior(concreteCommandEat)
            setBehavior(concreteCommandSleep)
        }
        assert(human.run() == "먹는다잠잔다")
    }


}
