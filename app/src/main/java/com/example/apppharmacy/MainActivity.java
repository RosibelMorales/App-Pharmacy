package com.example.apppharmacy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    TextInputLayout txtid;
    TextInputLayout txtcodigobarras;
    TextInputLayout txtdescripcion;
    TextInputLayout txtlaboratorio;
    TextInputLayout txtpreciocompra;
    TextInputLayout txtprecioventa;
    TextInputLayout txtexistencias;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtid = findViewById(R.id.txtid);
        txtcodigobarras = findViewById(R.id.txtcodigobarras);
        txtdescripcion = findViewById(R.id.txtdescripcion);
        txtlaboratorio = findViewById(R.id.txtlaboratorio);
        txtpreciocompra = findViewById(R.id.txtpreciocompra);
        txtprecioventa = findViewById(R.id.txtprecioventa);
        txtexistencias = findViewById(R.id.txtexistencias);
    }
}