package com.cursojavadaw.poo.api_collection;

import java.util.*;

public class EjemploHashSetBuscarDuplicado {
    public static void main(String[] args) {
        String[] peces={"Corvina","Lenguado", "Pejerrey","Robalo","Lenguado" };
        Set<String> unicosPeces = new HashSet<>(Arrays.asList(peces));
        List<String> uniPez=new LinkedList<>(Arrays.asList(peces));




        System.out.println(Arrays.toString(peces));
        System.out.println(unicosPeces);
    }
}
