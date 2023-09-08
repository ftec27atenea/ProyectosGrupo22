package com.example.proyectosgrupo22;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class dosActividades extends AppCompatActivity {

    private EditText miMensajeEditText;

    public static final  String EXTRA_MESSAGE =
            "com.example.android.proyectosgrupo22.extra.MESSAGE";
    private static final String LOG_TAG =
            dosActividades.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dos_actividades);
        miMensajeEditText = findViewById(R.id.editText_main);

    }

    public void lanzarSegundaActividad(View view) {
        Log.d(LOG_TAG, "Boton Clikeado");
        Intent intent = new Intent(this, segunda_actividad.class);
        String mensaje = miMensajeEditText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE,mensaje);
        startActivity(intent);
    }

}