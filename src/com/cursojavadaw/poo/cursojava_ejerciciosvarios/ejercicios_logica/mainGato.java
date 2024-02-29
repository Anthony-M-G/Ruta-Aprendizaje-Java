package com.cursojavadaw.poo.cursojava_ejerciciosvarios.ejercicios_logica;

import java.util.Arrays;
import java.util.Scanner;

public class mainGato {
    public static void main(String[] args) {
        Gato ma=new Gato();
        Usuario usuario=new Usuario();
        usuario.simbolo("X");
        for(int a=0;a<3;a++){
            Scanner ingresoPos=new Scanner(System.in);
            System.out.println("Ingrese su posicion");
            int i=ingresoPos.nextInt();
            int j=ingresoPos.nextInt();
            usuario.posicion(i,j);


            String[][] gato=ma.InsertarPosicionUsuario(usuario);
            for(String[] num : gato){
                System.out.println(Arrays.toString(num) +"\t");
            }

        }
        ma.verificarGanador(usuario);


    }

}
