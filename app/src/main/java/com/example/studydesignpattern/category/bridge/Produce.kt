package com.example.studydesignpattern.category.bridge

interface Workshop {
    fun work(): String
}

class Produce : Workshop {
    override fun work(): String = "Produced"
}
