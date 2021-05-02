package com.example.studydesignpattern.category.abstractfactory

interface Dough {
    fun name(): String
}


class ThickCrushDough : Dough {
    override fun name(): String {
        return "ThickCrushDough"
    }
}

class ThinCrushDough : Dough {
    override fun name(): String {
        return "ThinCrushDough"
    }
}