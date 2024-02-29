package com.cursojavadaw.poo.cursojava_ejerciciosvarios.ejercicios_logica;

import java.util.Arrays;

public class Figura {


    public static int[][] fig(int n) {

        int[][] figura = new int[5][5]; // Matriz 5x5
        for(int i=0;i<figura.length;i++){
            figura[i][0]=n;//Ingresa el valor n en todas las posiciones i=1,i=2,...., pero j=0
            figura[i][4]=n;//Ingresa el valor n en todas las posiciones i=1,i=2,...., pero j=4
            for(int j=1;j<4;j++){ // entre las posiciones [1,3] ingresa el valor n-1
                figura[i][j]=n-1; //
            }
            figura[i][2]=figura[i][0]-2; // Reescribe el valor en la posicion 2(el del centro) para que sea n-2
        }
        return figura;
    }
    public static int sumar(int... args){ //Implementación de varargs
        int total=0;
        for(int i : args) total+=i;
        return total;}
    public static void main (String[]args){
        int[][] result = fig(9);
        for (int[] n : result) {
            System.out.println(Arrays.toString(n) + "\t");

        }
        System.out.println(Figura.sumar(1,2,3,4,5,6,7,7,8));
    }





    }