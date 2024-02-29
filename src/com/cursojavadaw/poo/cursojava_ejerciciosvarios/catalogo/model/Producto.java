package com.cursojavadaw.poo.cursojava_ejerciciosvarios.catalogo.model;

import com.cursojavadaw.poo.cursojava_ejerciciosvarios.catalogo.interfaces.*;

abstract public class Producto implements IProducto {
    private int precio;

    public Producto(int precio) {
        this.precio = precio;
    }


    @Override
    public int getPrecio() {
        return precio;
    }
}
