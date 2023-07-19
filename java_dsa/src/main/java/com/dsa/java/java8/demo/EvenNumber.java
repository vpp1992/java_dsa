package com.dsa.java.java8.demo;

import java.util.Arrays;
import java.util.List;

public class EvenNumber {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,15,8,49,25,98,32);
        list.stream().filter(x->x%2==0).forEach(System.out::println);
    }


}
