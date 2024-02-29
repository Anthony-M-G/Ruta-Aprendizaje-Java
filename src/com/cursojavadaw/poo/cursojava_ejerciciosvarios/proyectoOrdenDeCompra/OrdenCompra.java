package com.cursojavadaw.poo.cursojava_ejerciciosvarios.proyectoOrdenDeCompra;

import java.time.LocalDate;
import java.util.ArrayList;

public class OrdenCompra{
    private static Integer identificador =0;
    private String descripcion;
    private static LocalDate fecha=LocalDate.now();
    Cliente cliente;
    private ArrayList<Producto> productos= new ArrayList<>();
    private static int contadorProds=0;

    public OrdenCompra(String descripcion,Cliente cliente1) {
        this.cliente=cliente1;
        this.descripcion = descripcion;
        identificador++;
    }
    public void addProducto(Producto producto){

        if(productos.size()<5){

            productos.add(producto);
            contadorProds++;

            System.out.println("A añadido el producto:"+producto);

        }
        else System.out.println("Maxima cantidad de artículos alcanzada");



    }
    public void verOrden() {
        double total = 0;
        productos.sort(Producto::compareTo); //Ordena el arraylist en base a las codiciones del metodo compareTo implementado en la clase Producto
        for(Producto producto: this.productos) {
            total += producto.getPrecio();
        }
        System.out.println("Orden del cliente: "+this.cliente +" id "+ OrdenCompra.identificador +" "+ productos+" total: "+total+" fecha: "+   OrdenCompra.fecha);
    }


}
