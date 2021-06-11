package com.example.studydesignpattern.category.composite

class MainMenu : MenuComponent{

    private val menuComponents = mutableListOf<MenuComponent>()

    fun add(menuComponent: MenuComponent) {
        this.menuComponents.add(menuComponent)
    }

    override fun getName(): String =
    if(menuComponents.isEmpty()){
        "MainMenu"
    }else{
        "MainMenu : "
    }

    override fun print(): String =
        menuComponents.joinToString("," , getName(), "") { it.print() }
}
