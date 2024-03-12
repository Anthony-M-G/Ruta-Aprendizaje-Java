package com.cursojavadaw.poo.api_stream;

import java.rmi.NotBoundException;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjemploStream {
    public static void main(String[] args) {
        /*Stream<String> nombres=Stream.of("pato perez","paco mena","pepa torres","pepe juanes");
        List<User> users= nombres.map(user-> new User(user.split(" ")[0],user.split(" ")[1])).toList();//Lista de usuarios

        Optional<User> user1=users.stream().filter(user-> user.getNombre().equals("pepe")).findFirst();
        user1.ifPresent(System.out::println);


        boolean exists=users.stream().anyMatch(user-> user.getId().equals(1));
        System.out.println(exists);*/

        Stream<String> nombres=Stream.of("pato perez","paco mena","pepa torres","pepe juanes","","","","juan torres");

        var noVacios= nombres.filter(e-> !e.isBlank()).toList().stream().map(user-> new User(user.split(" ")[0],user.split(" ")[1])).toList();
        System.out.println(noVacios);


    }
}
