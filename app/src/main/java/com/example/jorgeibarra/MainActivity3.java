package com.example.jorgeibarra;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    private EditText etnombre;
    private EditText etbase;

    private EditText etapellido;
    private EditText etexponente;
    private EditText etnumeroFact;

    String nombre, base;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        etnombre = findViewById(R.id.etNombreActvt3);
        etbase = findViewById(R.id.etBaseActvt3);
        etapellido = findViewById(R.id.etApellidoActvt3);
        etexponente = findViewById(R.id.etExponenteActvt3);
        etnumeroFact = findViewById(R.id.etNumFactActvt3);

    }
}