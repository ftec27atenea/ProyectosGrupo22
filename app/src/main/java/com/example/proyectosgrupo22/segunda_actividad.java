package com.example.proyectosgrupo22;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class segunda_actividad extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.segunda_actividad);
        Intent intent = getIntent();
        String mensaje = intent.getStringExtra(dosActividades.EXTRA_MESSAGE);
        TextView textView = findViewById(R.id.mensajeRecibido);
        textView.setText(mensaje);
    }
}