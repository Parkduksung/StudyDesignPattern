package com.example.studydesignpattern.category.stratege

import android.os.Bundle
import android.util.Log
import com.example.studydesignpattern.BaseActivity
import com.example.studydesignpattern.R
import com.example.studydesignpattern.databinding.ActivityWikiStrategyBinding

class WikiStrategyPatternActivity :
    BaseActivity<ActivityWikiStrategyBinding>(R.layout.activity_wiki_strategy) {

    private val suvCar: Car by lazy { SUV() }
    private val sedanCar: Car by lazy { Sedan() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        sedanCar.applyBrake()

        suvCar.run {
            applyBrake()
            //이렇게 하면 set 해서 다른 세단을 만들기가 힘들어진다.

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

abstract class Car(private val iBrakeBehavior: IBrakeBehavior) {

    fun applyBrake() {
        iBrakeBehavior.brake()
    }

}

class Sedan : Car(Brake()) {

}

class SUV : Car(BrakeWithABS()) {

}
