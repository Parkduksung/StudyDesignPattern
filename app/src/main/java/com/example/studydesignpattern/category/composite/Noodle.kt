package com.example.studydesignpattern.category.composite

class Noodle : MenuComponent {

    override fun getName(): String {
        return "Noodle"
    }

    override fun print(): String {
        return getName()
    }
}
