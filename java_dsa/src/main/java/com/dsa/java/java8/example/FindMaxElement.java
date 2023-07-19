package com.dsa.java.java8.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindMaxElement {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        Integer integer = myList.stream().max(Comparator.naturalOrder()).get();
        System.out.println(integer);
    }
}
