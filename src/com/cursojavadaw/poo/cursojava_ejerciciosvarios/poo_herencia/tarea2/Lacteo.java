package com.cursojavadaw.poo.cursojava_ejerciciosvarios.poo_herencia.tarea2;

public class Lacteo extends Producto{
    private int cantidad;
    private int proteinas;

    public Lacteo(String nombre, double precio,int cantidad,int proteinas) {
        super(nombre, precio);
        this.cantidad=cantidad;
        this.proteinas=proteinas;
    }

    @Override
    public String toString() {
        return super.toString()+ "proteínas "+this.proteinas+" cantidad "+this.cantidad;
    }
}
