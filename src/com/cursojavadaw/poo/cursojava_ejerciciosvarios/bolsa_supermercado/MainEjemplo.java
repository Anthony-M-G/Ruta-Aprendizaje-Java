package com.cursojavadaw.poo.cursojava_ejerciciosvarios.bolsa_supermercado;

import java.util.List;

public class MainEjemplo {
    public static void main(String[] args) {
        BolsaSuperMercado<Producto> bolsa=new BolsaSuperMercado<>();

        Producto manzana=new Fruta("Manzana",560.0,30.0,"Roja");
        Producto leche=new Lacteo("Leche coronado entera",1150.0,2,30);
        Producto limpieza=new Limpieza("Axion",640.0,"Cloro, Aromatizante",2.0);

        bolsa.addProducto(manzana);
        bolsa.addProducto(leche);
        bolsa.addProducto(limpieza);

        List<Producto> lista=bolsa.getProductos();
        lista.forEach(e->{
            if(e instanceof Fruta){
                System.out.println(e.getNombre()+" "+((Fruta) e).getPeso()+" ");
            }
        });
    }
}
