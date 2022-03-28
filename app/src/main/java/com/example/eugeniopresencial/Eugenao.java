package com.example.eugeniopresencial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

import java.text.NumberFormat;

public class Eugenao extends AppCompatActivity {
    private EditText textValor;
    private double totalConta = 0.0;
    private TextView textViewValor;
    private static final NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eugenao);
        textValor = findViewById(R.id.insiraValor);
        textValor.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            try{

            } catch (Exception e) {
                e.printStackTrace();
            }

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

    }
}