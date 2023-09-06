package com.example.proyectosgrupo22;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adaptador extends RecyclerView.Adapter<Adaptador.MiViewHolder> {

 private List<String> listadecompras;
 private LayoutInflater layoutInflater;
 private Context context;

    public Adaptador(List<String> listadecompras, Context context) {
        this.listadecompras = listadecompras;
        this.context = context;
        this.layoutInflater=LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public MiViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View plantilla=this.layoutInflater.inflate(R.layout.plantilla,null);
        return new Adaptador.MiViewHolder(plantilla);
    }

    @Override
    public void onBindViewHolder(@NonNull MiViewHolder holder, int position) {
        holder.Cargarproducto(listadecompras.get(position));

    }

    @Override
    public int getItemCount() {
        return listadecompras.size();
    }

    public class MiViewHolder extends RecyclerView.ViewHolder{
    CheckBox Producto;

    public MiViewHolder(@NonNull View plantilla ) {
      super(plantilla);
      Producto = plantilla.findViewById(R.id.Producto);

    }

    public void Cargarproducto(String nombredelproducto){
      Producto.setText(nombredelproducto);
    }

  }


}
