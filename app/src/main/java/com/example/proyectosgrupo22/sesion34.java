package com.example.proyectosgrupo22;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class sesion34 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sesion34);

        int edad = 36;
        double altura = 1.77;
        boolean esEstudiante = false;
        String nombre = "Victor cardenas";

        TextView tvedad=findViewById(R.id.tvEdad);
        TextView tvaltura= findViewById(R.id.tvAltura);
        TextView tvestudiante=findViewById(R.id.tvEstudiante);
        TextView tvnombre= findViewById(R.id.tvNombre);

        tvedad.setText("Edad="+String.valueOf(edad));
        tvaltura.setText(String.valueOf(altura));
        tvestudiante.setText(String.valueOf(esEstudiante));
        tvnombre.setText(String.valueOf(nombre));

    }
}
