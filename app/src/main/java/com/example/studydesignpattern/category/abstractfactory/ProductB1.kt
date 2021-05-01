package com.example.studydesignpattern.category.abstractfactory


interface AbstractProductB {

    fun productName() : String
}



class ProductB1 :AbstractProductB{

    override fun productName() : String = "ProductB1"
}


class ProductB2 : AbstractProductB{

    override fun productName() : String = "ProductB2"
}
