package com.example.studydesignpattern.category.observer

import com.example.studydesignpattern.BaseTest
import org.junit.Assert.assertEquals
import org.junit.Test

class ObserverPatternWeatherActivityTest : BaseTest() {

    private val currentConditionDisplay: WeatherObserver =
        CurrentConditionDisplay(Weather("10", "10", "10"))

    @Test
    fun `빈 옵저버일때 아무것도 출력되지 않아야한다`() {

        val weatherData = WeatherData()
        weatherData.notifyObserver()

        assertEquals("", outputStreamCaptor.toString())
    }


    @Test
    fun `옵저버를 추가하고 출력시 weather 값이 나와야한다`() {

        val weatherData = WeatherData()
        weatherData.registerObserver(currentConditionDisplay)
        weatherData.notifyObserver()

        assertEquals(Weather("10", "10", "10").logWeather(), outputStreamCaptor.toString())
    }

    @Test
    fun `추가되어있는 옵저버를 제거시 아무것도 출력되지 않아야한다`() {

        val weatherData = WeatherData()
        weatherData.registerObserver(currentConditionDisplay)
        weatherData.removeObserver(currentConditionDisplay)
        weatherData.notifyObserver()

        assertEquals("", outputStreamCaptor.toString())
    }


}