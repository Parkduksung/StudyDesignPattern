package com.example.studydesignpattern.category.command

import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.junit.MockitoJUnitRunner
import org.testng.AssertJUnit.assertEquals

@RunWith(MockitoJUnitRunner::class)
class CommandPatternTest {



    @Test
    fun `Eat 의 start() 값은 먹는다 이어야 한다`() {
        val eat = Eat()

        assert(eat.start() == "먹는다")

    }

    @Test
    fun `Sleep 의 start() 값은 잠잔다 이어야 한다`() {
        val sleep = Sleep()

        assert(sleep.start() == "잠잔다")

    }

    @Test
    fun `Work 의 start() 값은 일한다 이어야 한다`() {
        val work = Work()

        assert(work.start() == "일한다")
    }

    @Test
    fun `SleepCommand(Sleep()) 의 execute 값이 잠잔다 이어야 한다`() {
        val sleepCommand = SleepCommand(Sleep())

        assert(sleepCommand.execute() == "잠잔다")
    }

    @Test
    fun `EatCommand(Eat()) 의 execute 값이 먹는다 이어야 한다`() {
        val eatCommand = EatCommand(Eat())

        assert(eatCommand.execute() == "먹는다")
    }

    @Test
    fun `WorkCommand(Work()) 의 execute 값이 일한다 이어야 한다`() {
        val workCommand = WorkCommand(Work())

        assert(workCommand.execute() == "일한다")
    }


    @Test
    fun `Human setBehavior 에 EatCommand(Eat()) 을 추가하였을때 run 의 값은 먹는다 이어야 한다`() {

        val human = Human()
        val concreteCommandEat: Behavior = EatCommand(Eat())

        human.apply {
            setBehavior(concreteCommandEat)
        }

        assert(human.run() == "먹는다")
    }


    @Test
    fun `Human setBehavior 에 WorkCommand(Work()), EatCommand(Eat()) , SleepCommand(Sleep()) 을 추가하였을때 run 의 값은 일한다먹는다잠잔다 이어야 한다`() {

        val human = Human()
        val concreteCommandWork: Behavior = WorkCommand(Work())
        val concreteCommandEat: Behavior = EatCommand(Eat())
        val concreteCommandSleep: Behavior = SleepCommand(Sleep())

        human.apply {
            setBehavior(concreteCommandWork)
            setBehavior(concreteCommandEat)
            setBehavior(concreteCommandSleep)
        }

        assert(human.run() == "일한다먹는다잠잔다")
    }


    @Test
    fun `Human setBehavior 에 EatCommand(Eat()) 을 추가하고 undo 실행하고 run 의 값은 "" 이어야 한다`() {

        val human = Human()
        val concreteCommandEat: Behavior = EatCommand(Eat())

        human.apply {
            setBehavior(concreteCommandEat)
        }
        human.undo()

        assert(human.run() == "")
    }


}
