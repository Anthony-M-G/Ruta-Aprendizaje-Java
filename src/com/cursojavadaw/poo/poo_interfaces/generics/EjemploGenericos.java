package com.cursojavadaw.poo.poo_interfaces.generics;

import com.cursojavadaw.poo.cursojava_ejerciciosvarios.proyectoOrdenDeCompra.Cliente;

import java.util.*;

public class EjemploGenericos {
    public static void main(String[] args) {
        Integer[] inters={2,7,9,1,2,0,5,3};
        List<Integer> listI=fromArrToList(inters);
        List<Cliente> lisCli= new ArrayList<>();
        lisCli.add(new Cliente("Jose","Mena"));
        lisCli.add(new Cliente(" Mario","Bena"));
        lisCli.add(new Cliente("Bea","anas"));



        listI.forEach(System.out::println);
        System.out.println("*"+objetoMayor(listI));






    }

    public static <T> List<T> fromArrToList(T[] t){ //<T> indica que el método es genérico
        return Arrays.asList(t);
    }
    public static <T extends Comparable<T>> T objetoMayor(List<T> t){
       T aux = null;
       for (int i = 0; i <t.size()-1 ; i++) {
           if(t.get(i).compareTo(t.get(i+1))>0){
               aux=t.get(i);
               t.set(i + 1, aux);
               aux=t.get(i+1);
               t.set(i,aux);

           }
       }

       return aux;
    }
}
