package com.cursojavadaw.poo.cursojava_ejerciciosvarios.ejemplo_vuelos;

import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;


public class mainVuelos {
    public static void main(String[] args) {
        ListadoVuelos list = new ListadoVuelos();

        Vuelo v1 = new Vuelo("New York", "Santiago", 45, LocalDateTime.of(2024, 3, 1, 17, 45));
        list.addVuelo("AAAL933", v1);

        Vuelo vn = new Vuelo("New York", "Santiago", 45, LocalDateTime.of(2024, 3, 1, 17, 45));
        list.addVuelo("AAAL930", vn);

        Vuelo v2 = new Vuelo("Sao Paulo", "Santiago", 47, LocalDateTime.of(2021, 8, 31, 4, 45));
        list.addVuelo("LAT755", v2);

        Vuelo v3 = new Vuelo("Rio De Janeiro", "Santiago", 52, LocalDateTime.of(2021, 8, 30, 16, 0));
        list.addVuelo("SKU621", v3);

        Vuelo v4 = new Vuelo("Atlanta", "Santiago", 59, LocalDateTime.of(2021, 8, 29, 13, 22));
        list.addVuelo("DAL147", v4);

        Vuelo v5 = new Vuelo("Bogota", "Santiago", 25, LocalDateTime.of(2021, 8, 31, 14, 5));
        list.addVuelo("AVA241", v5);

        Vuelo v6 = new Vuelo("Mexico City", "Santiago", 29, LocalDateTime.of(2021, 8, 31, 5, 20));
        list.addVuelo("AMX10", v6);

        Vuelo v7 = new Vuelo("Londres", "Santiago", 55, LocalDateTime.of(2021, 8, 30, 8, 45));
        list.addVuelo("IBE6833", v7);

        Vuelo v8 = new Vuelo("Frankfurt", "Santiago", 51, LocalDateTime.of(2021, 8, 29, 7, 41));
        list.addVuelo("LAT2479", v8);

        Vuelo v9 = new Vuelo("Lima", "Santiago", 48, LocalDateTime.of(2021, 8, 30, 10, 35));
        list.addVuelo("SKU803", v9);

        Vuelo v10 = new Vuelo("Los Ángeles", "Santiago", 59, LocalDateTime.of(2021, 8, 29, 9, 14));
        list.addVuelo("LAT533", v10);

        Vuelo v11 = new Vuelo("Guayaquil", "Santiago", 31, LocalDateTime.of(2021, 8, 31, 8, 33));
        list.addVuelo("LAT1447", v11);

        Vuelo v12 = new Vuelo("Panama City", "Santiago", 29, LocalDateTime.of(2021, 8, 31, 15, 15));
        list.addVuelo("CMP111", v12);

        Vuelo v13 = new Vuelo("Madrid", "Santiago", 47, LocalDateTime.of(2021, 8, 30, 8, 14));
        list.addVuelo("LAT705", v13);

        Vuelo v14 = new Vuelo("Miami", "Santiago", 60, LocalDateTime.of(2021, 8, 29, 22, 53));
        list.addVuelo("AAL957", v14);

        Vuelo v15 = new Vuelo("Buenos Aires", "Santiago", 32, LocalDateTime.of(2021, 8, 31, 9, 57));
        list.addVuelo("ARG5091", v15);

        Vuelo v16 = new Vuelo("Cancún", "Santiago", 35, LocalDateTime.of(2021, 8, 31, 4, 0));
        list.addVuelo("LAT1283", v16);

        Vuelo v17 = new Vuelo("Barcelona", "Santiago", 61, LocalDateTime.of(2021, 8, 29, 7, 45));
        list.addVuelo("LAT579", v17);

        Vuelo v18 = new Vuelo("Dallas-Fort Worth", "Santiago", 58, LocalDateTime.of(2021, 8, 30, 7, 12));
        list.addVuelo("AAL945", v18);

        Vuelo v19 = new Vuelo("París", "Santiago", 49, LocalDateTime.of(2021, 8, 29, 18, 29));
        list.addVuelo("LAT501", v19);

        Vuelo v20 = new Vuelo("Montevideo", "Santiago", 39, LocalDateTime.of(2021, 8, 30, 15, 45));
        list.addVuelo("LAT405", v20);


        //System.out.println(list.vueloReciente());
        //list.getLista();

        //System.out.println(Collections.min(list.getLlegadasVuelos().values(), Comparator.comparing(Vuelo::getCantidadPasajeros)));
        List<Vuelo> pasajerosMayores=list.getLlegadasVuelos().values().stream().filter(a-> 40<a.getCantidadPasajeros()&& a.getCantidadPasajeros()< 50).toList();
        System.out.println(pasajerosMayores);
    }




    }

