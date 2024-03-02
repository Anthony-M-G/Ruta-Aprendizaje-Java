package com.cursojavadaw.poo.cursojava_ejerciciosvarios.ejemplo_vuelos;

import java.util.*;

public class ListadoVuelos{
    private Map<String, Vuelo> llegadasVuelos;

    public ListadoVuelos() {
        this.llegadasVuelos=new HashMap<>();
    }

    public void addVuelo(String codigo, Vuelo vuelos){
        this.llegadasVuelos.put(codigo, vuelos);



    }
    public void getLista(){
       if(!this.llegadasVuelos.isEmpty()){
           this.llegadasVuelos.forEach((a,b)->{
               System.out.println("Codigo \n"+a+ "\t"+b);
               System.out.println();

           });
       }else System.out.println("Lista vacia");;
    }
    public String vueloReciente() {
        // Verificar si hay algún vuelo en el listado
        if (this.llegadasVuelos.isEmpty()) {
            return "No hay vuelos registrados.";
        }

        // Encontrar el vuelo más reciente
        Vuelo vueloMasReciente = Collections.max(this.llegadasVuelos.values());

        // Devolver la información del vuelo más reciente
        return "El vuelo más reciente es: " + vueloMasReciente.toString();
    }

    public Map<String, Vuelo> getLlegadasVuelos() {
        return llegadasVuelos;
    }
}
