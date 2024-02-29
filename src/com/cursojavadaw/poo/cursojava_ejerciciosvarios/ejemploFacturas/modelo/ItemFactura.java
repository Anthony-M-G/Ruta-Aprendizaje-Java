package com.cursojavadaw.poo.cursojava_ejerciciosvarios.ejemploFacturas.modelo;

public class ItemFactura implements Comparable<ItemFactura>{
    private Producto producto;
    private Integer cantidad;
    int prueba;
    public ItemFactura() {
    }

    public ItemFactura(Producto producto, Integer cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public ItemFactura(Producto producto, Integer cantidad, int prueba) { // Sobrecargando un constructor
        this(producto, cantidad);
        this.prueba = prueba;
    }

    public Producto getProducto() {
        return producto;
    }

    public Integer getCantidad() {
        return cantidad;
    }


    @Override
    public int compareTo(ItemFactura o) { // Se implementa el compareTo en ItemFactura dado que voya comparar los prodos de la clase por su precio, y lo que procederé a ordenar es una arraylist de ItemsFacturas
        return this.producto.getPrecio().compareTo(o.producto.getPrecio());
    }
}
