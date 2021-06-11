package com.example.studydesignpattern.category.composite

class BeafBerger : MenuComponent {

    override fun getName(): String {
        return "BeafBerger"
    }

    override fun print(): String =
        getName()
}
