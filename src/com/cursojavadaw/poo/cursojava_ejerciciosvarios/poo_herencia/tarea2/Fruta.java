package com.cursojavadaw.poo.cursojava_ejerciciosvarios.poo_herencia.tarea2;

public class Fruta extends Producto{
    private double peso;
    private String color;
    public Fruta(String nombre, double precio,double peso,String color) {
        super(nombre, precio);
        this.peso=peso;
        this.color=color;

    }

    @Override
    public String toString() {
        return super.toString()+" peso "+this.peso+" color "+this.color;
    }
}
