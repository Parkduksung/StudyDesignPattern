package com.example.studydesignpattern.book.androiddesingpattren.singleton

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.studydesignpattern.R
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class SingletonPatternActivityUiTest {


    @Before
    fun setup() {
        ActivityScenario.launch(SingletonPatternActivity::class.java)
    }


    @Test
    fun shouldShow1EditTextAnd1ButtonWhenAppStart() {

        Espresso.onView(withId(R.id.input_et)).check(matches(isDisplayed()))
        Espresso.onView(withId(R.id.set_info_button)).check(matches(isDisplayed()))

    }


    @Test
    fun shouldAlrightValueWhenInputEditTextAndClickButton() {
        ActivityScenario.launch(SingletonPatternActivity::class.java)

        Espresso.onView(withId(R.id.input_et)).perform(typeText("duksung"), closeSoftKeyboard())

        Espresso.onView(withId(R.id.set_info_button)).perform(click())

        Espresso.onView(withId(R.id.get_data_tv))
            .check(matches(withText(SingletonPerson.getName())))

    }

}