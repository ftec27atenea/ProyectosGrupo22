package com.example.proyectosgrupo22;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class sesion34 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sesion34);
        int edad =45;
        double altura = 1.72;
        boolean esEstudiante = false;
        String nombre = "Dario";

        TextView tVnombre= findViewById(R.id.Nombret);
        TextView tValtura= findViewById(R.id.Alturat);
        TextView tVesEstudiante= findViewById(R.id.Estudiantet);
        TextView tVedad= findViewById(R.id.Edadt);

        tVnombre.setText(String.valueOf(nombre));
        tValtura.setText(String.valueOf(altura));
        tVesEstudiante.setText(String.valueOf(esEstudiante));
        tVedad.setText(String.valueOf(edad));
    }
}