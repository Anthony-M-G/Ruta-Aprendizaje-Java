package com.cursojavadaw.poo.iterable_iterator;

import java.util.*;

public class mainStudent {
    public static void main(String[] args) {
        List<Student> students=new ArrayList<>();
        students.add(new Student("Carlos", 19, "curso 3"));
        students.add(new Student("Felipe", 21, "curso 1"));
        students.add(new Student("Ana", 18, "curso 4"));
        students.add(new Student("Rosa", 15, "curso 1"));
        students.add(new Student("Jose", 10, "curso 2"));
        students.forEach(e-> System.out.println(e.getName())); // Sin ningún tipo de ordenación
        System.out.println();
        students.sort(Comparator.comparing(Student::getName)); // Implementacion de la interfaz comparable con una expresión lambda
        students.forEach(student -> System.out.println(student.getName()));


    }
}
