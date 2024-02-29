package com.cursojavadaw.poo.cursojava_ejerciciosvarios.ejercicios_logica;

public class Usuario {
    protected String simbolo;
    protected int pos_x;
    protected int pos_y;

    public void posicion(int pos_x, int pos_y) {
        this.pos_x = pos_x;
        this.pos_y = pos_y;
    }
    public void simbolo(String simbolo){
        this.simbolo=simbolo;
    }

}
