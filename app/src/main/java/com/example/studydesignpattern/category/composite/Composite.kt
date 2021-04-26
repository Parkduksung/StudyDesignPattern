package com.example.studydesignpattern.category.composite

class Composite(private val name: String) : Component {

    private val componentList = mutableListOf<Component>()

    private var compositeString = ""

    override fun getName(): String {
        return name
    }

    override fun inflate(): String {
        componentList.forEach {
            compositeString += it.inflate()
        }

        return compositeString
    }

    override fun add(component: Component) {
        componentList.add(component)
    }

}
