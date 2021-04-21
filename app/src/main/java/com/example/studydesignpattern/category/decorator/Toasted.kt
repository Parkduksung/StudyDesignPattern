package com.example.studydesignpattern.category.decorator

class Toasted(private val bagel: Bagel) {

    fun getDescription() : String =
        bagel.getDescription() + " Add Toasted"

    fun getKcal() : Int =
        bagel.getKcal() + 50
}
