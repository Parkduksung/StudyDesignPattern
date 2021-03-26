package com.example.studydesignpattern.category.observer

import android.util.Log
import com.example.studydesignpattern.BaseActivity
import com.example.studydesignpattern.R
import com.example.studydesignpattern.databinding.ActivityWikiObserverBinding

class ObserverPatternWeatherActivity :
    BaseActivity<ActivityWikiObserverBinding>(R.layout.activity_wiki_observer) {


}

interface WeatherObserver {
    fun update()
}


interface WeatherSubject : WeatherObserver {
    fun registerObserver(weatherObserver: WeatherObserver)
    fun removeObserver(weatherObserver: WeatherObserver)
    fun notifyObserver()
}


class WeatherData : WeatherSubject {
    override fun registerObserver(weatherObserver: WeatherObserver) {
        Log.d("결과", "registerObserver")
    }

    override fun removeObserver(weatherObserver: WeatherObserver) {
        Log.d("결과", "removeObserver")
    }

    override fun notifyObserver() {
        Log.d("결과", "notifyObserver")
    }

    fun getTemperature() {

    }

    fun getHumidity() {

    }

    fun getPressure() {

    }

    fun measurementsChanged() {

    }

    override fun update() {
        notifyObserver()
    }
}


class CurrentConditionDisplay : WeatherObserver {
    override fun update() {

    }

}