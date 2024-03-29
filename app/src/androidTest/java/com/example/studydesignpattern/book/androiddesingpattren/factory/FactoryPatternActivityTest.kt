package com.example.studydesignpattern.book.androiddesingpattren.factory

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.studydesignpattern.R
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class FactoryPatternActivityUiTest {


    @Test
    fun should_have_3button_2textView_when_start() {

        startActivity()

        Espresso.onView(withId(R.id.baguette_button)).check(matches(isDisplayed()))
        Espresso.onView(withId(R.id.brioche_button)).check(matches(isDisplayed()))
        Espresso.onView(withId(R.id.roll_button)).check(matches(isDisplayed()))

        //신기한게 textView 가 존재하는 하나 "" 일 경우에 isDisplayed 되면은 안보인다...

        Espresso.onView(withId(R.id.bread_name_tv)).check(matches(withText("")))
        Espresso.onView(withId(R.id.bread_calories_tv)).check(matches(withText("")))
    }


    @Test
    fun should_show_right_name_and_calories_when_click_baguette_button() {

        startActivity()

        Espresso.onView(ViewMatchers.withId(R.id.baguette_button)).perform(ViewActions.click())

        Espresso.onView(ViewMatchers.withId(R.id.bread_name_tv))
            .check(matches(ViewMatchers.withText("Baguette")))
        Espresso.onView(ViewMatchers.withId(R.id.bread_calories_tv))
            .check(matches(ViewMatchers.withText("150")))
    }

    @Test
    fun should_show_right_name_and_calories_when_click_brioche_button() {

        startActivity()

        Espresso.onView(ViewMatchers.withId(R.id.brioche_button)).perform(ViewActions.click())

        Espresso.onView(ViewMatchers.withId(R.id.bread_name_tv))
            .check(matches(ViewMatchers.withText("Brioche")))
        Espresso.onView(ViewMatchers.withId(R.id.bread_calories_tv))
            .check(matches(ViewMatchers.withText("175")))
    }

    @Test
    fun should_show_right_name_and_calories_when_click_roll_button() {


        startActivity()

        Espresso.onView(ViewMatchers.withId(R.id.roll_button)).perform(ViewActions.click())

        Espresso.onView(ViewMatchers.withId(R.id.bread_name_tv))
            .check(matches(ViewMatchers.withText("Roll")))
        Espresso.onView(ViewMatchers.withId(R.id.bread_calories_tv))
            .check(matches(ViewMatchers.withText("200")))
    }

    private fun startActivity() {
        ActivityScenario.launch(FactoryPatternActivity::class.java)
    }
}