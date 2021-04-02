package com.example.studydesignpattern.category.observer

import android.os.Bundle
import android.util.Log
import com.example.studydesignpattern.BaseActivity
import com.example.studydesignpattern.R
import com.example.studydesignpattern.databinding.ActivityWikiObserverBinding

class ObserverPatternActivity : BaseActivity<ActivityWikiObserverBinding>(R.layout.activity_wiki_observer) {

    private val sampleObserver1: Observer = SampleObserver1()
    private val sampleObserver2: Observer = SampleObserver2()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val concreteSubject = ConcreteSubject().apply {
            registerObserver(sampleObserver1)
            registerObserver(sampleObserver2)
        }

        concreteSubject.notifyObserver()

        concreteSubject.removeObserver(sampleObserver1)

        concreteSubject.notifyObserver()


    }
}


interface Observer {
    fun update()
}

class SampleObserver1 : Observer {
    override fun update() {
        print("SampleObserver1")
    }
}

class SampleObserver2 : Observer {
    override fun update() {
        print("SampleObserver2")
    }
}

interface Subject {
    fun registerObserver(observer: Observer)
    fun removeObserver(observer: Observer)
    fun notifyObserver()
}

class ConcreteSubject : Subject {

    private val hashMap = HashMap<Int, Observer>()

    override fun registerObserver(observer: Observer) {
        hashMap[observer.hashCode()] = observer
    }

    override fun removeObserver(observer: Observer) {
        hashMap.remove(observer.hashCode())
    }

    override fun notifyObserver() {
        hashMap.forEach {
            it.value.update()
        }
    }
}