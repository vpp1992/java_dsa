package com.dsa.java.java8.stream;

import java.util.List;
import java.util.stream.Stream;

public class Sorted {
    public static void main(String[] args) {
        List<Integer> integerList = List.of(1, 2, 4, 5, 3, 8, 7, 9);
        integerList.stream().filter(x -> x >= 2).sorted().forEach(System.out::println);

    }
}
