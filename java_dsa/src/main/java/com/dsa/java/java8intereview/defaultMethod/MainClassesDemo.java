package com.dsa.java.java8intereview.defaultMethod;

public class MainClassesDemo implements FunctionalInterfaceDemo {

    public void printMessage(){
        System.out.println("Welcome Vineet");
    }

    public static void main(String[] args) {
        MainClassesDemo mainClassesDemo=new MainClassesDemo();
        mainClassesDemo.printMessage();

    }
}
