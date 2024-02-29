package com.cursojavadaw.poo.cursojava_ejerciciosvarios.catalogo.model;

import com.cursojavadaw.poo.cursojava_ejerciciosvarios.catalogo.interfaces.IProducto;
import com.cursojavadaw.poo.cursojava_ejerciciosvarios.catalogo.model.Electronico;

public class Iphone extends Electronico implements IProducto {
    private String color;
    private String  modelo;

    public Iphone(int precio, String fabricante, String color, String modelo) {
        super(precio, fabricante);
        this.color = color;
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }



    @Override
    public double getPrecioVenta() {
        return this.getPrecio()*1.05;
    }
}
