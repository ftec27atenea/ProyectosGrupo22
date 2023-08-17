package com.example.proyectosgrupo22;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.os.Bundle;
import android.widget.ImageView;

public class sesion_39 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sesion_39);
        Button btnEfecto=findViewById(R.id.btnEfecto);
        btnEfecto.setOnClickListener(this::eventoGirar);
    }

    public void eventoGirar(View view){
        AnimationSet miAnimiacion = new AnimationSet(true);
        miAnimiacion.addAnimation(new RotateAnimation(0,720, Animation.RELATIVE_TO_SELF,0.5f,Animation.RELATIVE_TO_SELF,0.5f));
        miAnimiacion.setDuration(5000);

        ImageView ivRosaDeLosVientos= findViewById(R.id.ivRosaDeLosVientos);
        ivRosaDeLosVientos.startAnimation(miAnimiacion);
    }
}