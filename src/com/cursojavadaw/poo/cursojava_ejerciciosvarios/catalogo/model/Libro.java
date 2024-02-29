package com.cursojavadaw.poo.cursojava_ejerciciosvarios.catalogo.model;

import com.cursojavadaw.poo.cursojava_ejerciciosvarios.catalogo.interfaces.ILibro;

import java.util.Date;

public class Libro extends Producto implements ILibro {
    private Date fechaPublicacion=new Date();
    private String autor;
    private String titulo;
    private String editorial;

    public Libro(int precio,String autor, String titulo, String editorial) {
        super(precio);
        this.autor = autor;
        this.titulo = titulo;
        this.editorial = editorial;
    }

    public void setFechaPublicacion(Date fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public Libro(int precio) {
        super(precio);
    }

    @Override
    public Date getFechaPublicacion() {
        return this.fechaPublicacion;
    }

    @Override
    public String getAutor() {
        return this.autor;
    }

    @Override
    public String getTitulo() {
        return this.titulo;
    }

    @Override
    public String getEditorial() {
        return this.editorial;
    }

    @Override
    public double getPrecioVenta() {
        return getPrecio()*1.25;
    }

    @Override
    public String metDef() {
        return ILibro.super.metDef() +"polimorfeando en la clase Libro que implementa Ilibro";
    }
}
