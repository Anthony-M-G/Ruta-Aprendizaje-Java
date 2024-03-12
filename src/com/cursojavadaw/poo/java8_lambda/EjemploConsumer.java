package com.cursojavadaw.poo.java8_lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class EjemploConsumer {
    public static void main(String[] args) {
        //Consumer<String> consumer=saludo-> System.out.println(saludo);
        //consumer.accept("Hola");

        Consumer<String> consumer2= System.out::println;
        consumer2.accept("Consumer2");

        List<String> names= Arrays.asList("jose","Juan","pepe","meme","polo");
        names.forEach(consumer2);
    }

}
