package com.dsa.java.java8.functionalintr;

public class MethodRefDemo {
    public static void main(String[] args) {
        FunctionalInterfaceDemo functionalInterfaceDemo=Test::testImpl;
        functionalInterfaceDemo.sam();

        FunctionalInterfaceDemo f=()-> System.out.println("SAM");
        f.sam();
    }
}

class Test{
    public static void testImpl(){
        System.out.println("this is test implementation of your abstract method");
    }
}
