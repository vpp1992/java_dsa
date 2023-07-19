package com.dsa.java.demo.overloading;

import com.dsa.java.java8.functionalintr.FunctionalInterfaceDemo;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PumpkinDemo2 {
 
    public static void main(String[] args) {
        List<String> items = Arrays.asList("apple", "banana", "apple", "orange", "papaya", "banana", "apple");

        Map<String, Long> collect = items.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);
    }
}