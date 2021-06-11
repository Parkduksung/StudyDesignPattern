package com.example.studydesignpattern.category.composite

class VegetarianBerger : MenuComponent {

    override fun getName(): String {
        return "VegetarianBerger"
    }

    override fun print(): String =
        getName()
}
