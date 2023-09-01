package com.example.proyectosgrupo22;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckBox;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class sesion_48_adapter extends RecyclerView.Adapter<sesion_48_adapter> {

    private List<String> ListaElementos;
    private LayoutInflater layoutInflater;
    private Context context;

    public sesion_48_adapter(@NonNull Context context, List<String> listaElementos) {
        super(context);
        ListaElementos = listaElementos;
        this.context = context;
        this.layoutInflater = LayoutInflater.from(context);
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        CheckBox Elemento;

        public ViewHolder(@NonNull View plantilla) {
            super(plantilla);
            Elemento = plantilla.findViewById(R.id.elemento);
        }

        public void cargarProducto(String producto) {
            Elemento.setText(producto);
        }
    }
}
