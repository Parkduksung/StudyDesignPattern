package com.example.studydesignpattern.category.stratege

import android.os.Bundle
import android.util.Log
import com.example.studydesignpattern.BaseActivity
import com.example.studydesignpattern.R
import com.example.studydesignpattern.databinding.ActivityStrategyBinding
//
//class StrategyPatternActivity : BaseActivity<ActivityStrategyBinding>(R.layout.activity_strategy) {
//
//    private val redDuck by lazy { RedDuck() }
//    private val blueDuck by lazy { BlueDuck() }
//    private val rubberDuck by lazy { ToyRubberDuck() }
//    private val woodDuck by lazy { ToyWoodDuck() }
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//
//        redDuck.display()
//        blueDuck.display()
//        rubberDuck.display()
//        woodDuck.display()
//    }
//}
//
//interface FlyBehavior {
//    fun fly()
//}
//
//class FlyWithWings : FlyBehavior {
//    override fun fly() {
//        Log.d("결과", "FlyWithWings")
//    }
//}
//
//class FlyNoWay : FlyBehavior {
//    override fun fly() {
//        Log.d("결과", "FlyNoWay")
//    }
//}
//
//
//interface QuackBehavior {
//    fun quack()
//}
//
//class Quack : QuackBehavior {
//    override fun quack() {
//        Log.d("결과", "Quack")
//    }
//}
//
//class Squeak : QuackBehavior {
//    override fun quack() {
//        Log.d("결과", "Squeak")
//    }
//}
//
//class MuteQuack : QuackBehavior {
//    override fun quack() {
//        Log.d("결과", "MuteQuack")
//    }
//}
//
//abstract class Duck {
//
//    private lateinit var flyBehavior: FlyBehavior
//    private lateinit var quackBehavior: QuackBehavior
//
//    abstract fun display()
//
//    fun swim() {
//        Log.d("결과", "swim")
//    }
//
//    fun performQuack() {
//        quackBehavior.quack()
//    }
//
//    fun performFly() {
//        flyBehavior.fly()
//    }
//
//    fun setFlyBehavior(flyBehavior: FlyBehavior) {
//        this.flyBehavior = flyBehavior
//    }
//
//    fun setQuackBehavior(quackBehavior: QuackBehavior) {
//        this.quackBehavior = quackBehavior
//    }
//}
//
//
//class BlueDuck : Duck() {
//    init {
//        setFlyBehavior(FlyWithWings())
//        setQuackBehavior(Quack())
//    }
//
//    override fun display() {
//        Log.d("결과", "BlueDuck")
//        performFly()
//        performQuack()
//    }
//}
//
//class RedDuck : Duck() {
//    init {
//        setFlyBehavior(FlyWithWings())
//        setQuackBehavior(Quack())
//    }
//
//    override fun display() {
//        Log.d("결과", "RedDuck")
//        performFly()
//        performQuack()
//    }
//}
//
//class ToyRubberDuck : Duck() {
//    init {
//        setFlyBehavior(FlyNoWay())
//        setQuackBehavior(Squeak())
//    }
//
//    override fun display() {
//        Log.d("결과", "ToyRubberDuck")
//        performFly()
//        performQuack()
//    }
//}
//
//class ToyWoodDuck : Duck() {
//    init {
//        setFlyBehavior(FlyWithWings())
//        setQuackBehavior(MuteQuack())
//    }
//
//    override fun display() {
//        Log.d("결과", "ToyWoodDuck")
//        performFly()
//        performQuack()
//    }
//}
//
