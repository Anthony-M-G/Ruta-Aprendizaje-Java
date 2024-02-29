package com.cursojavadaw.poo.poo_interfaces.genericsclass;

public class EjemploGenericsCamion {
    public static void main(String[] args) {
        Camion<Animal> transporteCaballos=new Camion<>(5);
        transporteCaballos.add(new Animal("Haz","Caballo español"));
        transporteCaballos.add(new Animal("Juanco","Caballo Cuarto de Milla"));
        transporteCaballos.add(new Animal("Tunquen","Cabllo Arabe"));
        for(Animal a : transporteCaballos){
            System.out.println(a.getNombre() + " tipo: "+a.getTipo());
        }

    }
}
