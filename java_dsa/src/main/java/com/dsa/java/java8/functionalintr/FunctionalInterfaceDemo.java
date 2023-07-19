package com.dsa.java.java8.functionalintr;
@FunctionalInterface
public interface FunctionalInterfaceDemo {
    void sam();

    default void printName(){
        System.out.println("Welcome Code Decode");
    }
}
