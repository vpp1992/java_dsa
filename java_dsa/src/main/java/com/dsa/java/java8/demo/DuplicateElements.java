package com.dsa.java.java8.demo;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class DuplicateElements {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);

        HashSet<Integer> hashSet=new HashSet<>();

        myList.stream().filter(x->!hashSet.add(x)).forEach(System.out::println);
    }
}
