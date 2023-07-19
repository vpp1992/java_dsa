package com.dsa.java;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringReverse {
    public static void main(String[] args) {

        String reverse = "vineet";
       /* LinkedHashMap<String, Long> collect = Arrays.stream(Arrays.toString(reverse.toCharArray()).split("")).map(x->x.).collect(Collectors.groupingBy(x -> x, LinkedHashMap::new, Collectors.counting()));
        System.out.println(collect);*/
        char[] chars = reverse.toCharArray();

        double a = 3.16;
        double b = 3.167;
        double c = 3.17;
        double floor = Math.floor(a);
        double floor1 = Math.floor(b);
        double floor2 = Math.abs(c);
        System.out.println(floor == floor1);
        System.out.println("------------------");
        System.out.println(floor1==floor2);




    }
}
