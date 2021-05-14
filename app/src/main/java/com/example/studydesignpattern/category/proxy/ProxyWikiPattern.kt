package com.example.studydesignpattern.category.proxy

class ProxyWikiPattern {
}


interface Image {
    fun displayImage(): String
    fun loadImageFromDisk(): String
}

class RealImage(private val imageName: String) : Image {

    override fun loadImageFromDisk(): String {
        return "Loading_$imageName"
    }


    override fun displayImage(): String {
        return "Displaying_$imageName"
    }
}

class ProxyImage(private val imageName: String) : Image {

    private lateinit var realImage: RealImage

    override fun displayImage(): String {
        if (!::realImage.isInitialized) {
            realImage = RealImage(imageName)
        }
        return realImage.displayImage()
    }

    //todo
    override fun loadImageFromDisk(): String {
        TODO("Not yet implemented")
    }
}


// 직접참조 해서 생성해야함.
// 대행해주는 대리자를 통해 대상 객체를 접근하는게 아닌 직접 접근.
class NotProxyUse {

    private val realImage1 = RealImage("Photo1")
    private val realImage2 = RealImage("Photo2")

    fun load(){
        realImage1.loadImageFromDisk()
        realImage2.loadImageFromDisk()
    }

    fun display(){
        realImage1.displayImage()
        realImage2.displayImage()
    }
}
