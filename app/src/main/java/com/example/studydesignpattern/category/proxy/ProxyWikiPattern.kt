package com.example.studydesignpattern.category.proxy


interface Image {
    fun displayImage()
}

class JpgImage(private val fileName: String) : Image {

    init {
        loadImageFromDisk()
    }

    override fun displayImage() {
        println("displaying jpg $fileName")
    }

    private fun loadImageFromDisk() {
        println("loading jpg $fileName")
    }
}

class PngImage(private val fileName: String) : Image {

    init {
        loadImageFromDisk()
    }

    override fun displayImage() {
        println("displaying png $fileName")
    }

    private fun loadImageFromDisk() {
        println("loading png $fileName")
    }
}


class JpegImage(private val fileName: String) : Image {

    init {
        loadImageFromDisk()
    }

    override fun displayImage() {
        println("displaying jpeg $fileName")
    }

    private fun loadImageFromDisk() {
        println("loading jpeg $fileName")
    }
}


class VectorImage(private val fileName: String) : Image {

    init {
        loadImageFromDisk()
    }

    override fun displayImage() {
        println("displaying vector $fileName")
    }

    private fun loadImageFromDisk() {
        println("loading vector $fileName")
    }
}

class ProxyImage(fileName: String, type: ImageType) : Image {

    private val image: Image

    init {
        image = when (type) {
            is ImageType.JPG -> JpgImage(fileName)
            is ImageType.PNG -> PngImage(fileName)
            is ImageType.JPEG -> JpegImage(fileName)
            is ImageType.VECTOR -> VectorImage(fileName)
        }
    }

    override fun displayImage() {
        image.displayImage()
    }
}

sealed class ImageType {
    object JPG : ImageType()
    object PNG : ImageType()
    object JPEG : ImageType()
    object VECTOR : ImageType()
}