package com.cursojavadaw.poo.cursojava_ejerciciosvarios.mundopc;

public class Monitor {
    private int id;
    private String marca;
    private double tamanho;
    private int contMonitores;

    public Monitor(String marca, double tamanho,int id) {
        this.marca = marca;
        this.tamanho = tamanho;
        this.id=id;
        this.contMonitores++;

    }

    public int getContMonitores() {
        return contMonitores;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "id=" + id +
                ", marca='" + marca + '\'' +
                ", tamanho=" + tamanho +
                '}';
    }
}
