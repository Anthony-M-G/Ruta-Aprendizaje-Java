package com.cursojavadaw.poo.api_collection;

import java.util.*;

public class EjemploHashSet {

    public static void main(String[] args) {
        Set<String> hs=new HashSet<>();
        hs.add("uno");
        hs.add("dos");
        hs.add("tres");
        hs.add("cuatro");
        hs.add("cinco");



        System.out.println(hs);// Si intento agregar un elemento que ya esté el método add me retorna false
    }
}
