package com.cursojavadaw.poo.cursojava_ejerciciosvarios.catalogo.model;

import java.util.Calendar;
import java.util.Date;

public class Comics extends Libro {
    private String personaje;

    public Comics(int precio, String autor, String titulo, String editorial, String personaje) {
        super(precio, autor, titulo, editorial);
        this.personaje = personaje;
    }

    public String getPersonaje() {
        return personaje;
    }

    public void setPersonaje(String personaje) {
        this.personaje = personaje;
    }

    @Override
    public double getPrecioVenta() {
        return super.getPrecioVenta()+2.3;
    }
}
