package com.example.dogglers

import androidx.test.espresso.Espresso
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.MediumTest
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@MediumTest
class ButtonTests {

  @get:Rule
  var activityRule: ActivityScenarioRule<MainActivity> =
    ActivityScenarioRule(MainActivity::class.java)

  @Test
  fun vertical_list_button_is_displayed() {
    onView(ViewMatchers.withId(R.id.vertical_btn))
      .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
  }
}