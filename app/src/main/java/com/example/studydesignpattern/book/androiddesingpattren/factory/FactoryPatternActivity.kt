package com.example.studydesignpattern.book.androiddesingpattren.factory

import android.os.Bundle
import android.view.View
import com.example.studydesignpattern.BaseActivity
import com.example.studydesignpattern.R
import com.example.studydesignpattern.databinding.ActivityFactoryBinding
import java.lang.Exception

class FactoryPatternActivity : BaseActivity<ActivityFactoryBinding>(R.layout.activity_factory),
    View.OnClickListener {

    private lateinit var bread: Bread

    override fun onClick(v: View?) {
        when (v?.id) {

            R.id.baguette_button -> {
                bread = BreadFactoryImpl().getBread("Baguette")

                binding.breadNameTv.text = bread.name()
                binding.breadCaloriesTv.text = bread.calories().toString()
            }

            R.id.brioche_button -> {
                bread = BreadFactoryImpl().getBread("Brioche")

                binding.breadNameTv.text = bread.name()
                binding.breadCaloriesTv.text = bread.calories().toString()

            }

            R.id.roll_button -> {
                bread = BreadFactoryImpl().getBread("Roll")

                binding.breadNameTv.text = bread.name()
                binding.breadCaloriesTv.text = bread.calories().toString()

            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        startView()
    }

    private fun startView() {
        binding.baguetteButton.setOnClickListener(this)
        binding.rollButton.setOnClickListener(this)
        binding.briocheButton.setOnClickListener(this)
    }

}

class BreadFactoryImpl : BreadFactory()

abstract class BreadFactory {
    fun getBread(sort: String): Bread {
        return when (sort) {
            "Baguette" -> Baguette()
            "Roll" -> Roll()
            "Brioche" -> Brioche()
            else -> throw Exception()
        }
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