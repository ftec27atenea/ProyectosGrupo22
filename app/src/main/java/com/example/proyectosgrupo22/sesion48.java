package com.example.proyectosgrupo22;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;


public class sesion48 extends AppCompatActivity {
    List<String> ListaProductos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sesion48);
        LlenarLista();
    }

    public void  LlenarLista(){
        ListaProductos=new ArrayList<>();

        ListaProductos.add("Pan");
        ListaProductos.add("Leche");
        ListaProductos.add("Carne");
        ListaProductos.add("Huevos");
        ListaProductos.add("Mantiquilla");
        ListaProductos.add("Jabon");
        ListaProductos.add("Cebolla");
        ListaProductos.add("Tomate");
        ListaProductos.add("Manzanas");
        ListaProductos.add("Papayas");
        ListaProductos.add("Pescado");
        ListaProductos.add("Sal");
        ListaProductos.add("Azucar");
        ListaProductos.add("Harina");
        ListaProductos.add("Remolacha");
        ListaProductos.add("Aceite");
        ListaProductos.add("Arepas");
        ListaProductos.add("Pasta dental");
        ListaProductos.add("Papa");
        ListaProductos.add("Gaseosa");
        ListaProductos.add("Agua");
        ListaProductos.add("Servilletas");
        ListaProductos.add("Aceitunas");
        ListaProductos.add("Cerveza");
        ListaProductos.add("Salsa de tomate");
        ListaProductos.add("Pimienta");
        ListaProductos.add("Salchichas");
        ListaProductos.add("Jamon");
        ListaProductos.add("Papas fritas");
        ListaProductos.add("Escoba");
        ListaProductos.add("Trapero");

        sesion_48_adapter adapter=new sesion_48_adapter(this.ListaProductos);
        RecyclerView rv_ListaProductos=findViewById(R.id.rv_ListaProductos);


    }
}