package com.example.studydesignpattern.category.composite



interface Component {

    fun getName() : String

    fun inflate() : String
}


class CompositeTextView : Component{
    override fun getName(): String {
        return "CompositeTextView"
    }

    override fun inflate(): String {
        return "InflateCompositeTextView"
    }

}
