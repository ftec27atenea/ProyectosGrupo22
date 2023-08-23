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
        setContentView(R.layout.sesion_41);

        Button btnDetalle=findViewById(R.id.btnDetalle);
        btnDetalle.setOnClickListener(this::MostarImagen);
    }

    public void MostarImagen(View v){
        ImageView ivSorpresa=findViewById(R.id.iv_Sorpresa);
        if (ivSorpresa.getVisibility()==View.VISIBLE){
            ivSorpresa.setVisibility(View.GONE);
        }
        else{
            ivSorpresa.setVisibility(View.VISIBLE);
        }

    }
}