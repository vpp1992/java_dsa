package com.dsa.java.java8.predicatedemo;

import java.util.function.BiPredicate;

public class BiPredicateDEmo {
    public static void main(String[] args) {

        BiPredicate<Integer,Integer> biPredicate=(a,b)->a+b>5;
        System.out.println("sum of 2 and 5 is grerater than 5"+biPredicate.test(2,2));
    }
}
