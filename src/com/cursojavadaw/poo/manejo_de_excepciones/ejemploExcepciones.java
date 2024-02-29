package com.cursojavadaw.poo.manejo_de_excepciones;

public class ejemploExcepciones {
    public static void main(String[] args) {

        try{
            int division=10/0;
            System.out.println(division);} catch (ArithmeticException e) {
            System.out.println("Capturamos la excepción en tiempo de ejecución"+e.getMessage());
        }finally {//Esta cláusula es para que pase lo que pase, se ejecute algo
            System.out.println("Seguimos con la aplicación");
        }

    }
}
