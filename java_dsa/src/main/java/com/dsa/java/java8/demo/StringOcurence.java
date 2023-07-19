package com.dsa.java.java8.demo;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringOcurence {
    public static void main(String[] args) {

        String s = "vineet";
        LinkedHashMap<String, Long> collect = Arrays.stream(s.split("")).collect(Collectors.groupingBy(x -> x, LinkedHashMap::new, Collectors.counting()));
        System.out.println(collect);
    }
}
