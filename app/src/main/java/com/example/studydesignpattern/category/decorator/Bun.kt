package com.example.studydesignpattern.category.decorator

class Bun : Bread() {

    override fun getDescription(): String {
        return super.getDescription() + " Add Bun"
    }

    override fun getKcal(): Int {
        return super.getKcal() + 150
    }
}
