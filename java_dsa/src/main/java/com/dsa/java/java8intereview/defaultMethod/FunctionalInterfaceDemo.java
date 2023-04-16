package com.dsa.java.java8intereview.defaultMethod;
//@FunctionalInterface
public interface FunctionalInterfaceDemo {

   // void singleAbstractMethod();
    default void printMessage(){
        System.out.println("Welcome");
    }
}
