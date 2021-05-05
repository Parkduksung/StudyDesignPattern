package com.example.studydesignpattern.book.androiddesingpattren.factory

import android.os.Bundle
import com.example.studydesignpattern.BaseActivity
import com.example.studydesignpattern.R
import com.example.studydesignpattern.databinding.ActivityFactoryBinding

class FactoryPatternActivity : BaseActivity<ActivityFactoryBinding>(R.layout.activity_factory) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
}


class Baguette {
    fun name(): String = "Baguette"
    fun calories(): Int = 150
}

class Roll {
    fun name(): String = "Roll"
    fun calories(): Int = 200
}

class Brioche {
    fun name(): String = "Brioche"
    fun calories(): Int = 175
}