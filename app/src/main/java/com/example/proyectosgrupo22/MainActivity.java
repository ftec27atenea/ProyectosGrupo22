package com.example.proyectosgrupo22;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sesion_32);
        TextView texto=findViewById(R.id.mi_texto);
        Animation animacion= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.animacion_01);
        texto.startAnimation(animacion);
    }
}