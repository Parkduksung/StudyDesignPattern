package com.example.studydesignpattern.category.decorator

abstract class BreadDecorator(private val bagel: Bagel) : Bread(){

    override fun getDescription(): String {
        return bagel.getDescription()
    }

    override fun getKcal(): Int {
        return bagel.getKcal()
    }
}



class Toasted(bagel: Bagel) : BreadDecorator(bagel){

    override fun getDescription() : String =
        super.getDescription() + " Add Toasted"

    override fun getKcal() : Int =
        super.getKcal() + 50
}

