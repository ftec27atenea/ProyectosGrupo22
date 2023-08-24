package com.example.proyectosgrupo22;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.LinearLayoutCompat;

import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.LinearLayout;

public class sesion_43b extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sesion_43b);

        LinearLayout pantalla=findViewById(R.id.pantalla);
        Configuration configuration=this.getResources().getConfiguration();
        if (configuration.orientation==Configuration.ORIENTATION_LANDSCAPE)
        {
            pantalla.setOrientation(LinearLayout.HORIZONTAL);
        }
        else {
            pantalla.setOrientation(LinearLayout.VERTICAL);
        }
    }
}