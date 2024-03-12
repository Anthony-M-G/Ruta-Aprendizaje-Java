package com.cursojavadaw.poo.api_collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

public class EjemploHashMap {
    public static void main(String[] args) {

        Map<Alumno,Integer> alumno=new HashMap<>( );
        alumno.put(new Alumno("Antony",67.77),3456);
        alumno.put(new Alumno("Jua",89.77),6702);
        alumno.put(new Alumno("Maria",90.77),2971);
        alumno.put(new Alumno("Bea",80.0),9862);

       // alumno.forEach((a,b)-> System.out.println(a.getNota() + " id "+b)); //itero en el diccionario sobre cada llave valor con foeach
        System.out.println(alumno);
        System.out.println();
        Iterator<Alumno> iterator= alumno.keySet().iterator();
        iterator.forEachRemaining(e-> {
            if (Objects.equals(e.getNombre(), "Jua")){
                iterator.remove();
            }
        });
        alumno.forEach((a,b)-> System.out.println(a+"="+b));





        /*Alumno alumnoEliminar=null;
        for(Map.Entry<Alumno,Integer> par: alumno.entrySet()){
          if(Objects.equals(par.getKey().getNombre(), "Jua")){
              alumnoEliminar=par.getKey();
              break;
          }
        }
        alumno.remove(alumnoEliminar);
        System.out.println(alumno);*/



    }
}
