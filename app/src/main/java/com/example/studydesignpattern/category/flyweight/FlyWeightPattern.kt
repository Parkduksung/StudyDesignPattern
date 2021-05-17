package com.example.studydesignpattern.category.flyweight

class FlyWeightPattern {

    private val colors = listOf("Red", "Green", "Blue")

    fun start() {

        for (i in 0..10) {
            val square = ShapeFactory.getSquare(colors[(Math.random()*3).toInt()]).apply {
                setLength((Math.random()*10).toInt())
            }

            println(square.draw())
        }

    }
}


interface Shape {
    fun draw(): String
}

class Square(private val color: String) : Shape {

    private var squareLength: Int = 0

    private var squareColor: String = color

    fun setColor(color: String) {
        squareColor = color
    }

    fun setLength(length: Int) {
        squareLength = length
    }

    override fun draw(): String {
        return "Square color = $color length = $squareLength"
    }
}

class ShapeFactory {

    companion object {

        private val squareMap = HashMap<String, Square>()

        fun getSquare(color: String): Square {
            var square = squareMap[color]

            if (square == null) {
                println("새로운 객체 생성")
                square = Square(color)
                squareMap[color] = square
            }
            return square
        }
    }
}