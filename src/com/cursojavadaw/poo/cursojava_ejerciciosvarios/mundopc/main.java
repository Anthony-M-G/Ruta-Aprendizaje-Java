package com.cursojavadaw.poo.cursojava_ejerciciosvarios.mundopc;

public class main {
    public static void main(String[] args) {
        Mouse mouse1=new Mouse("Sencillo","Hp",1);
        Teclado t1=new Teclado("Normal","Hp",1);
        Monitor m1=new Monitor("Hp",12.3,1);
        Computadora c1=new Computadora(m1,mouse1,t1,"Victuz");
        Orden n1=new Orden();
        n1.agregarComputadora(c1);
        n1.mostrarOrden();
    }
}
