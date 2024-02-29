package com.cursojavadaw.poo.cursojava_ejerciciosvarios.poo_herencia.tarea2;

public class Limpieza extends Producto{
    private String componentes;
    private double litros;

    public Limpieza(String nombre, double precio,String componentes,double litros) {
        super(nombre, precio);
        this.componentes=componentes;
        this.litros=litros;
    }

    @Override
    public String toString() {
        return super.toString()+" componentes : "+this.componentes+" litros: "+this.litros;
    }
}
