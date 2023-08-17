package com.example.proyectosgrupo22;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;


public class sesion_38 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sesion38);
        ImageView luffygif=findViewById(R.id.luffygif);
        ImageView imageView = findViewById(R.id.luffygif);
        Glide.with(this).load(R.drawable.icegif_803).into(imageView);

    }
}