package com.example.studydesignpattern.book.androiddesingpattren.singleton

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.studydesignpattern.BaseActivity
import com.example.studydesignpattern.R
import com.example.studydesignpattern.databinding.ActivitySingletonBinding
import com.example.studydesignpattern.databinding.ActivitySubSingletonBinding

class SingletonPatternActivity :
    BaseActivity<ActivitySingletonBinding>(R.layout.activity_singleton) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        findViewById<Button>(R.id.set_info_button).setOnClickListener {
            SingletonPerson.setName(findViewById<EditText>(R.id.input_et).text.toString())

            startActivity(Intent(this, SingletonSubActivity::class.java))

        }

    }
}


class SingletonSubActivity :
    BaseActivity<ActivitySubSingletonBinding>(R.layout.activity_sub_singleton) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        findViewById<TextView>(R.id.get_data_tv).text = SingletonPerson.getName()
    }
}

object SingletonPerson {

    private var name = "Parkduksung"

    fun getName(): String = name

    fun setName(name: String) {
        this.name = name
    }
}