package com.cursojavadaw.poo.cursojava_ejerciciosvarios.ejemploFacturas.modelo;

public class Cliente {
    private String nombre;
    private String nif;

    public Cliente(String nombre, String nif) {
        this.nombre = nombre;
        this.nif = nif;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", nif='" + nif + '\'' +
                '}';
    }
}
