package com.dsa.java.java8.example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateElements {


    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        Set<Integer> integerSet=new HashSet<>();

        /*duplicate element*/
        myList.stream().filter(x->!integerSet.add(x)).forEach(System.out::println);

        /*unique element*/

        myList.stream().filter(x->integerSet.add(x)).forEach(System.out::println);


    }

}
