package com.example.unittest;

import android.content.Context;
import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

/*
 * Kelas ini menguji apakah aplikasi berjalan di package yang benar
 * Menggunakan instrumented test (AndroidJUnit4)
 */

@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {

    @Test
    public void useAppContext() {
        /*
         * Menguji apakah aplikasi berjalan dengan package name yang sesuai.
         * Jika tidak sesuai, maka test akan gagal.
         */
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
        assertEquals("com.example.unittest", appContext.getPackageName());
    }
}
