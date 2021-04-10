package com.example.studydesignpattern.practice

import android.util.Log

class ExamStrategy

interface DrawingBehavior {
    fun drawing()
}

abstract class Pen(private val drawingBehavior: DrawingBehavior) {
    fun drawing() {
        drawingBehavior.drawing()
    }
}

class RedPen : DrawingBehavior {
    override fun drawing() {
        Log.d("결과", "빨간색 드로잉")
    }
}

class HaveRedPen : Pen(RedPen())