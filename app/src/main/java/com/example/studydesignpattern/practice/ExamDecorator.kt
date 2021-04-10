package com.example.studydesignpattern.practice


interface Tree {
    fun getDescription(): String
}

class SimpleTree : Tree {

    override fun getDescription(): String {
        return "SimpleTree"
    }
}


abstract class DecoratorTree(private val decoratedTree: Tree) : Tree {
    override fun getDescription(): String {
        return decoratedTree.getDescription()
    }
}

class DecorateStar(decoratedTree: Tree) : DecoratorTree(decoratedTree) {
    override fun getDescription(): String {
        return super.getDescription() + ", including Star"
    }
}

class DecorateBall(decoratedTree: Tree) : DecoratorTree(decoratedTree) {
    override fun getDescription(): String {
        return super.getDescription() + ", including Ball"
    }
}