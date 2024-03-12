package com.cursojavadaw.poo.cursojava_ejerciciosvarios.ejercicios_streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EjerciciosPracticaStreams {
    public static void main(String[] args) {
        /*int[] arr= new int[100];
        for (int i = 1; i < arr.length ; i++) {
            arr[0]=1;
            arr[i]=i+1;
        }
        double suma=Arrays.stream(arr)
                .filter(num-> num%10!=0)
                .mapToDouble(num-> (double) num/2)
                .reduce(0, Double::sum);
        System.out.println(suma);
        ===============================================================================================
        Function<Integer[], Integer> mayor= (a)-> Arrays.stream(a)
                                                        .toList()
                                                        .stream()
                                                        .max(Integer::compareTo).get();
        Integer[] array = {7, 21, 34, 45, 63, 17, 82, 39, 52, 11, 28, 95, 57, 69, 33, 88, 42, 59, 76, 25};
        Integer numMayor= mayor.apply(array);
        System.out.println(numMayor);*/

        String[][] lenguajes = {{"java", "groovy"}, {"php"}
                , {"c#", "python", "groovy"}
                , {"java", "javascript", "kotlin"}
                , {"javascript"}, {}};

        Arrays.stream(lenguajes)
                .flatMap(arr -> Arrays.stream(arr))
                .distinct()
                .forEach(e -> System.out.println(e));



    }
}
