package com.example.studydesignpattern.category.composite

class Composite : Component {

    private val componentList = mutableListOf<Component>()

    private var compositeString = ""

    override fun getName(): String {
        TODO("Not yet implemented")
    }

    override fun inflate(): String {
        componentList.forEach {
            compositeString += it.inflate()
        }

        return compositeString
    }

    fun add(component: Component) {
        componentList.add(component)
    }

}
