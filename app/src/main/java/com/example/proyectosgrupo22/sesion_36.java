package com.example.proyectosgrupo22;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class sesion_36 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sesion_36);
    }

    public void MostrarElTexto(View view){
        EditText etCajaDeTexto=findViewById(R.id.etCajaDeTexto);
        Toast.makeText(getApplicationContext(),etCajaDeTexto.getText(),Toast.LENGTH_LONG).show();
    }

    public void ObteerFormaDeTransporte(View view){
        CheckBox OpcionCarro=findViewById(R.id.OpcionCarro);
        CheckBox OpcionMoto=findViewById(R.id.OpcionMoto);
        CheckBox OpcionBicicleta=findViewById(R.id.OpcionBicicleta);

        String carro="\nCarro:"+OpcionCarro.isChecked();
        String moto="\nMoto:"+OpcionMoto.isChecked();
        String bicicleta="\nBicicleta:"+OpcionBicicleta.isChecked();

        Toast.makeText(getApplicationContext(),(carro+moto+bicicleta),Toast.LENGTH_LONG).show();
    }
}