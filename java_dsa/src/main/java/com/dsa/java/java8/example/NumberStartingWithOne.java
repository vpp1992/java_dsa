package com.dsa.java.java8.example;

import java.util.Arrays;
import java.util.List;

public class NumberStartingWithOne {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(10, 15, 8, 49, 25, 98, 32);
        integerList.stream().map(Object::toString).filter(x->x.startsWith("1")).forEach(System.out::println);

    }
}
