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


interface Bread {
    fun name(): String
    fun calories(): Int
}

class Baguette : Bread {
    override fun name(): String = "Baguette"
    override fun calories(): Int = 150
}

class Roll : Bread {
    override fun name(): String = "Roll"
    override fun calories(): Int = 200
}

class Brioche : Bread {
    override fun name(): String = "Brioche"
    override fun calories(): Int = 175
}