package com.cursojavadaw.poo.api_collection;


import lombok.*;

import java.util.*;
import java.util.stream.Stream;

@AllArgsConstructor
@Data

public class Alumno implements Comparable<Alumno>{
    private String nombre;
    private Double nota;

    public static void main(String[] args) {
        LinkedList<Alumno> sa=new LinkedList<>(); //Comparator.comparing(Alumno::getNota) funcional
        sa.add(new Alumno("Antony",67.77));
        sa.add(new Alumno("Jua",89.77));
        sa.add(new Alumno("Maria",90.77));
        sa.add(new Alumno("Bea",80.0));
        //sa.sort(Comparator.comparing(Alumno::getNota)); comparar y ordenar usando el método sort y programación funcional
        //Collections.sort(sa); // comparar y odernar usando la clase Collections implementando la interface Comparable

       sa.addFirst(new Alumno("naza",98.0));
       sa.addLast(new Alumno("paolo",86.0));

       sa.sort((a,b)-> a.getNombre().compareTo(b.getNombre()));
       var a=sa.removeLast();
       System.out.println(sa);







    }


   @Override
    public int compareTo(Alumno o) {
        return this.getNota().compareTo(o.getNota());
    }
}
