package com.cursojavadaw.poo.cursojava_ejerciciosvarios.catalogo.model;

import com.cursojavadaw.poo.cursojava_ejerciciosvarios.catalogo.model.Electronico;

public class TvLcd extends Electronico {
    private int pulgadas;

    public TvLcd(int precio, String fabricante,int pulgadas) {
        super(precio, fabricante);
        this.pulgadas=pulgadas;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    @Override
    public double getPrecioVenta() {
        return this.getPrecio()*0.25*pulgadas;
    }
}
