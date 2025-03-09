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

// Kelas ini digunakan untuk menguji operasi matematika dasar (penjumlahan, pengurangan, perkalian, pembagian)
@RunWith(AndroidJUnit4.class) // Menjalankan tes dengan runner AndroidJUnit4
public class BasicMathOperationsUITest {

    // Aturan untuk menjalankan MainActivity sebelum setiap tes dijalankan
    @Rule
    public ActivityScenarioRule<MainActivity> activityRule =
            new ActivityScenarioRule<>(MainActivity.class);

    // Tes untuk tombol penjumlahan
    @Test
    public void testAdditionButton() {
        onView(withId(R.id.etNumber1)).perform(typeText("5")); // Memasukkan angka 5 ke field pertama
        onView(withId(R.id.etNumber2)).perform(typeText("3")); // Memasukkan angka 3 ke field kedua
        onView(withId(R.id.btnAdd)).perform(click()); // Mengklik tombol penjumlahan
        onView(withId(R.id.tvResult)).check(matches(withText("Hasil: 8"))); // Memeriksa hasil penjumlahan
    }

    // Tes untuk tombol pengurangan
    @Test
    public void testSubtractionButton() {
        onView(withId(R.id.etNumber1)).perform(typeText("5")); // Memasukkan angka 5 ke field pertama
        onView(withId(R.id.etNumber2)).perform(typeText("3")); // Memasukkan angka 3 ke field kedua
        onView(withId(R.id.btnSubtract)).perform(click()); // Mengklik tombol pengurangan
        onView(withId(R.id.tvResult)).check(matches(withText("Hasil: 2"))); // Memeriksa hasil pengurangan
    }

    // Tes untuk tombol perkalian
    @Test
    public void testMultiplicationButton() {
        onView(withId(R.id.etNumber1)).perform(typeText("5")); // Memasukkan angka 5 ke field pertama
        onView(withId(R.id.etNumber2)).perform(typeText("3")); // Memasukkan angka 3 ke field kedua
        onView(withId(R.id.btnMultiply)).perform(click()); // Mengklik tombol perkalian
        onView(withId(R.id.tvResult)).check(matches(withText("Hasil: 15"))); // Memeriksa hasil perkalian
    }

    // Tes untuk tombol pembagian
    @Test
    public void testDivisionButton() {
        onView(withId(R.id.etNumber1)).perform(typeText("6")); // Memasukkan angka 6 ke field pertama
        onView(withId(R.id.etNumber2)).perform(typeText("3")); // Memasukkan angka 3 ke field kedua
        onView(withId(R.id.btnDivide)).perform(click()); // Mengklik tombol pembagian
        onView(withId(R.id.tvResult)).check(matches(withText("Hasil: 2.0"))); // Memeriksa hasil pembagian
    }
}