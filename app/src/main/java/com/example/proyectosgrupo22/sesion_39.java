package com.example.proyectosgrupo22;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.ImageView;

public class sesion_39 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sesion_39);
        Button btnefecto= findViewById(R.id.btnefecto);
        btnefecto.setOnClickListener(this::eventogirar);
    }

    public void eventogirar(View view){
        AnimationSet miAnimacion = new AnimationSet(true);
        miAnimacion.addAnimation(new RotateAnimation(0,180, Animation.RELATIVE_TO_SELF,Value));
        miAnimacion.setDuration(5000);

        ImageView espiral= findViewById(R.id.espiral);
        espiral.startAnimation(miAnimacion);
    }
}