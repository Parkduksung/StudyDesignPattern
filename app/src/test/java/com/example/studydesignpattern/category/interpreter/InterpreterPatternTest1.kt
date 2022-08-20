package com.example.studydesignpattern.category.interpreter

import org.junit.Assert.assertEquals
import org.junit.Test
import kotlin.IllegalArgumentException

class InterpreterPatternTest1 {


    @Test
    fun `Test`() {

        val mixColor =
            MixColor(
                ExpressionColorImpl(ColorType("RED")),
                ExpressionColorImpl(ColorType("YELLOW"))
            )

        assertEquals((mixColor.getResult()), ColorType.ORANGE)
    }

}


// RED + YELLOW = ORANGE
// YELLOW + BLUE = GREEN
// BLUE + VIOLET = INDIGO
interface Color

class ColorType(private val color: String) : ExpressionColor {
    object RED : Color
    object YELLOW : Color
    object ORANGE : Color
    object BLUE : Color
    object GREEN : Color
    object VIOLET : Color
    object INDIGO : Color

    override fun getColor(): Color {
        return when (color) {
            "RED" -> RED
            "YELLOW" -> YELLOW
            "ORANGE" -> ORANGE
            "BLUE" -> BLUE
            "GREEN" -> GREEN
            "VIOLET" -> VIOLET
            "INDIGO" -> INDIGO
            else -> throw IllegalArgumentException()
        }
    }
}


interface ExpressionColor {
    fun getColor(): Color
}

class ExpressionColorImpl(color: ExpressionColor) : ExpressionColor by color

class MixColor(
    private val component1: ExpressionColorImpl,
    private val component2: ExpressionColorImpl
) {
    fun getResult(): Color {
        return when (setOf(component1.getColor(), component2.getColor())) {
            setOf(ColorType.RED, ColorType.YELLOW) -> ColorType("ORANGE").getColor()
            setOf(ColorType.YELLOW, ColorType.BLUE) -> ColorType("GREEN").getColor()
            setOf(ColorType.BLUE, ColorType.VIOLET) -> ColorType("INDIGO").getColor()
            else -> throw IllegalArgumentException()
        }
    }
}