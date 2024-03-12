package com.cursojavadaw.poo.java8_lambda.aritmetica;

public class Calculadora {
    public double computar(double a, double b, Aritmetica lambda){
        return lambda.operacion(a,b);

    }
}
