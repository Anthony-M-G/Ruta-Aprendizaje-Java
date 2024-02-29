package com.cursojavadaw.poo.cursojava_ejerciciosvarios.ejercicios_logica;


import java.util.Arrays;

public class Encriptador {

    static  int[] ordenarArray(int[] array){
        for(int i=0;i< array.length;i++){
            int aux;
            for(int j=0;j<array.length-i-1;j++){
                if(array[j+1]<array[j]) {
                    aux=array[j];
                    array[j]=array[j+1];
                    array[j+1]=aux;
                    System.out.println(Arrays.toString(array));

                }
            }

        }
        return array;
    }

    public static String Encriptado(String palabra){
        StringBuilder result= new StringBuilder(); // Genera una cadena de caracteres mutable
        String[] separarador=palabra.split("");//Separa la palabra de entrada en cada caracter y y lo ubica en una lista

        for (String s : separarador) { //Metodo foreach en java
            switch (s) {
                case "a" -> result.append("4");
                case "i" -> result.append("1");
                case "o" -> result.append("0");
                case " " -> result.append("_");
                case null, default -> result.append(s);
            }

        }



    return result.toString();
    }



    public static void main(String[] args) {
        String palabrax=Encriptado("Hola a todos y todas");
        System.out.println(palabrax);

        System.out.println(Arrays.toString(ordenarArray(new int[]{1, 9, 7, 89, 94, 56})));





    }

}

