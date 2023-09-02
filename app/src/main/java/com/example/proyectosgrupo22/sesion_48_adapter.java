package com.example.proyectosgrupo22;

import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
//import android.view.View;
//import android.widget.CheckBox;
//
//import androidx.annotation.NonNull;
//import androidx.recyclerview.widget.RecyclerView;
import java.util.List;


public class sesion_48_adapter extends RecyclerView.Adapter<sesion_48_adapter.ViewHolder> {
    private List<ListElement> ListaElementos;
    private LayoutInflater layoutInflater;
    private Context context;



    public sesion_48_adapter( List<ListElement> listaElementos, Context context) {

    this.ListaElementos = listaElementos;
    this.layoutInflater = LayoutInflater.from(context);
    this.context = context;
    }

    @Override
    public int getItemCount (){return ListaElementos.size();}

    @Override
    public sesion_48_adapter.ViewHolder onCreateViewHolder (ViewGroup parent, int viewType){
        View view = layoutInflater.inflate(R.layout.sesion_48_plantilla, null);
        return  new sesion_48_adapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder( final sesion_48_adapter.ViewHolder holder, final int position){
        holder.bindData(ListaElementos.get(position));
    }


    public void  setItems(List<ListElement> items) {ListaElementos = items;}

    public class ViewHolder extends RecyclerView.ViewHolder {
        CheckBox elemento;
        ImageView iconImage;
        TextView producto, precio;
        ViewHolder(View plantilla){
            super(plantilla);
            elemento = itemView.findViewById(R.id.elemento);
            iconImage = itemView.findViewById(R.id.iconImage);
            producto = itemView.findViewById(R.id.producto);
            precio = itemView.findViewById(R.id.precio);

        }

        void bindData(final ListElement item){
            iconImage.setColorFilter(Color.parseColor(item.getColor()), PorterDuff.Mode.ADD.SRC_IN);
            producto.setText(item.getProducto());
            precio.setText(item.getPrecio());

        }

    }
}

//
//
//    public class ViewHolder extends RecyclerView.ViewHolder {
//        CheckBox Elemento;
//        I
//        public ViewHolder(@NonNull View plantilla) {
//            super(plantilla);
//            Elemento = plantilla.findViewById(R.id.elemento);
//        }
//
//        public void cargarProducto(String producto) {
//            Elemento.setText(producto);
//        }
//    }
//}
