package com.example.studydesignpattern.category.adapter

import android.util.Log


class IPhone : LightningPhone {

    private var connector: Boolean? = null

    override fun recharge() {
        if (connector == true) {
            Log.d("결과", "Lightning started")
            Log.d("결과", "Lightning finished")
        } else {
            Log.d("결과", "Connect Lightning first")
        }
    }

    override fun useLightning() {
        connector = true
        Log.d("결과", "Lightning connected")
    }
}

class LightningToMicroUsbAdapter(private val lightningPhone: LightningPhone) : MicroUsbPhone {


    override fun recharge() {
        Log.d("결과", "MicroUsb connected")
        lightningPhone.useLightning()
    }

    override fun useLightning() {
        lightningPhone.recharge()
    }
}

interface LightningPhone {
    fun recharge()
    fun useLightning()
}

interface MicroUsbPhone {
    fun recharge()
    fun useLightning()
}

class AdapterPatternWiki {

    fun rechargeLightningPhone(phone: LightningPhone) {
        phone.useLightning()
        phone.recharge()
    }

    fun rechargeMicroUsbPhone(phone: MicroUsbPhone) {
        phone.useLightning()
        phone.recharge()
    }
}