package com.example.studydesignpattern.category.composite



interface Component {

    fun getName() : String

    fun inflate() : String

    fun add(component: Component)
}


class CompositeTextView(private val name : String) : Component{
    override fun getName(): String {
        return name
    }

    override fun inflate(): String {
        return "InflateCompositeTextView"
    }

    override fun add(component: Component) {
        TODO("Not yet implemented")
    }
}
