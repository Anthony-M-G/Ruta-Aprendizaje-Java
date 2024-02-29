package com.cursojavadaw.poo.cursojava_ejerciciosvarios.EV1;

public class BinarySearch {

    int[] array={1,4,7,10,15,32,48,60};


    boolean buscarNumero(int[] array, int buscado, int limInf, int limSup) {
        if (limInf > limSup)
            return false;
        int mitad=(limSup+limInf)/2;
        if(array[mitad]<buscado){
            return buscarNumero(array,buscado,mitad+1,limSup);
        } else if (array[mitad]>buscado) {
            return buscarNumero(array,buscado,limInf,mitad-1);

        }

        return true;

    }

    public static void main(String[] args) {
        BinarySearch bb=new BinarySearch();
        System.out.println(bb.buscarNumero(bb.array,15,0,bb.array.length-1));

    }

}
