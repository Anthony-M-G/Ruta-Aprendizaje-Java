package com.cursojavadaw.poo.cursojava_ejerciciosvarios.proyectoOrdenDeCompra;

public class Cliente {
    private String nombre;
    private String apellido;

    public Cliente(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }


    @Override
    public String toString() {
        return nombre +" "+apellido ;
    }
}
