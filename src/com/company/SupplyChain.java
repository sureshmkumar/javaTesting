package com.company;

import java.util.function.Supplier;

public class SupplyChain {
    public static void main(String[] args) {
        Supplier<Double> randVal = () -> Math.random();
       // System.out.println(randVal.get());
       // System.out.println(randVal.get());
        System.out.println(randVal);
    }

}
