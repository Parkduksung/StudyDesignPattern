package com.example.studydesignpattern.category.command

class EatCommand(private val eat: Eat) : Behavior {
    override fun execute(): String {
        return eat.start()
    }
}
