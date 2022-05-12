package com.example.dogglers

import androidx.test.espresso.Espresso
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withId
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
    onView(withId(R.id.vertical_btn))
      .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
  }

  @Test
  fun horizontal_list_button_is_displayed() {
    onView(withId(R.id.horizontal_btn)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
  }

  @Test
  fun grid_list_button_is_displayed() {
    onView(withId(R.id.grid_btn)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
  }

  @Test
  fun clicking_vertical_list_button_displays_vertical_list() {
    onView(withId(R.id.vertical_btn)).perform(ViewActions.click())
    onView(withId(R.id.recycler_view)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
  }
}