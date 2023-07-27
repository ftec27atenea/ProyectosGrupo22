package com.example.proyectosgrupo22;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class sesion_34 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sesion_34);

        int edad = 36;
        double altura = 1.77;
        boolean esEstudiante = false;
        String nombre = "Nicolas Fiquitiva Segura";

        TextView tvEdad=findViewById(R.id.tvEdad);
        TextView tvAltura=findViewById(R.id.tvAltura);
        TextView tvEstudiante=findViewById(R.id.tvEstudiante);
        TextView tvNombre=findViewById(R.id.tvNombre);

        tvEdad.setText(String.valueOf(edad));
        tvAltura.setText(String.valueOf(altura));
        tvEstudiante.setText(String.valueOf(esEstudiante));
        tvNombre.setText(nombre);
    }
}