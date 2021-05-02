package com.example.studydesignpattern.category

class FacadePattern {

    private val triangle : Shape = Triangle()
    private val circle : Shape = Circle()
    private val rhombus : Shape = Rhombus()

    fun runTriangle() : String{
       return  triangle.run()
    }

    fun runCircle() : String{
        return circle.run()
    }

    fun runRhombus() : String{
        return rhombus.run()
    }

}