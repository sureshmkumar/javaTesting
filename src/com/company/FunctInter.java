package com.company;

import java.util.function.Function;

public class FunctInter {
    public static void main(String[] args) {
        Function<Integer,Double> aval = a -> a /2.0;
        System.out.println(aval.apply(10));
        System.out.println("Helloworld ");


    }
}
