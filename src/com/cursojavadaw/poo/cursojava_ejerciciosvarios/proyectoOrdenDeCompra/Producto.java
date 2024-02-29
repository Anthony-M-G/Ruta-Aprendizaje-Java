package com.cursojavadaw.poo.cursojava_ejerciciosvarios.proyectoOrdenDeCompra;

public class Producto implements Comparable<Producto>{
    private String fabricante;
    private String nombre;
    private Double precio;



    public Producto(String fabricante, String nombre, double precio) {
        this.fabricante = fabricante;
        this.nombre = nombre;
        this.precio = precio;
    }



    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto[" +
                "fabricante='" + fabricante + '\'' +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ']';
    }


    @Override
    public int compareTo(Producto o) {
        return this.fabricante.compareTo(o.fabricante);
    }
}
