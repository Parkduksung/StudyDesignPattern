package com.example.studydesignpattern.category.command

import java.util.*

class CommandPattern {
}


//interface Command {
//    fun execute()
//}

//class PowerCommand : Command {
//    private var isPower: Boolean = false
//    override fun execute() {
//        isPower != isPower
//    }
//}
//
//class Invoker(private val command: Command) {
//    fun run() {
//        command.execute()
//    }
//}


interface Behavior {
    fun execute(): String
}

interface Command {
    fun start(): String
}

class Eat {
    fun start(): String {
        return "먹는다"
    }
}

class Sleep {
    fun start(): String {
        return "잠잔다"
    }
}

class Work {
    fun start(): String {
        return "일한다"
    }
}

class SleepCommand(private val sleep: Sleep) : Behavior {
    override fun execute(): String {
        return sleep.start()
    }
}

class EatCommand(private val eat: Eat) : Behavior {
    override fun execute(): String {
        return eat.start()
    }
}

class WorkCommand(private val work: Work) : Behavior {
    override fun execute(): String {
        return work.start()
    }
}

class Human {

    private val behaviorStack = Stack<Behavior>()

    fun setBehavior(behavior: Behavior) {
        behaviorStack.push(behavior)
    }

    fun undo() {
        behaviorStack.pop()
    }

    fun run(): String {
        var result = ""
        behaviorStack.forEach {
            result += it.execute()
        }

        return result
    }

}




