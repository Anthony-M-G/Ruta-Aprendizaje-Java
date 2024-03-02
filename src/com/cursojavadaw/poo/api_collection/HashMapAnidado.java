package com.cursojavadaw.poo.api_collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapAnidado {
    public static void main(String[] args) {
        List<String> info=new ArrayList<>(List.of("Guanacaste","Nicoya","Pochote","Ingeniero de Software"));
        Map<Alumno, List> alumno=new HashMap<>( );
        Alumno antony=new Alumno("Antony",67.77);
        alumno.put(antony, info);
        alumno.put(new Alumno("Jua",89.77),null);
        alumno.put(new Alumno("Maria",90.77),null);
        alumno.put(new Alumno("Bea",80.0),null);



        alumno.forEach((a,b)-> {

                System.out.println(a.getNombre()+" info: "+b);


        });
    }
}
