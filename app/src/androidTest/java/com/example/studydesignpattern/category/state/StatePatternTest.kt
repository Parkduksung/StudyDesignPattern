package com.example.studydesignpattern.category.state

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.studydesignpattern.R
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class StatePatternUiTest {




    @Test
    fun `should_show_text_stateNotChanged_when_already_on_and_click_LightOn`(){

        ActivityScenario.launch(StatePattern::class.java)

        onView(withId(R.id.on_button)).perform(click())

        onView(withId(R.id.state_tv)).check(matches(withText("stateNotChanged")))
    }

    @Test
    fun `should_show_text_stateChangedOff_when_already_on_and_click_LightOff`(){

        ActivityScenario.launch(StatePattern::class.java)

        onView(withId(R.id.off_button)).perform(click())

        onView(withId(R.id.state_tv)).check(matches(withText("stateChangedOff")))
    }
    
}