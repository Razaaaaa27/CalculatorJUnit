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

// Kelas ini digunakan untuk menguji kasus khusus, seperti pembagian dengan nol
@RunWith(AndroidJUnit4.class) // Menjalankan tes dengan runner AndroidJUnit4
public class EdgeCaseUITest {

    // Aturan untuk menjalankan MainActivity sebelum setiap tes dijalankan
    @Rule
    public ActivityScenarioRule<MainActivity> activityRule =
            new ActivityScenarioRule<>(MainActivity.class);

    // Tes untuk kasus pembagian dengan nol
    @Test
    public void testDivisionByZero() {
        onView(withId(R.id.etNumber1)).perform(typeText("6")); // Memasukkan angka 6 ke field pertama
        onView(withId(R.id.etNumber2)).perform(typeText("0")); // Memasukkan angka 0 ke field kedua
        onView(withId(R.id.btnDivide)).perform(click()); // Mengklik tombol pembagian
        onView(withId(R.id.tvResult)).check(matches(withText("Tidak bisa dibagi dengan nol"))); // Memeriksa pesan error
    }
}