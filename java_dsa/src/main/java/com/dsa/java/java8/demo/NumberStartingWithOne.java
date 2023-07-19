package com.dsa.java.java8.demo;

import java.util.Arrays;
import java.util.List;

public class NumberStartingWithOne {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32);
        myList.stream().filter(x->x.toString().startsWith("1")).forEach(System.out::println);

    }
}
