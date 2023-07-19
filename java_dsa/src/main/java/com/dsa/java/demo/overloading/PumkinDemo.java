package com.dsa.java.demo.overloading;

public class PumkinDemo {
    public static void main(String[] args) {

        testMethod(1);
        testMethod("String");
        tetMethod(1,"string");
        testMethod(null);
    }



    private static void testMethod(int i) {
        System.out.println("Number");
    }

    private static void testMethod(String s) {
        System.out.println("string");
    }

    private static void testMethod(Object s) {
        System.out.println("=object");
    }
    private static void tetMethod(int i, String string) {
        System.out.println("number and String");
    }
}
