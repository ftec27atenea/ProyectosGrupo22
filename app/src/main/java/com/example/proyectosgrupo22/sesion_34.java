package com.example.proyectosgrupo22;

import static com.example.proyectosgrupo22.R.id.tvEdad;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

public class sesion_34 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sesion_34);

        int edad = 45;
        double altura = 1.70;
        boolean estudiante = true;
        String nombre = "Jairo Ortiz";

        TextView tvEdad=findViewById(R.id.tvEdad);
        TextView tvAltura=findViewById(R.id.tvAltura);
        TextView tvEstudiante=findViewById(R.id.tvEstudiante);
        TextView tvNombre=findViewById(R.id.tvNombre);


        tvEdad.setText(String.valueOf(edad));
        tvAltura.setText(String.valueOf(altura));
        tvEstudiante.setText(String.valueOf(estudiante));
        tvNombre.setText(nombre);

    }
}