package com.example.studydesignpattern.category.proxy

import org.junit.Assert.*
import org.junit.Test

class ProxyWikiPatternTest {

    @Test
    fun `RealImage("Photo1") loadImageFromDisk 값은 Loading_Photo1 이어야 한다`() {

        val realImage: Image = RealImage("Photo1")
        assert(realImage.loadImageFromDisk() == "Loading_Photo1")
    }

    @Test
    fun `RealImage("Photo1") displayImage 값은 Displaying_Photo1 이어야 한다`() {
        val realImage : Image= RealImage("Photo1")
        assert(realImage.displayImage() == "Displaying_Photo1")
    }

    @Test
    fun `ProxyImage("Photo1") displayImage 값은 Displaying_Photo1 이어야 한다`() {

        val proxyImage : Image= ProxyImage("Photo1")
        assert(proxyImage.displayImage() == "Displaying_Photo1")
    }


}