package com.example.studydesignpattern.category.abstractfactory


interface AbstractProductA {
    fun productName() : String
}


class ProductA1 : AbstractProductA{
    override fun productName(): String = "ProductA1"
}

class ProductA2 : AbstractProductA{
    override fun productName(): String = "ProductA2"
}
