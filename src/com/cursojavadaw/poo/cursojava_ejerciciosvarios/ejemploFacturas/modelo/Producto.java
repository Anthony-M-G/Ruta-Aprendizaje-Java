package com.cursojavadaw.poo.cursojava_ejerciciosvarios.ejemploFacturas.modelo;

public class Producto {
    private static int contadorDeInst=1;
    private int codigo;
    private String nombre;
    private  Double precio;
    public Producto(String nombre, Double precio) {
        this.codigo=contadorDeInst++;
        this.nombre = nombre;
        this.precio = precio;
    }
    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }



}
