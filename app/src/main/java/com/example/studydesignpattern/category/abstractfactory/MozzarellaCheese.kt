package com.example.studydesignpattern.category.abstractfactory

interface Cheese {
    fun name(): String
}

class MozzarellaCheese : Cheese {
    override fun name(): String {
        return "MozzarellaCheese"
    }
}

class RicottaCheese : Cheese {
    override fun name(): String {
        return "RicottaCheese"
    }
}
