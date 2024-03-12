package com.cursojavadaw.poo.java8_lambda;

import java.util.function.Predicate;

public class EjemploPredicate {
    public static void main(String[] args) {
        Predicate<Integer> test=numero-> numero>10;
        boolean c=test.test(11);
        System.out.println(c);

        Predicate<String> role=user-> user.equals("Admin");
        System.out.println(role.test("Admin"));
    }
}
