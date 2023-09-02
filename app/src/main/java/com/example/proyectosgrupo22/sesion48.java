package com.example.proyectosgrupo22;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.ListAdapter;
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
        ListaProductos.add(new ListElement("#345o6","pan","3000"));
        ListaProductos.add(new ListElement("#23246","Leche","3000"));
        ListaProductos.add(new ListElement("#234786","Huevos","3000"));
        ListaProductos.add(new ListElement("#345o6","Carne","3000"));
        ListaProductos.add(new ListElement("#345o6","Gaseosa","3000"));
        ListaProductos.add(new ListElement("#345o6","Queso","3000"));
        ListaProductos.add(new ListElement("#345o6","Aguacate","3000"));
        ListaProductos.add(new ListElement("#345o6","Tomate","3000"));
        ListaProductos.add(new ListElement("#345o6","Sal","3000"));


        ListAdapter po = new sesion_48_adapter(ListaProductos, this);
        sesion_48_adapter adapter=new sesion_48_adapter(ListaProductos, this);
        RecyclerView recyclerView = findViewById(R.id.repetidor);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(po);
        }
//        ListaProductos.add(new ListElement("#775448", "Leche", "2000");
//        ListaProductos.add(new ListElement("#775448", "Carne", "2000"));
//        ListaProductos.add(new ListElement("#775448", "pan", "2000")"Huevos");
//        ListaProductos.add(new ListElement("#775448", "pan", "2000")"Mantiquilla");
//        ListaProductos.add(new ListElement("#775448", "pan", "2000")"Jabon");
//        ListaProductos.add(new ListElement("#775448", "pan", "2000")"Cebolla");
//        ListaProductos.add(new ListElement("#775448", "pan", "2000")"Tomate");
//        ListaProductos.add(new ListElement("#775448", "pan", "2000")"Manzanas");
//        ListaProductos.add(new ListElement("#775448", "pan", "2000")"Papayas");
//        ListaProductos.add(new ListElement("#775448", "pan", "2000")"Pescado");
////        ListaProductos.add("Sal");
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

//        sesion_48_adapter adapter=new sesion_48_adapter(this.ListaProductos);
//        RecyclerView rv_ListaProductos=findViewById(R.id.rv_ListaProductos);


    }
