//package com.example.studydesignpattern.category.proxy
//
//import kotlinx.coroutines.*
//import org.junit.Test
//
//class ProxyPatternExamTest {
//
//    @Test
//    fun `imageType 이 png 일 경우 printImage 값이 print PNG 이어야 한다`() = runBlocking {
//
//        val imageProxy: Image = ImageProxy()
//
//
//        assert(imageProxy.printImage() ==  "Local Image")
//
//        delay(500)
//
//        assert(imageProxy.printImage() ==  "Remote Image")
//
//    }
//}
//
//interface Image {
//    fun printImage(): String
//}
//
//class ImageProxy : Image {
//
//    private var loadImage : Image = LocalImage()
//
//    override fun printImage(): String {
//        CoroutineScope(Dispatchers.IO).launch {
//            delay(500)
//            loadImage = RemoteImage()
//        }
//        return loadImage.printImage()
//    }
//}
//
//class LocalImage : Image {
//    override fun printImage(): String {
//       return  "Local Image"
//    }
//}
//
//class RemoteImage : Image {
//    override fun printImage(): String {
//        return "Remote Image"
//    }
//}
