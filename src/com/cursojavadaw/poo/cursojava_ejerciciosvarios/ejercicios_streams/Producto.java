package com.cursojavadaw.poo.cursojava_ejerciciosvarios.ejercicios_streams;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;


@Getter
@AllArgsConstructor
public class Producto {
    private int cantidad;
    private double precio;


    public static double getImporte(List<Producto> prod){

        return prod.stream()
                .mapToDouble(a-> a.getPrecio()*a.getCantidad())
                .sum();
    }
}
