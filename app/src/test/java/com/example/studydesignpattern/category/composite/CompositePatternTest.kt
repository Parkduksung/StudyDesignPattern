package com.example.studydesignpattern.category.composite

import org.junit.Assert.*
import org.junit.Test

class CompositePatternTest {


    @Test
    fun `CompositeTextView 의 getName 의 값이 CompositeTextView 이어야 한다`() {

        val compositeTextView = CompositeTextView("CompositeTextView")

        assert(compositeTextView.getName() == "CompositeTextView")

    }

    @Test
    fun `CompositeTextView 의 inflate 의 값은 InflateCompositeTextView 이어야 한다` (){

        val compositeTextView = CompositeTextView("CompositeTextView")

        assert(compositeTextView.inflate() == "InflateCompositeTextView")

    }

    @Test
    fun `Composite 에 CompositeTextView 를 add 하고 inflate 하였을때 값이 InflateCompositeTextView 이어야 한다` () {

        val composite = Composite("Composite")

        composite.add(CompositeTextView("CompositeTextView"))

        assert(composite.inflate() == "InflateCompositeTextView")
    }

    @Test
    fun `Composite 에 CompositeTextView1, CompositeTextView2 를 add 하고 inflate 하였을때 값이 InflateCompositeTextView1InflateCompositeTextView2 이어야 한다` () {

        val composite = Composite("Composite")

        val compositeTextView1 = CompositeTextView("CompositeTextView1")
        val compositeTextView2 = CompositeTextView("CompositeTextView2")

        composite.add(compositeTextView1)
        composite.add(compositeTextView2)

        assert(composite.inflate() == "InflateCompositeTextView1InflateCompositeTextView2")
    }

}