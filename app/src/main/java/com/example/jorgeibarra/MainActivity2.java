package com.example.jorgeibarra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private int VAR = 1;
    private TextView tvnombre;
    private TextView tvBase;
    private Button btnCerrar;

    String nombre="", apellido, base="", exponente, numero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tvnombre = findViewById(R.id.tvNombreActvt2);
        tvBase = findViewById(R.id.tvBaseActvt2);
        btnCerrar = findViewById(R.id.btnCerrarActvt2);

        if(nombre.equals(""))
            btnCerrar.setEnabled(false);
    }

    public void AbrirActivity3(View view){
        Intent intent = new Intent(this, MainActivity3.class);
        intent.putExtra("nombre", tvnombre.getText().toString());
        intent.putExtra("base", tvBase.getText().toString());
        startActivityForResult(intent, VAR);
    }

}