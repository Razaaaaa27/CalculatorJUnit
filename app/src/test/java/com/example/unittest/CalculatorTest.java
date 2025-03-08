package com.example.unittest;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/*
 * Kelas ini menguji metode add(), subtract(), multiply(), dan divide() dari kelas Calculator
 * Menggunakan local unit test (JUnit)
 */
public class CalculatorTest {

    private Calculator calculator;

    // Inisialisasi objek Calculator sebelum setiap test dijalankan
    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    // Test untuk metode add()
    @Test
    public void testAddition() {
        /*
         * Menguji apakah 2 + 3 = 5
         * Jika hasil tidak sesuai, maka test akan gagal.
         */
        assertEquals(5, calculator.add(2, 3));
    }

    // Test untuk metode subtract()
    @Test
    public void testSubtraction() {
        /*
         * Menguji apakah 5 - 3 = 2
         * Jika hasil tidak sesuai, maka test akan gagal.
         */
        assertEquals(2, calculator.subtract(5, 3));
    }

    // Test untuk metode multiply()
    @Test
    public void testMultiplication() {
        /*
         * Menguji apakah 3 * 4 = 12
         * Jika hasil tidak sesuai, maka test akan gagal.
         */
        assertEquals(12, calculator.multiply(3, 4));
    }

    // Test untuk metode divide()
    @Test
    public void testDivision() {
        /*
         * Menguji apakah 6 / 3 = 2.0
         * Jika hasil tidak sesuai, maka test akan gagal.
         */
        assertEquals(2.0, calculator.divide(6, 3), 0.001); // 0.001 adalah margin error untuk perbandingan double
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
