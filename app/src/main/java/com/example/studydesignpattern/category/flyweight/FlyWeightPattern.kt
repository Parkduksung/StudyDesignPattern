package com.example.studydesignpattern.category.flyweight

class FlyWeightPattern {

    private val colors = listOf("Red", "Green", "Blue")


    fun startUseFlyWeight() {

        ShapeFactory.resetCreateSquareNum()

        for (i in 0..9) {

            val square =
                ShapeFactory.getUseFlyWeightSquare(colors[(Math.random() * 3).toInt()]).apply {
                    setLength((Math.random() * 10).toInt())
                }

            println(square.draw())

        }
    }

    fun startNotUseFlyWeight() {

        ShapeFactory.resetCreateSquareNum()

        for (i in 0..9) {
            val square =
                ShapeFactory.getNotUseFlyWeightSquare(colors[(Math.random() * 3).toInt()]).apply {
                    setLength((Math.random() * 10).toInt())
                }

            println(square.draw())

        }
    }

    fun getCreateSquareNum(): Int = ShapeFactory.getCreateSquareNum()
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

        private var createSquareNum = 0

        fun getUseFlyWeightSquare(color: String): Square {
            var square = squareMap[color]

            if (square == null) {
                println("새로운 객체 생성")
                createSquareNum++
                square = Square(color)
                squareMap[color] = square
            }
            return square
        }

        fun getNotUseFlyWeightSquare(color: String): Square {
            println("새로운 객체 생성")
            createSquareNum++
            return Square(color)

        }

        fun getCreateSquareNum(): Int = createSquareNum

        fun resetCreateSquareNum() {
            createSquareNum = 0
        }
    }

}