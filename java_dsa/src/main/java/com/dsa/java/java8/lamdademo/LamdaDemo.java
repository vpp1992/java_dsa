package com.dsa.java.java8.lamdademo;

import java.util.function.BiConsumer;

public class LamdaDemo {
    public static void main(String[] args) {

        BiConsumer<Integer,Integer> biConsumer=(a,b)-> System.out.println(a+b);
        biConsumer.accept(10,5);

        BiConsumer<Integer,Integer>biConsumer1=(a,b)->{
            System.out.println(a+b);
        };
        biConsumer1.accept(2,2);
    }
}
