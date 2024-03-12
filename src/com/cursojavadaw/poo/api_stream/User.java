package com.cursojavadaw.poo.api_stream;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

import javax.management.ConstructorParameters;

@Getter


public class User {
    private String nombre;
    private String apellido;
    private Integer id;
    private static int ultimoId=0;

    public User(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id=++ultimoId;
    }

    @Override
    public String toString() {
        return  nombre+" "+apellido ;
    }
}
