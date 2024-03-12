package com.cursojavadaw.poo.java8_lambda;

import java.util.function.Function;

public class EjemploFunctions {
    public static void main(String[] args) {
        Function<String,String> f1= param-> "Hola que tal"+param;
        String resultado=f1.apply(" Juan");
        System.out.println(resultado);

        Function<String,String> f2= String::toUpperCase; // Recibe algo como parámetro y lo retorna
        System.out.println(f2.apply("antony"));
    }
}
