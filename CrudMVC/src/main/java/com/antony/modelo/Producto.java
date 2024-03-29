package com.antony.modelo;

public class Producto {
    private int codigo;
    private String nombre;
    private String tipo;
    private int cantidad;

    private static Producto instancia;

    public Producto(int codigo, String nombre, String tipo, int cantidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.tipo = tipo;
        this.cantidad = cantidad;
    }

    public static Producto instanciarProducto(int codigo, String nombre, String tipo, int cantidad) {
        if (instancia == null) {
            instancia = new Producto(codigo, nombre, tipo, cantidad);
        }
        return instancia;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
