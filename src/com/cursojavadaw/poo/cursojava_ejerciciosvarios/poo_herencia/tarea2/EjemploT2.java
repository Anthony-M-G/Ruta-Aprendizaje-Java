package com.cursojavadaw.poo.cursojava_ejerciciosvarios.poo_herencia.tarea2;

public class EjemploT2 {
    public static void main(String[] args) {
        Fruta f=new Fruta("Manzana",530,400,"Roja");
        Limpieza L=new Limpieza("Suavitel",750,"Jabón",0.750);
        Lacteo lac=new Lacteo("Natilla",450,2,3);
        Producto[] prods={f,L,lac};
        for(Producto p:prods) System.out.println(p);

    }
}
