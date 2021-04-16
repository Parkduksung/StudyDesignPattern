package com.example.studydesignpattern.category.decorator



abstract class Beverage {

    private val description = "Beverage"

    abstract fun cost(): Int

    open fun getDescription(): String = description
}

class HouseCoffee : Beverage() {
    override fun cost(): Int {
        return 2000
    }

    override fun getDescription(): String {
        return super.getDescription() + ", Add HouseCoffee"
    }

}


