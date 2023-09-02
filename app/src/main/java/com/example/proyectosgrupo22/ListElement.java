package com.example.proyectosgrupo22;

public class ListElement {
    public String color;
    public String producto;
    public String precio;

    public ListElement(String color, String producto, String precio) {
        this.color = color;
        this.producto = producto;
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }
}
