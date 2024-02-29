package com.cursojavadaw.poo.cursojava_ejerciciosvarios.bolsa_supermercado;

import java.util.ArrayList;
import java.util.List;

public class BolsaSuperMercado<T>{


    private List<T> bolsa;

    public BolsaSuperMercado() {
        this.bolsa = new ArrayList<T>();
    }

    void addProducto(T t){
        this.bolsa.add(t);

    };
    List<T> getProductos(){
        return this.bolsa;


    };
}
