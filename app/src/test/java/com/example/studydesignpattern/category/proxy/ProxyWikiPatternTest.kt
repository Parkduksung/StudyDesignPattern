package com.example.studydesignpattern.category.proxy

import com.example.studydesignpattern.BaseTest
import org.junit.Assert.assertEquals
import org.junit.Test


class ProxyWikiPatternTest : BaseTest() {

    @Test
    fun `JpgImage("real") 생성시 "loading real" 가 찍혀야 한다`() {

        val jpgImage: Image = JpgImage("real")

        assertEquals("loading jpg real\n", outputStreamCaptor.toString())
    }

    @Test
    fun `JpgImage("real") displayImage() 실행시 값은 "loading jpg real" 줄바꿈 "displaying jpg real" 줄바꿈 이어야 한다`() {

        val jpgImage: Image = JpgImage("real")
        jpgImage.displayImage()
        assertEquals("loading jpg real\ndisplaying jpg real\n", outputStreamCaptor.toString())
    }

    @Test
    fun `ProxyImage("real", JPG) displayImage() 실행시 값은 "loading jpg real" 줄바꿈 "displaying jpg real" 이어야 한다`() {

        val proxyImage: Image = ProxyImage("real" , ImageType.JPG)
        proxyImage.displayImage()
        assertEquals("loading jpg real\ndisplaying jpg real\n", outputStreamCaptor.toString())
    }


    @Test
    fun `PngImage("real") 생성시 "loading png real" 가 찍혀야 한다`() {

        val pngImage: Image = PngImage("real")

        assertEquals("loading png real\n", outputStreamCaptor.toString())
    }

    @Test
    fun `PngImage("real") displayImage() 실행시 값은 "loading png real" 줄바꿈 "displaying png real" 줄바꿈 이어야 한다`() {

        val pngImage: Image = PngImage("real")
        pngImage.displayImage()
        assertEquals("loading png real\ndisplaying png real\n", outputStreamCaptor.toString())
    }

    @Test
    fun `ProxyImage("real", PNG) displayImage() 실행시 값은 "loading png real" 줄바꿈 "displaying png real" 줄바꿈 이어야 한다`() {

        val proxyImage: Image = ProxyImage("real" , ImageType.PNG)
        proxyImage.displayImage()
        assertEquals("loading png real\ndisplaying png real\n", outputStreamCaptor.toString())
    }


    @Test
    fun `JpegImage("real") 생성시 "loading jpeg real" 가 찍혀야 한다`() {

        val jpegImage: Image = JpegImage("real")

        assertEquals("loading jpeg real\n", outputStreamCaptor.toString())
    }

    @Test
    fun `JpegImage("real") displayImage() 실행시 값은 "loading jpeg real" 줄바꿈 "displaying jpeg real" 줄바꿈 이어야 한다`() {

        val jpegImage: Image = JpegImage("real")
        jpegImage.displayImage()
        assertEquals("loading jpeg real\ndisplaying jpeg real\n", outputStreamCaptor.toString())
    }

    @Test
    fun `ProxyImage("real", JPEG) displayImage() 실행시 값은 "loading jpeg real" 줄바꿈 "displaying jpeg real" 줄바꿈 이어야 한다`() {

        val proxyImage: Image = ProxyImage("real" , ImageType.JPEG)
        proxyImage.displayImage()
        assertEquals("loading jpeg real\ndisplaying jpeg real\n", outputStreamCaptor.toString())
    }


    @Test
    fun `VectorImage("real") 생성시 "loading vector real" 가 찍혀야 한다`() {

        val vectorImage: Image = VectorImage("real")

        assertEquals("loading vector real\n", outputStreamCaptor.toString())
    }

    @Test
    fun `VectorImage("real") displayImage() 실행시 값은 "loading vector real" 줄바꿈 "displaying vector real" 줄바꿈 이어야 한다`() {

        val jpgImage: Image = VectorImage("real")
        jpgImage.displayImage()
        assertEquals("loading vector real\ndisplaying vector real\n", outputStreamCaptor.toString())
    }

    @Test
    fun `ProxyImage("real", VECTOR) displayImage() 실행시 값은 "loading vector real" 줄바꿈 "displaying vector real" 줄바꿈 이어야 한다`() {

        val proxyImage: Image = ProxyImage("real" , ImageType.VECTOR)
        proxyImage.displayImage()
        assertEquals("loading vector real\ndisplaying vector real\n", outputStreamCaptor.toString())
    }

}
