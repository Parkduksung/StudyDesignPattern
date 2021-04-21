package com.example.studydesignpattern.category.decorator

abstract class BreadDecorator(private val bread: Bread) : Bread(){

    override fun getDescription(): String {
        return bread.getDescription()
    }

    override fun getKcal(): Int {
        return bread.getKcal()
    }
}



class Toasted(bread: Bread) : BreadDecorator(bread){

    override fun getDescription() : String =
        super.getDescription() + " Add Toasted"

    override fun getKcal() : Int =
        super.getKcal() + 50
}

