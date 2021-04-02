package com.example.studydesignpattern.category.observer

import android.os.Bundle
import android.util.Log
import com.example.studydesignpattern.BaseActivity
import com.example.studydesignpattern.R
import com.example.studydesignpattern.databinding.ActivityWikiObserverBinding

class ObserverPatternWeatherActivity :
    BaseActivity<ActivityWikiObserverBinding>(R.layout.activity_wiki_observer) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val currentConditionDisplay1: WeatherObserver = CurrentConditionDisplay(Weather("10","10","20"))
        val currentConditionDisplay2: WeatherObserver = CurrentConditionDisplay(Weather("11","11","21"))
        val currentConditionDisplay3: WeatherObserver = CurrentConditionDisplay(Weather("12","12","22"))

        val weatherData: WeatherSubject = WeatherData()
        weatherData.registerObserver(currentConditionDisplay1)
        weatherData.registerObserver(currentConditionDisplay2)
        weatherData.registerObserver(currentConditionDisplay3)

        weatherData.notifyObserver()
    }

}

interface WeatherObserver {
    fun update()
}


interface WeatherSubject : WeatherObserver {
    fun registerObserver(weatherObserver: WeatherObserver)
    fun removeObserver(weatherObserver: WeatherObserver)
    fun notifyObserver()
}

class CurrentConditionDisplay(private val weather: Weather) : WeatherObserver {
    override fun update() {
        Log.d("결과", "온도 : ${weather.temperature} 습도 : ${weather.humidity} 압력 : ${weather.pressure}")
    }
}


class WeatherData : WeatherSubject {

    private val weatherObserverSetList = mutableSetOf<WeatherObserver>()

    override fun registerObserver(weatherObserver: WeatherObserver) {
        weatherObserverSetList += weatherObserver
    }

    override fun removeObserver(weatherObserver: WeatherObserver) {
        weatherObserverSetList -= weatherObserver
    }

    override fun notifyObserver() {
        weatherObserverSetList.forEach {
            it.update()
        }
    }

    override fun update() {
    }

}

data class Weather(
    var temperature: String? = "",
    var humidity: String? = "",
    var pressure: String? = ""
)
