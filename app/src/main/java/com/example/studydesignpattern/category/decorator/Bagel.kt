package com.example.studydesignpattern.category.decorator


abstract class Bread {

    private val description = "Description"

    private val cost = 0

    open fun getDescription(): String {
        return description
    }

    open fun getKcal(): Int {
        return cost
    }

}


class Bagel : Bread() {

    override fun getDescription(): String =
        super.getDescription() + " Add Bagel"

    override fun getKcal(): Int =
        super.getKcal() + 260
}
