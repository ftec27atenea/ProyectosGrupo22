package com.example.proyectosgrupo22;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class repaso_recicle_view extends AppCompatActivity {

    List<String> Productos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_repaso_recicle_view);
        llenarlista();
    }

    public void llenarlista(){
        Productos=new ArrayList<>();
        Productos.add("pan de uvas");
        Productos.add("pan galleta");
        Productos.add("pan con queso");
        Productos.add("leche");
        Productos.add("huevos");
        Productos.add("arepas");
        Productos.add("gaseosa");
        Productos.add("queso");
        Productos.add("chocolate");
        Productos.add("cafe");
        Productos.add("mantecada");
        Adaptador adaptador=new Adaptador(Productos,this);
        RecyclerView milista=findViewById(R.id.mis_productos);
        milista.setHasFixedSize(true);
        milista.setLayoutManager(new LinearLayoutManager(this));
        milista.setAdapter(adaptador);
    }

}