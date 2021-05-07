package com.example.studydesignpattern.book.androiddesingpattren

import android.content.Intent
import android.os.Bundle
import com.example.studydesignpattern.BaseActivity
import com.example.studydesignpattern.R
import com.example.studydesignpattern.book.androiddesingpattren.builder.BuilderPatternActivity
import com.example.studydesignpattern.book.androiddesingpattren.facade.FacadePatternActivity
import com.example.studydesignpattern.book.androiddesingpattren.factory.FactoryPatternActivity
import com.example.studydesignpattern.book.androiddesingpattren.singleton.SingletonPatternActivity
import com.example.studydesignpattern.book.androiddesingpattren.strategy.StrategyPatternActivity
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

    override fun onClick(patternName: String) {
        when (patternName) {
            "Factory" -> startFactoryActivity()
            "Builder" -> startBuilderActivity()
            "Singleton" -> startSingletonActivity()
            "Strategy" -> startStrategyActivity()
            "Facade" -> startFacadeActivity()
        }
    }


    companion object {
        private val patternList = listOf(
            "Factory",
            "Builder",
            "Singleton",
            "Strategy",
            "Facade"
        )
    }


    private fun startFactoryActivity() {
        startActivity(Intent(this, FactoryPatternActivity::class.java))
    }

    private fun startBuilderActivity() {
        startActivity(Intent(this, BuilderPatternActivity::class.java))
    }

    private fun startSingletonActivity() {
        startActivity(Intent(this, SingletonPatternActivity::class.java))
    }

    private fun startStrategyActivity() {
        startActivity(Intent(this, StrategyPatternActivity::class.java))
    }

    private fun startFacadeActivity() {
        startActivity(Intent(this, FacadePatternActivity::class.java))
    }
}
