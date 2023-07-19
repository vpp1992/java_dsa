package com.dsa.java.java8.stream;

import java.util.Comparator;
import java.util.List;

public class SortedDescendingOrder {
    public static void main(String[] args) {
        List<Integer> integerList = List.of(1, 2, 4, 5, 3, 8, 7, 9);
        integerList.stream().filter(x->x>2).sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
}
