package com.cursojavadaw.poo.cursojava_ejerciciosvarios.ejercicios_logica;

import java.util.Objects;

public class Gato {

    Usuario usuario;
    String[][] matriz=new String[3][3];

    String[][] InsertarPosicionUsuario(Usuario usuario){

        int i= usuario.pos_x;
        int j= usuario.pos_y;
        if (i >= 0 && i < matriz.length && j >= 0 && j < matriz[0].length) {
            this.matriz[i][j] = usuario.simbolo;

        } else {
            System.out.println("Posición fuera de rango.");

        }
        for(int a=0;a<matriz.length;a++){
            for(int b=0;b<matriz[0].length;b++){
                if (!Objects.equals(this.matriz[a][b],usuario.simbolo)) {
                    this.matriz[a][b] = " ";

                }
            }
        }
        return this.matriz;
    }

    void verificarGanador(Usuario usuario){

        if(Objects.equals(this.matriz[0][0],usuario.simbolo)
                    && Objects.equals(this.matriz[1][1],usuario.simbolo)
                    && Objects.equals(this.matriz[2][2],usuario.simbolo)){
                System.out.println("Ganaron las: "+usuario.simbolo);
            }else {
        System.out.println("O");}
    }


}
