package com.example.proyectosgrupo22;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.LinearLayout;

public class Sesion43c extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sesion43c);
        LinearLayout pantalla = findViewById(R.id.pantalla);
        Configuration configuration = this.getResources().getConfiguration();
        if (configuration.orientation==Configuration.ORIENTATION_LANDSCAPE)
        {
            pantalla.setOrientation(LinearLayout.HORIZONTAL);
        }
        else
        {
            pantalla.setOrientation(LinearLayout.VERTICAL);
        }
    }
}