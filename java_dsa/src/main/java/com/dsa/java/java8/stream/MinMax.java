package com.dsa.java.java8.stream;

import java.util.Comparator;
import java.util.List;

public class MinMax {
    public static void main(String[] args) {
        List<Integer> integerList = List.of(1, 2, 4, 5, 3, 8, 7, 9);
        Integer maxValue = integerList.stream().max(Comparator.naturalOrder()).get();
        System.out.println(maxValue);

        Integer minValue = integerList.stream().min(Comparator.naturalOrder()).get();
        System.out.println(minValue);
    }


}
