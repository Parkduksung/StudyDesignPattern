package com.example.studydesignpattern.category.decorator


class DecoratorPattern {

}


interface Window {
    fun draw()
    fun getDescription(): String
}

class SimpleWindow() : Window {

    override fun draw() {
        //draw window
    }

    override fun getDescription(): String {
        return "SimpleWindow"
    }
}


abstract class WindowDecorator(private val windowToBeDecorated: Window) : Window {
    override fun draw() {
        windowToBeDecorated.draw()
    }

    override fun getDescription(): String {
        return windowToBeDecorated.getDescription()
    }
}

class VerticalScrollBarDecorator(windowToBeDecorated: Window) :
    WindowDecorator(windowToBeDecorated) {

    override fun draw() {
        super.draw()
        drawVerticalScrollBar()
    }

    override fun getDescription(): String {
        return super.getDescription() + ", including vertical scrollbars"
    }

    private fun drawVerticalScrollBar() {
        // Draw the vertical scrollbar
    }
}

class HorizontalScrollBarDecorator(windowToBeDecorated: Window) :
    WindowDecorator(windowToBeDecorated) {

    override fun draw() {
        super.draw()
        drawVerticalScrollBar()
    }

    override fun getDescription(): String {
        return super.getDescription() + ", including horizontal scrollbars"
    }

    private fun drawVerticalScrollBar() {
        // Draw the horizontal scrollbar
    }
}