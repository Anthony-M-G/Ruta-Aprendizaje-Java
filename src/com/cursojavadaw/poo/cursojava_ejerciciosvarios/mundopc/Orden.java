package com.cursojavadaw.poo.cursojava_ejerciciosvarios.mundopc;

import java.util.ArrayList;

public class Orden {
    private int id=0;
    private ArrayList<Computadora> computadoras=new ArrayList<>();
    private int contOrdenes=0;
    private int contComputadoras=0;

    public Orden() {
        this.contOrdenes++;
        this.id++;
    }
    public void agregarComputadora(Computadora computadora){
        this.computadoras.add(computadora);
        this.contComputadoras++;


    }
    public String getComputadoras(ArrayList<Computadora> comps){
        return computadoras.toString();
    }
    public void mostrarOrden(){
        System.out.println("La orden numero: "+this.contOrdenes+" tiene "+this.computadoras.size()+"Computadoras"+getComputadoras(computadoras));

    }
}
