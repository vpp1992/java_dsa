package com.dsa.java.java8intereview.lamda;

import java.util.function.BiConsumer;

public class LamdaExp {
    /*
    * lamda expression is anonymous function
    * without return type ,name and accese modifier
    * use only (->)symbol
    * */
    public static void main(String[] args) {
        BiConsumer<Integer,Integer> biConsumer=(a,b)-> System.out.println(a+b);
        biConsumer.accept(10,5);
    }
}
