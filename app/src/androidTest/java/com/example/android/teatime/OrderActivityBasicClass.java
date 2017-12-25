package com.example.android.teatime;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by Rafid on 12/24/2017.
 */

@RunWith(AndroidJUnit4.class)
public class OrderActivityBasicClass {
    @Rule public ActivityTestRule<OrderActivity> mActivityTestRule = new ActivityTestRule<>(OrderActivity.class);

    @Test
    public void clickIncrementButton_ChangesQuantityAndCost()
    {
        onView((withId(R.id.increment_button))).perform(click());
        onView(withId(R.id.quantity_text_view)).check(matches(withText("1")));
        onView(withId(R.id.cost_text_view)).check(matches(withText("1")));
    }
}
