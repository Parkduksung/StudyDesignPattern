package com.example.studydesignpattern.category.stratege

import android.os.Bundle
import android.util.Log
import com.example.studydesignpattern.BaseActivity
import com.example.studydesignpattern.R
import com.example.studydesignpattern.databinding.ActivityWikiStrategyBinding

class WikiStrategyPatternActivity :
    BaseActivity<ActivityWikiStrategyBinding>(R.layout.activity_wiki_strategy) {

    private val sedanCar: Car by lazy { Sedan() }
    private val suvCar: Car by lazy { SUV() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        sedanCar.applyBrake()

        suvCar.run {
            applyBrake()
            setBrakeBehavior(Brake())
            applyBrake()
        }
    }
}


interface IBrakeBehavior {
    fun brake()
}

class BrakeWithABS : IBrakeBehavior {

    override fun brake() {
        Log.d("결과", "BrakeWithABS brake")
    }
}

class Brake : IBrakeBehavior {

    override fun brake() {
        Log.d("결과", "Default brake")
    }
}

abstract class Car {

    private lateinit var iBrakeBehavior: IBrakeBehavior

    fun setBrakeBehavior(iBrakeBehavior: IBrakeBehavior) {
        this.iBrakeBehavior = iBrakeBehavior
    }

    fun applyBrake() {
        iBrakeBehavior.brake()
    }

}

class Sedan : Car() {
    init {
        setBrakeBehavior(Brake())
    }
}

class SUV : Car() {
    init {
        setBrakeBehavior(BrakeWithABS())
    }
}
