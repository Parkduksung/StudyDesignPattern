package com.example.studydesignpattern.category.decorator

class Milk(private val beverage: Beverage) :Beverage() {

    override fun cost(): Int {
        return  beverage.cost() + 500
    }

    override fun getDescription(): String {
        return beverage.getDescription() + ", Add Milk"
    }
}