package com.example.studydesignpattern.category

interface Shape {
    fun run() : String
}

class Circle : Shape{

    override fun run(): String {
        return "RunCircle"
    }
}

class Triangle : Shape{

    override fun run(): String {
        return "RunTriangle"
    }
}
class Rhombus : Shape{

    override fun run(): String {
        return "RunRhombus"
    }
}

