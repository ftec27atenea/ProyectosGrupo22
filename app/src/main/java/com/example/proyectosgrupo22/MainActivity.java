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
        TextView textView=findViewById(R.id.spyro);
        Animation animation= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.animacion_01);
        textView.startAnimation(animation);

    }
}