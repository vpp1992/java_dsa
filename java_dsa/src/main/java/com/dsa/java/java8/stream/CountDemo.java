package com.dsa.java.java8.stream;

import java.util.List;

public class CountDemo {
    public static void main(String[] args) {
        List<Integer> integerList = List.of(1, 2, 3, 4, 5);
        long count = integerList.stream().filter(x -> x >= 2).count();
        System.out.println(count);
    }
}
