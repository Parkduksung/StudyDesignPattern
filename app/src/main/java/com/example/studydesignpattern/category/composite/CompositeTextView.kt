package com.example.studydesignpattern.category.composite


interface Component {

    fun getName(): String

    fun inflate(): String

    fun add(component: Component)
}


class CompositeTextView(private val name: String) : Component {
    override fun getName(): String {
        return name
    }

    override fun inflate(): String {
        return "Inflate" + getName()
    }

    override fun add(component: Component) {
        TODO("Not yet implemented")
    }
}
