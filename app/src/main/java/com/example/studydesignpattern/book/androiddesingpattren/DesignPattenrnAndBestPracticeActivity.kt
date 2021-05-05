package com.example.studydesignpattern.book.androiddesingpattren

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import com.example.studydesignpattern.BaseActivity
import com.example.studydesignpattern.R
import com.example.studydesignpattern.book.androiddesingpattren.factory.FactoryPatternActivity
import com.example.studydesignpattern.databinding.ActivityMainBinding

class DesignPatternAndBestPracticeActivity :
    BaseActivity<ActivityMainBinding>(R.layout.activity_main),
    DesignPatternAdapter.PatternClickListener {

    private val designPatternAdapter by lazy { DesignPatternAdapter() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding.patternRv.run {
            this.adapter = designPatternAdapter.apply {
                setPatternList(patternList)
                setPatternClickListener(this@DesignPatternAndBestPracticeActivity)
            }
        }
    }

    override fun onClick(string: String) {
        when (string) {
            "Factory" -> startFactoryActivity()
        }
    }

    companion object {
        private val patternList = listOf(
            "Factory",
            "Strategy",
            "Decorator"
        )
    }


    private fun startFactoryActivity() {
        startActivity(Intent(this, FactoryPatternActivity::class.java))
    }


}
