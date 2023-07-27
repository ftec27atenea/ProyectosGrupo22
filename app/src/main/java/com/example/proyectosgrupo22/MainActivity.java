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
        setContentView(R.layout.session_32);
        TextView textvew1=findViewById(R.id.textoenpantalla);
        Animation mianimacion =AnimationUtils.loadAnimation(getApplicationContext(),R.anim.animacion2);
        textvew1.startAnimation(mianimacion);
    }
}