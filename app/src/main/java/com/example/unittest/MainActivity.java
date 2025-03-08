package com.example.unittest;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText etNumber1, etNumber2;
    private Button btnAdd, btnSubtract, btnMultiply, btnDivide;
    private TextView tvResult;
    private Calculator calculator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inisialisasi objek Calculator
        calculator = new Calculator();

        // Menghubungkan elemen UI dengan variabel
        etNumber1 = findViewById(R.id.etNumber1);
        etNumber2 = findViewById(R.id.etNumber2);
        btnAdd = findViewById(R.id.btnAdd);
        btnSubtract = findViewById(R.id.btnSubtract); // Tombol untuk pengurangan
        btnMultiply = findViewById(R.id.btnMultiply); // Tombol untuk perkalian
        btnDivide = findViewById(R.id.btnDivide); // Tombol untuk pembagian
        tvResult = findViewById(R.id.tvResult);

        // Set Listener untuk tombol tambah
        btnAdd.setOnClickListener(v -> {
            int num1 = Integer.parseInt(etNumber1.getText().toString());
            int num2 = Integer.parseInt(etNumber2.getText().toString());
            int result = calculator.add(num1, num2);
            tvResult.setText("Hasil: " + result);
        });

        // Set Listener untuk tombol kurang
        btnSubtract.setOnClickListener(v -> {
            int num1 = Integer.parseInt(etNumber1.getText().toString());
            int num2 = Integer.parseInt(etNumber2.getText().toString());
            int result = calculator.subtract(num1, num2);
            tvResult.setText("Hasil: " + result);
        });

        // Set Listener untuk tombol kali
        btnMultiply.setOnClickListener(v -> {
            int num1 = Integer.parseInt(etNumber1.getText().toString());
            int num2 = Integer.parseInt(etNumber2.getText().toString());
            int result = calculator.multiply(num1, num2);
            tvResult.setText("Hasil: " + result);
        });

        // Set Listener untuk tombol bagi
        btnDivide.setOnClickListener(v -> {
            int num1 = Integer.parseInt(etNumber1.getText().toString());
            int num2 = Integer.parseInt(etNumber2.getText().toString());
            if (num2 != 0) {
                double result = calculator.divide(num1, num2);
                tvResult.setText("Hasil: " + result);
            } else {
                tvResult.setText("Tidak bisa dibagi dengan nol");
            }
        });
    }
}
