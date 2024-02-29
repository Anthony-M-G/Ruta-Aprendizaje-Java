package com.cursojavadaw.poo.cursojava_ejerciciosvarios.mundopc;

public class Teclado extends DispositivoEntrada{
    private int id;
    private int contadorTeclados=0;

    public Teclado(String tipo, String marca, int id) {
        super(tipo, marca);
        this.id=id;
        this.contadorTeclados++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getContadorTeclados() {
        return contadorTeclados;
    }

    public void setContadorTeclados(int contadorTeclados) {
        this.contadorTeclados = contadorTeclados;
    }

    @Override
    public String toString() {
        return "Teclado{" +
                "tipo='" + tipo + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }
}
