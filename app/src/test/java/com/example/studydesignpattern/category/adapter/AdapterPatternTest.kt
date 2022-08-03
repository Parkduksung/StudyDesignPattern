package com.example.studydesignpattern.category.adapter

import org.junit.Assert.assertEquals
import org.junit.Test

class AdapterPatternTest {


    @Test
    fun `MallardDuck 의 quack() 의 값은 "Quack" 이어야 한다`() {
        val mallardDuck = MallardDuck()
        assertEquals("Quack", mallardDuck.quack())
    }

    @Test
    fun `MallardDuck 의 fly() 의 값은 "I'm flying" 이어야 한다`() {
        val mallardDuck = MallardDuck()
        assertEquals("I'm flying", mallardDuck.fly())
    }

    @Test
    fun `WildTurkey 의 gobble() 의 값은 "Gobble gobble" 이어야 한다`() {
        val wildTurkey = WildTurkey()
        assertEquals("Gobble gobble", wildTurkey.gobble())
    }

    @Test
    fun `WildTurkey 의 fly() 의 값은 "I'm flying a short distance" 이어야 한다`() {
        val wildTurkey = WildTurkey()
        assertEquals("I'm flying a short distance", wildTurkey.fly())
    }

    @Test
    fun `TurkeyAdapter(WildTurkey()) 의 quack() 의 값은 "Gobble gobble" 이어야 한다`() {
        val wildTurkeyAdapter = TurkeyAdapter(WildTurkey())
        assertEquals("Gobble gobble", wildTurkeyAdapter.quack())
    }


    @Test
    fun `TurkeyAdapter(WildTurkey()) 의 fly() 의 값은 "I'm flying a short distance" 이어야 한다`() {
        val wildTurkeyAdapter = TurkeyAdapter(WildTurkey())
        assertEquals("I'm flying a short distance", wildTurkeyAdapter.fly())
    }

}

interface Duck {
    fun quack(): String
    fun fly(): String
}

class MallardDuck : Duck {
    override fun quack(): String {
        return "Quack"
    }

    override fun fly(): String {
        return "I'm flying"
    }
}

interface Turkey {
    fun gobble(): String
    fun fly(): String
}

class WildTurkey : Turkey {
    override fun gobble(): String {
        return "Gobble gobble"
    }

    override fun fly(): String {
        return "I'm flying a short distance"
    }
}

class TurkeyAdapter(private val turkey: Turkey) : Duck {

    override fun quack(): String {
        return turkey.gobble()
    }

    override fun fly(): String {
        return turkey.fly()
    }
}

interface MediaPlayer {
    fun play(audioType: AudioType, fileName: String): String
}

interface AdvancedMediaPlayer {
    fun playVlc(fileName: String): String
    fun playMp4(fileName: String): String
}

class VlcPlayer : AdvancedMediaPlayer {
    override fun playVlc(fileName: String) = "Playing vlc file. Name: $fileName"

    override fun playMp4(fileName: String) = ""
}

class Mp4Player : AdvancedMediaPlayer {
    override fun playVlc(fileName: String) = ""

    override fun playMp4(fileName: String) = "Playing mp4 file. Name: $fileName"
}


class MediaAdapter(audioType: AudioType) : MediaPlayer {

    private var advancedMediaPlayer: AdvancedMediaPlayer

    init {
        advancedMediaPlayer = when (audioType) {
            AudioType.VLC -> {
                VlcPlayer()
            }
            AudioType.MP4 -> {
                Mp4Player()
            }
        }
    }


    override fun play(audioType: AudioType, fileName: String): String {
        return when (audioType) {
            AudioType.VLC -> {
                advancedMediaPlayer.playVlc(fileName)
            }
            AudioType.MP4 -> {
                advancedMediaPlayer.playMp4(fileName)
            }
        }
    }
}

sealed class AudioType {
    object VLC : AudioType()
    object MP4 : AudioType()
}

interface Temperature {
    var temperature : Double
}

class CelsiusTemperature(override var temperature: Double) : Temperature

class FahrenheitTemperature(var celsiusTemperature: CelsiusTemperature) : Temperature {

    override var temperature: Double
        get() = convertCelsiusToFahrenheit(celsiusTemperature.temperature)
        set(temperatureInF) {
            celsiusTemperature.temperature = convertFahrenheitToCelsius(temperatureInF)
        }

    private fun convertFahrenheitToCelsius(f: Double): Double = (f - 32) * 5 / 9

    private fun convertCelsiusToFahrenheit(c: Double): Double = (c * 9 / 5) + 32
}
