package com.example.jorgeibarra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int VAR = 1;
    String nombre = "",apellido = "",base = "", exponente = "", numFactorial = "";

    private TextView tvnombre;
    private TextView tvapellido;
    private TextView tvbase;
    private TextView tvexponente;
    private TextView tvfactorial;
    private TextView tvpotencia;
    private Button btnResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvnombre = findViewById(R.id.tvNombreActvt1);
        tvapellido = findViewById(R.id.tvApellidoActvt1);
        tvbase = findViewById(R.id.tvBaseActvt1);
        tvexponente = findViewById(R.id.etExponenteActvt3);
        tvfactorial = findViewById(R.id.tvFactorialActvt1);
        tvpotencia = findViewById(R.id.tvPotenciaActvt1);

        btnResultado = findViewById(R.id.btnResultadoActvt1);

        if(nombre.equals("")){
            btnResultado.setEnabled(false);
        }
    }

    public void abrirSegundoActivity(View view){
        Intent intent = new Intent(this,MainActivity2.class);
        startActivityForResult(intent, VAR);
    }
    protected int PotenciaAlgoritmo(int base, int exponente){
        return(int)Math.pow(base,exponente);
    }
    protected int factorialAlgoritmo(int dato){
        if (dato==0)
            return 1;
        else
            return (int)(dato * factorialAlgoritmo(dato-1));
    }



}