package com.example.studydesignpattern.category.state

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.studydesignpattern.R

class StatePattern : AppCompatActivity() {

    private val client by lazy { Client().apply { setState(LightOn()) } }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_state)

        findViewById<Button>(R.id.on_button).setOnClickListener {
            changeStateValue(client.onButtonPushed())
        }

        findViewById<Button>(R.id.off_button).setOnClickListener {
            changeStateValue(client.offButtonPushed())
        }
    }

    private fun changeStateValue(message: String) {
        findViewById<TextView>(R.id.state_tv).text = message
    }
}