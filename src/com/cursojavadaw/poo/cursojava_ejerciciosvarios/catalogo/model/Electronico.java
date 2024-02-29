package com.cursojavadaw.poo.cursojava_ejerciciosvarios.catalogo.model;

import com.cursojavadaw.poo.cursojava_ejerciciosvarios.catalogo.interfaces.IElectronico;
import com.cursojavadaw.poo.cursojava_ejerciciosvarios.catalogo.model.Producto;

abstract public class Electronico extends Producto implements IElectronico {
    private String fabricante;

    public Electronico(int precio,String fabricante) {
        super(precio);
        this.fabricante=fabricante;
    }




    @Override
    public String getFabricante() {
        return fabricante;
    }
}
