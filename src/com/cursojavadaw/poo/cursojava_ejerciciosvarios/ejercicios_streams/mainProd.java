package com.cursojavadaw.poo.cursojava_ejerciciosvarios.ejercicios_streams;

import java.util.ArrayList;
import java.util.List;

public class mainProd {
    public static void main(String[] args) {
        Producto producto1 = new Producto(2, 10.5);
        Producto producto2 = new Producto(3, 5.75);
        Producto producto3 = new Producto(1, 8.0);

        // Agregar productos a la lista
        List<Producto> productos = new ArrayList<>();
        productos.add(producto1);
        productos.add(producto2);
        productos.add(producto3);

        // Calcular el importe total
        double importeTotal =  Producto.getImporte(productos);

        // Imprimir el importe total
        System.out.println("Importe total de los productos: $" + importeTotal);
    }
}
