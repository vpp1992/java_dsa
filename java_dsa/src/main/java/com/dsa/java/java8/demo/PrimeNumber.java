package com.dsa.java.java8.demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimeNumber {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 20);
        List<Integer> collect = numbers.stream().filter(PrimeNumber::isPrime).collect(Collectors.toList());
        System.out.println(collect);

        System.out.println("============ java 8");
        List<Integer> collect1 = numbers.stream().filter(PrimeNumber::isPrime8).collect(Collectors.toList());
        System.out.println(collect);



    }

    public static boolean isPrime(int number){
        for (int i = 2; i < number; i++) {
            if (number%i==0){
                /*System.out.println(number+ "is not prime");*/
                return false;

            }
        }
        /*System.out.println(number+ "is  prime");*/
        return true;
    }

    public static boolean isPrime8(int number) {
        return IntStream.rangeClosed(2, number / 2).noneMatch(x -> x % 2 == 0);
    }
}
