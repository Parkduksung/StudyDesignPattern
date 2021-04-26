package com.example.studydesignpattern.category.composite

import org.junit.Assert.*
import org.junit.Test

class CompositePatternTest {


    @Test
    fun `CompositeTextView 의 getName 의 값이 CompositeTextView 이어야 한다`() {

        val compositeTextView = CompositeTextView()

        assert(compositeTextView.getName() == "CompositeTextView")

    }

    @Test
    fun `CompositeTextView 의 inflate 의 값은 InflateCompositeTextView 이어야 한다` (){

        val compositeTextView = CompositeTextView()

        assert(compositeTextView.inflate() == "InflateCompositeTextView")

    }

    @Test
    fun `Composite 에 CompositeTextView 를 add 하고 inflate 하였을때 값이 InflateCompositeTextView 이어야 한다` () {

        val composite = Composite()

        composite.add(CompositeTextView())

        assert(composite.inflate() == "InflateCompositeTextView")

    }

}