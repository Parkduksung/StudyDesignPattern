package com.example.studydesignpattern.category.composite

open class Composite(private val name: String) {

    private val componentList = mutableListOf<Composite>()

    private var compositeString = "Inflate"

     fun getName(): String {
        return name
    }

     fun inflate(): String {
        componentList.forEach {
            compositeString += it.getName()
        }

        return compositeString
    }

     fun add(component: Composite) {
        componentList.add(component)
    }

}
