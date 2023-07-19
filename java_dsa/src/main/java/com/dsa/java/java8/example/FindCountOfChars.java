package com.dsa.java.java8.example;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.stream.Collectors;

public class FindCountOfChars {
    public static void main(String[] args) {
        String s = "string data to count each character";
        LinkedHashMap<String, Long> collect = Arrays.stream(s.split("")).map(String::toLowerCase)
                .collect(Collectors.groupingBy(x -> x, LinkedHashMap::new, Collectors.counting()));

        System.out.println(collect);
    }
}
