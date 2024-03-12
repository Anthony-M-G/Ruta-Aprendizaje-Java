package com.cursojavadaw.poo.cursojava_ejerciciosvarios.lambda;

import java.util.function.Function;

public class PalabraEntrada {

    public String palabraRetornadaSinCaracteres(String palabra){
        Function<String,String> palabra1= (a)-> a.replace(" ","")
                .replace(",","")
                .replace(".","").toUpperCase();
        return palabra1.apply(palabra);
    }
}
