package com.dsa.java.java8;

public class Factorial {
    public static void main(String[] args) {
        int number=5;//It is the number to calculate factorial
        int fact=1;
        for (int i = 1; i <=number; i++) {
            fact=fact*i;
        }
        System.out.println(fact);
    }
}
