package com.example.proyectosgrupo22;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;

public class sesion_36 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sesion36);
    }

    public void  ObtenerFormaDeTransporte(View view){
        CheckBox OpcionCarro=findViewById(R.id.OpcionCarro);
        CheckBox OpcionMoto=findViewById(R.id.OpcionMoto);
        CheckBox OpcionBicicleta=findViewById(R.id.OpcionBicicleta);

        String carro="Carro:"+OpcionCarro.isChecked();
        String moto="Moto:"+OpcionMoto.isChecked();
        String bicicleta="Bicicleta:"+OpcionBicicleta.isChecked();


    }
}