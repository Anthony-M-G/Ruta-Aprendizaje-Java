package com.cursojavadaw.poo.java8_lambda.aritmetica;

public class mainPrueba {


    public static void main(String[] args) {
        Aritmetica suma= Double::sum;
        Aritmetica resta=(a,b)-> a-b;

        Calculadora calc=new Calculadora();
        System.out.println(calc.computar(12,2,suma));
        System.out.println(calc.computar(2,3,resta));



    }
}
