package com.dsa.java.demo.overloading;

public class PumpkinDemo1 {
    public static void main(String[] args) {
        testMethod(1);
    }

    public static void testMethod(long number)
    {
        System.out.println("long");
    }

    public static void testMethod(int number)
    {
        System.out.println("int");
    }

    public static void testMethod(Integer number)
    {
        System.out.println("Integer");
    }

    public static void testMethod(double number)
    {
        System.out.println("double");
    }

    public static void testMethod(Number number)
    {
        System.out.println("Number");
    }
}
