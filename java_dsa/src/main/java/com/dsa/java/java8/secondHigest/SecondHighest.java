package com.dsa.java.java8.secondHigest;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SecondHighest {
    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(1, 2, 4, 5, 6);
        Integer integer = integerList.stream().sorted(Comparator.naturalOrder()).skip(1).findFirst().get();
        System.out.println(integer);

        /*------------------------------*/
        String string="I love my India";
        LinkedHashMap<String, Long> collect = Arrays.stream(string.split("")).sorted(Comparator.naturalOrder()).collect(Collectors.groupingBy(x -> x, LinkedHashMap::new, Collectors.counting()));

        System.out.println(collect);


    }
}
