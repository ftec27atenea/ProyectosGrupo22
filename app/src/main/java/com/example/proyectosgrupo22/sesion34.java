package com.example.proyectosgrupo22;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;


public class sesion34 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sesion34);

        int Edad = 30;
        double Altura = 1.76;
        boolean Estudiante = true;
        String Nombre = "Kevin Guzman";

        TextView tvEdad=findViewById(R.id.tvEdad);
        TextView tvAltura=findViewById(R.id.tvAltura);
        TextView tvEstudiante=findViewById(R.id.tvEstudiante);
        TextView tvNombre=findViewById(R.id.tvNombre);

        tvEdad.setText(String.valueOf(Edad));
        tvAltura.setText(String.valueOf(Altura));
        tvEstudiante.setText(String.valueOf(Estudiante));
        tvNombre.setText(String.valueOf(Nombre));
    }
}