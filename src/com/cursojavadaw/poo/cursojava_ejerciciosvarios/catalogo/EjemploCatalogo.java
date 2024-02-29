package com.cursojavadaw.poo.cursojava_ejerciciosvarios.catalogo;

import com.cursojavadaw.poo.cursojava_ejerciciosvarios.catalogo.interfaces.IProducto;
import com.cursojavadaw.poo.cursojava_ejerciciosvarios.catalogo.model.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Objects;

public class EjemploCatalogo {
    public static void main(String[] args) {
        Iphone ios=new Iphone(450000,"Apple","Blanco","15");
        TvLcd tv1=new TvLcd(350000,"Sony",50);
        Libro l1=new Libro(30000,"Juanjo","Mil soles de sombra","ECMASRT");
        Comics c1=new Comics(20000,"Akira toriuyama","dbz keyland saga","toei","juanito");

        ArrayList<IProducto> arr=new ArrayList<>();
        arr.add(ios);
        arr.add(tv1);
        arr.add(l1);
        arr.add(c1);


        arr.forEach(e-> {
            if(e instanceof Electronico){
                System.out.println("Articulo electrónico");
            }else if(e instanceof Libro){
                System.out.println("Libro"+((Libro) e).getAutor());
            }
        });
        System.out.println(c1.metDef());

    }
}
