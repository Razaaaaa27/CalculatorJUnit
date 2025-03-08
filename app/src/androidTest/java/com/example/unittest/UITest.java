package com.example.unittest;

import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

/*
 * Kelas ini menguji interaksi UI dari aplikasi kalkulator
 * Menggunakan Espresso Framework
 */
@RunWith(AndroidJUnit4.class)
public class UITest {

    // Mendeklarasikan aturan untuk menjalankan Activity sebelum setiap test dijalankan
    @Rule
    public ActivityScenarioRule<MainActivity> activityRule =
            new ActivityScenarioRule<>(MainActivity.class);

    // Test untuk tombol tambah
    @Test
    public void testAdditionButton() {
        onView(withId(R.id.etNumber1)).perform(typeText("5"));
        onView(withId(R.id.etNumber2)).perform(typeText("3"));
        onView(withId(R.id.btnAdd)).perform(click());
        onView(withId(R.id.tvResult)).check(matches(withText("Hasil: 8")));
    }

    // Test untuk tombol kurang
    @Test
    public void testSubtractionButton() {
        onView(withId(R.id.etNumber1)).perform(typeText("5"));
        onView(withId(R.id.etNumber2)).perform(typeText("3"));
        onView(withId(R.id.btnSubtract)).perform(click());
        onView(withId(R.id.tvResult)).check(matches(withText("Hasil: 2")));
    }

    // Test untuk tombol kali
    @Test
    public void testMultiplicationButton() {
        onView(withId(R.id.etNumber1)).perform(typeText("5"));
        onView(withId(R.id.etNumber2)).perform(typeText("3"));
        onView(withId(R.id.btnMultiply)).perform(click());
        onView(withId(R.id.tvResult)).check(matches(withText("Hasil: 15")));
    }

    // Test untuk tombol bagi
    @Test
    public void testDivisionButton() {
        onView(withId(R.id.etNumber1)).perform(typeText("6"));
        onView(withId(R.id.etNumber2)).perform(typeText("3"));
        onView(withId(R.id.btnDivide)).perform(click());
        onView(withId(R.id.tvResult)).check(matches(withText("Hasil: 2.0")));
    }

    // Test untuk pembagian
    @Test
    public void testDivisionByZero() {
        onView(withId(R.id.etNumber1)).perform(typeText("6"));
        onView(withId(R.id.etNumber2)).perform(typeText("0"));
        onView(withId(R.id.btnDivide)).perform(click());
        onView(withId(R.id.tvResult)).check(matches(withText("Tidak bisa dibagi dengan nol")));
    }
}
