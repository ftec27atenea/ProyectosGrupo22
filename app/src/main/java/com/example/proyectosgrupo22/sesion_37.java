package com.example.proyectosgrupo22;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TextView;

public class sesion_37 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sesion_37);

        TextView elementoAmarillo=findViewById(R.id.elementoAmarillo);
        ViewGroup.MarginLayoutParams parametros =(ViewGroup.MarginLayoutParams) elementoAmarillo.getLayoutParams();
        parametros.leftMargin=0;
    }
}