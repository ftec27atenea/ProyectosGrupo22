package com.example.proyectosgrupo22;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class sesion_48_adapter extends RecyclerView.Adapter<sesion_48_adapter.ViewHolder> {

    private List<String> ListaElementos;
    private LayoutInflater layoutInflater;
    private Context context;

    public sesion_48_adapter( Context context, List<String> listaElementos) {
        this.ListaElementos = listaElementos;
        this.context = context;
        this.layoutInflater=LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View item_Recycler=this.layoutInflater.inflate(R.layout.sesion_48_plantilla,null);
        return new sesion_48_adapter.ViewHolder(item_Recycler);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.CargarProducto(ListaElementos.get(position));
    }

    @Override
    public int getItemCount() {
        return ListaElementos.size();
    }



    public class ViewHolder extends RecyclerView.ViewHolder{
        CheckBox Elemento;

        public ViewHolder(@NonNull View plantilla) {
            super(plantilla);
            Elemento = plantilla.findViewById(R.id.Elemento);
        }

        public void CargarProducto(String producto){
            Elemento.setText(producto);
        }
    }

}
