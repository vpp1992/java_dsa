package com.dsa.java.java8.functiondemo;

import com.dsa.java.java8.functionalintr.FunctionalInterfaceDemo;

import java.util.function.Function;

public class FunctionDemo {
    /* function is also predefined interface having only one interfaces
    * only one abstract method apply(T t)
    * take input return output
    * in function return type is not fixed hence we declare both input type and return type
    * */

    public static void main(String[] args) {
        Function<Integer,Integer> function=f->f*f;
        System.out.println("Square is 5:"+function.apply(5));
    }
}
