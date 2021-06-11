package com.example.studydesignpattern.category.composite

class ChamBerger : MenuComponent{

    override fun getName(): String {
        return "ChamBerger"
    }

    override fun print(): String =
        getName()
}
