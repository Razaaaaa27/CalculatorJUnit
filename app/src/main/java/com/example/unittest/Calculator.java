package com.example.unittest;

public class Calculator {

    // Metode untuk melakukan penjumlahan dua bilangan
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    // Metode untuk melakukan pengurangan dua bilangan
    public int subtract(int num1, int num2) {
        return num1 - num2;
    }

    // Metode untuk melakukan perkalian dua bilangan
    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    // Metode untuk melakukan pembagian dua bilangan
    // Melemparkan ArithmeticException jika pembagi adalah nol
    public double divide(int num1, int num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return (double) num1 / num2;
    }
}
