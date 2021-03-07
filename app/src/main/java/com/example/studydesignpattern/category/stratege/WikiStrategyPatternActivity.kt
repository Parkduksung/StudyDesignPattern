package com.example.studydesignpattern.category.stratege

import android.os.Bundle
import com.example.studydesignpattern.BaseActivity
import com.example.studydesignpattern.R
import com.example.studydesignpattern.databinding.ActivityWikiStrategyBinding

class WikiStrategyPatternActivity :
    BaseActivity<ActivityWikiStrategyBinding>(R.layout.activity_wiki_strategy) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
}


interface IBrakeBehavior {


}

class BrakeWithABS : IBrakeBehavior {

}

class Brake : IBrakeBehavior {

}

abstract class Car : IBrakeBehavior {

}