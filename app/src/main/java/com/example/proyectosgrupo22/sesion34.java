package com.example.proyectosgrupo22;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class sesion34 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sesion34);

        int edad = 39;
        double altura = 1.50;
        boolean Estudiante = true;
        String nombre = "Ivonn Rodriguez";

        TextView tvedad=findViewById(R.id.tvEdad);
        TextView tvaltura=findViewById(R.id.tvAltura);
        TextView tvestudiante=findViewById(R.id.tvEstudiante);
        TextView tvnombre=findViewById(R.id.tvNombre);

        tvedad.setText("Edad:"+String.valueOf(edad));
        tvaltura.setText(String.valueOf(altura));
        tvestudiante.setText(String.valueOf(Estudiante));
        tvnombre.setText(nombre);
    }
}