package com.example.studydesignpattern.category.decorator

class Oven(bagel: Bagel) : BreadDecorator(bagel){

    override fun getDescription(): String {
        return super.getDescription() + " Add Oven"
    }

    override fun getKcal(): Int {
        return super.getKcal() + 10
    }
}
