package com.example.studydesignpattern.category.composite


interface MenuComponent {

    fun print(): String
    fun getName(): String
}


class BergerMenu : MenuComponent {

    private val menuComponents = mutableListOf<MenuComponent>()

    fun add(menuComponent: MenuComponent) {
        this.menuComponents.add(menuComponent)
    }

    override fun getName(): String =
        if(menuComponents.isEmpty()){
            "BergerMenu"
        }else{
            "BergerMenu : "
        }

    override fun print(): String =
        menuComponents.joinToString(",", getName(), "") { it.print() }
}
