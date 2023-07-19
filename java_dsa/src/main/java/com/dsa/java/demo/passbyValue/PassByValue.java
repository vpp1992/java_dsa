package com.dsa.java.demo.passbyValue;

public class PassByValue {
    public static void main(String[] args) {
        int a=3;

        System.out.println("Value of a" +a);
    }

    public static void changePrimitives(int copy){
        copy=4;
    }
}
