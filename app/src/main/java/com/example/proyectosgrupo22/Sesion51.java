package com.example.proyectosgrupo22;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Sesion51 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sesion51);
        Button botonv = findViewById(R.id.buttonV);
        botonv.setOnClickListener(this::mostrarImagen);

    }

    public void mostrarImagen(View v){
        ImageView imagen= findViewById(R.id.imagen);
        if (imagen.getVisibility()== View.VISIBLE){
            imagen.setVisibility(View.GONE);
        }
        else {
            imagen.setVisibility(View.VISIBLE);
        }
    }
}