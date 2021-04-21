package com.example.studydesignpattern.category.decorator

class Oven(bread: Bread) : BreadDecorator(bread){

    override fun getDescription(): String {
        return super.getDescription() + " Add Oven"
    }

    override fun getKcal(): Int {
        return super.getKcal() + 10
    }
}
