package com.cursojavadaw.poo.cursojava_ejerciciosvarios.lambda;


import java.util.function.Function;

public class mainPalabra {
    public static void main(String[] args) {

        Function<String,String> palabra1= (a)-> a.replace(" ","")
                .replace(",","")
                .replace(".","").toUpperCase();
        System.out.println(palabra1.apply("Hola.A.,. todos.. amigos"));

}
}
