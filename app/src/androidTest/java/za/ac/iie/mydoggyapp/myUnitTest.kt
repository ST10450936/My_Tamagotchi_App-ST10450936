package za.ac.iie.mydoggyapp

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class DoogyPage1Test {

    @Before
    fun launchActivity() {
        ActivityScenario.launch(DoogyPage1::class.java)
    }

    @Test
    fun testInitialUI() {
        // Check if the initial UI elements are displayed correctly
        Espresso.onView(ViewMatchers.withId(R.id.cleanStatuslevel))
            .check(ViewAssertions.matches(ViewMatchers.withText("Cleanliness Level: 0")))
        Espresso.onView(ViewMatchers.withId(R.id.playStatusLevel))
            .check(ViewAssertions.matches(ViewMatchers.withText("Happiness Level: 0")))
        Espresso.onView(ViewMatchers.withId(R.id.eatStatusLevel))
            .check(ViewAssertions.matches(ViewMatchers.withText("Hunger Level: 0")))
    }

    @Test
    fun testButtonActions() {
        // Perform actions on buttons and verify UI changes accordingly
        Espresso.onView(ViewMatchers.withId(R.id.btnEat)).perform(ViewActions.click())
        Espresso.onView(ViewMatchers.withId(R.id.eatStatusLevel))
            .check(ViewAssertions.matches(ViewMatchers.withText("Hunger Level: 10")))

        Espresso.onView(ViewMatchers.withId(R.id.btnWash)).perform(ViewActions.click())
        Espresso.onView(ViewMatchers.withId(R.id.cleanStatuslevel))
            .check(ViewAssertions.matches(ViewMatchers.withText("Cleanliness Level: 10")))

        Espresso.onView(ViewMatchers.withId(R.id.btnPlay2)).perform(ViewActions.click())
        Espresso.onView(ViewMatchers.withId(R.id.playStatusLevel))
            .check(ViewAssertions.matches(ViewMatchers.withText("Happiness Level: 10")))
    }
}
