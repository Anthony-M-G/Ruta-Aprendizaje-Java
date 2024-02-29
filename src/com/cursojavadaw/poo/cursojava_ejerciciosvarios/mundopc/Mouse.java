package com.cursojavadaw.poo.cursojava_ejerciciosvarios.mundopc;

public class Mouse extends DispositivoEntrada{
    int id;
    private static int contadorRatones=0;

    public Mouse(String tipo, String marca, int id) {
        super(tipo, marca);
        this.id=id;
        contadorRatones++;
    }

    public int getContadorRatones() {
        return contadorRatones;
    }



    @Override
    public String toString() {
        return "Mouse{" +
                "tipo='" + tipo + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }
}
