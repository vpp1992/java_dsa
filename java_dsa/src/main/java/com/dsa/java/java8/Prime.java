package com.dsa.java.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Prime {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 20);

        List<Integer> in = numbers.stream().filter(Prime::isPrime).collect(Collectors.toList());
        System.out.println(in);

    }

    private static boolean isPrime(Integer integer) {

        return IntStream.rangeClosed(2, integer / 2).noneMatch(i -> i % 2 == 0);
    }

    private static boolean isPrime1(Integer integer) {
        for (int i = 2; i < integer/2; i++) {
            if (integer/i==0){
                return false;
            }
        }
        return true;
    }
}
