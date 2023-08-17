package com.example.proyectosgrupo22;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class sesion_41 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sesion41);

        Button btnboton = findViewById(R.id.boton);
        btnboton.setOnClickListener(this::MostrarImagen);

    }
        public void MostarImagen(View v){
            ImageView ivluffy41=findViewById(R.id.luffy41);
            if (ivluffy41.getVisibility()== View.VISIBLE){
                ivluffy41.setVisibility(View.GONE);
            }
            else{
                ivluffy41.setVisibility(View.VISIBLE);
            }

        }
    }
}