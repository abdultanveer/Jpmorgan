package com.example.jpmorgan;


import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class HomeActiTest {

    @Rule
    public ActivityScenarioRule<HomeActivity> mActivityScenarioRule =
            new ActivityScenarioRule<>(HomeActivity.class);

    @Test
    public void homeActivityTest() {
        //enter abdul ansari in the edittext
        onView(withId(R.id.etContact))
                .perform(typeText("abdul ansari"), closeSoftKeyboard());
        //click the button
        onView(withId(R.id.btnContact)).perform(click());
        //check if textview has abdul ansari
        onView(withId(R.id.tvResult))
                .check(matches(withText("abdul ansari")));
    }


}
