package com.dsa.java.java8.consumer;

import java.util.function.Consumer;

public class ConsumerChanning {
    /*
    *  consumer chainning only one SAM andThen
    *
    * */
    public static void main(String[] args) {
        Consumer<Integer> squareMe= i-> System.out.println("perfom squre:"+i*i);
        squareMe.accept(2);

        Consumer<Integer> doubleMe= i-> System.out.println("perfom double:"+2*i);
        doubleMe.accept(2);

        squareMe.andThen(doubleMe).accept(3);



    }
}
