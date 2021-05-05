package com.example.studydesignpattern.book.androiddesingpattren

import android.app.Activity
import android.os.Bundle
import com.example.studydesignpattern.BaseActivity
import com.example.studydesignpattern.R
import com.example.studydesignpattern.databinding.ActivityMainBinding

class DesignPatternAndBestPracticeActivity :
    BaseActivity<ActivityMainBinding>(R.layout.activity_main) {

    private val designPatternAdapter by lazy { DesignPatternAdapter() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding.patternRv.run {
            this.adapter = designPatternAdapter.apply {
                setPatternList(patternList)
            }
        }

    }

    companion object {
        private val patternList = listOf(
            Pair("Factory", FactoryActivity())
        )
    }
}

class FactoryActivity : Activity() {

}