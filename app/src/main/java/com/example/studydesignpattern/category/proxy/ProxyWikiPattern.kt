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