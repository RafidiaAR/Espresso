package com.example.android.teatime;

import android.support.test.espresso.IdlingResource;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by Rafid on 12/24/2017.
 */

@RunWith(AndroidJUnit4.class)
public class IdlingResourceMenuActivityTest {

    @Rule
    public ActivityTestRule<MenuActivity> mActivityTestRule =
            new ActivityTestRule<>(MenuActivity.class);

    private IdlingResource mIdlingResource;

    @Before
    public void registerIdlingResource() {

    }
    @Test
    public void idlingResourceTest() {

    }

    @After
    public void unregisterIdlingResource() {

    }
}
