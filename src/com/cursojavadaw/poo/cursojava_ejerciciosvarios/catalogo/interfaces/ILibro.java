package com.cursojavadaw.poo.cursojava_ejerciciosvarios.catalogo.interfaces;

import java.util.Calendar;
import java.util.Date;

public interface ILibro {
    public Date getFechaPublicacion();
    public String getAutor();

    default String  metDef(){
       return "Aprendiendo sobre el default";
    }
    public String getTitulo();
    public String getEditorial();

}
