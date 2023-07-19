package com.dsa.java.demo.overloading;

public class Factorial {
    public static void main(String[] args) {

        int i;
        int fact=1;
        int number=4;

        System.out.println("----------------------");
        System.out.println(fact(number));

        System.out.println("===============");

        for (int n = 1; n <=number; n++) {
            fact=fact*n;

        }

        System.out.println(fact);
    }

    static int  fact(int n){
        if(n==0){
            return 1;

        }
        else {
            return (n*fact(n-1));
        }
    }
}
