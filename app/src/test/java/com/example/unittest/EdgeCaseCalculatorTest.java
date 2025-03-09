package com.example.unittest;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/*
 * Kelas ini menguji kasus khusus dari kelas Calculator,
 * seperti pembagian dengan nol.
 * Menggunakan local unit test (JUnit).
 */
public class EdgeCaseCalculatorTest {

    private Calculator calculator;

    // Inisialisasi objek Calculator sebelum setiap test dijalankan
    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    // Test untuk pembagian dengan nol
    @Test(expected = ArithmeticException.class)
    public void testDivisionByZero() {
        /*
         * Menguji apakah pembagian dengan nol menghasilkan ArithmeticException
         * Test ini akan gagal jika exception tidak dilemparkan.
         */
        calculator.divide(6, 0);
    }
}