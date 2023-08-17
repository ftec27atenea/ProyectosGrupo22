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
        setContentView(R.layout.sesion39);
        Button Girar=findViewById(R.id.Girar);
        Girar.setOnClickListener(this::eventoGirar);
    }
    public void eventoGirar(View view) {
        AnimationSet mianimacion=new AnimationSet(true);
        mianimacion.addAnimation(new RotateAnimation(0,900, Animation.RELATIVE_TO_SELF,0.5f,Animation.RELATIVE_TO_SELF,0.5f));
        mianimacion.setDuration(5000);

        ImageView luffygif=findViewById(R.id.luffy41);
        luffygif.startAnimation(mianimacion);

    }

}