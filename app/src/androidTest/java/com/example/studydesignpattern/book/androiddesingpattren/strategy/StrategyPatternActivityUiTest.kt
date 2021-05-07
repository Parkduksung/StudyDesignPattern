package com.example.studydesignpattern.book.androiddesingpattren.strategy

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.studydesignpattern.R
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class StrategyPatternActivityUiTest {


    @Before
    fun setup() {
        ActivityScenario.launch(StrategyPatternActivity::class.java)
    }


    @Test
    fun shouldShow3ButtonAnd2TextViewWhenAppStart() {

        Espresso.onView(withId(R.id.soju_button)).check(matches(isDisplayed()))
        Espresso.onView(withId(R.id.bear_button)).check(matches(isDisplayed()))
        Espresso.onView(withId(R.id.whiskey_button)).check(matches(isDisplayed()))

        Espresso.onView(withId(R.id.alcohol_tv)).check(matches(withText("")))
        Espresso.onView(withId(R.id.price_tv)).check(matches(withText("")))

    }

    @Test
    fun shouldShowPrice3000AndAlcohol18WhenClickSojuButton() {

        Espresso.onView(withId(R.id.soju_button)).perform(click())

        Espresso.onView(withId(R.id.alcohol_tv)).check(matches(withText("18")))
        Espresso.onView(withId(R.id.price_tv)).check(matches(withText("3000")))

    }

    @Test
    fun shouldShowPrice2500AndAlcohol5WhenClickBearButton() {
        Espresso.onView(withId(R.id.bear_button)).perform(click())

        Espresso.onView(withId(R.id.alcohol_tv)).check(matches(withText("5")))
        Espresso.onView(withId(R.id.price_tv)).check(matches(withText("2500")))

    }

    @Test
    fun shouldShowPrice30000AndAlcohol40WhenClickWhiskeyButton() {
        Espresso.onView(withId(R.id.whiskey_button)).perform(click())

        Espresso.onView(withId(R.id.alcohol_tv)).check(matches(withText("40")))
        Espresso.onView(withId(R.id.price_tv)).check(matches(withText("30000")))

    }

}