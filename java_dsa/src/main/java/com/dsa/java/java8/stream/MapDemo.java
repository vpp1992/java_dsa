package com.dsa.java.java8.stream;

import java.util.List;
import java.util.Objects;

public class MapDemo {
    public static void main(String[] args) {
        List<Integer> integerList = List.of(1, 2, 3, 4, 5, 6);
        integerList.stream().filter(Objects::nonNull).map(x->x*x).forEach(System.out::println);
    }
}
