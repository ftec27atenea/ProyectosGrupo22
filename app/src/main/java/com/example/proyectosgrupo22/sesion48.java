package com.example.proyectosgrupo22;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;


public class sesion48 extends AppCompatActivity {
    List<ListElement> ListaProductos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sesion48);
        LlenarLista();
    }

    public void  LlenarLista(){
        ListaProductos=new ArrayList<>();
        ListaProductos.add(new ListElement("#775447","pan","3000"));
        ListaProductos.add(new ListElement("#607d8b","Leche","3000"));
        ListaProductos.add(new ListElement("#03a9F4","Huevos","3000"));
        ListaProductos.add(new ListElement("#3C2D29","Carne","3000"));
        ListaProductos.add(new ListElement("#D7C4C0","Gaseosa","3000"));
        ListaProductos.add(new ListElement("#BDDEB8","Queso","3000"));
        ListaProductos.add(new ListElement("#1D760D","Aguacate","3000"));
        ListaProductos.add(new ListElement("#A57BBF","Tomate","3000"));
        ListaProductos.add(new ListElement("#775447","Sal","3000"));



        Adaptador adapter=new Adaptador(ListaProductos, this);
        RecyclerView recyclerView = findViewById(R.id.recycler);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
        }

////       ListaProductos.add("Sal");
//        ListaProductos.add("Azucar");
//        ListaProductos.add("Harina");
//        ListaProductos.add("Remolacha");
//        ListaProductos.add("Aceite");
//        ListaProductos.add("Arepas");
//        ListaProductos.add("Pasta dental");
//        ListaProductos.add("Papa");
//        ListaProductos.add("Gaseosa");
//        ListaProductos.add("Agua");
//        ListaProductos.add("Servilletas");
//        ListaProductos.add("Aceitunas");
//        ListaProductos.add("Cerveza");
//        ListaProductos.add("Salsa de tomate");
//        ListaProductos.add("Pimienta");
//        ListaProductos.add("Salchichas");
//        ListaProductos.add("Jamon");
//        ListaProductos.add("Papas fritas");
//        ListaProductos.add("Escoba");
//        ListaProductos.add("Trapero");




    }
