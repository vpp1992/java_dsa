package com.dsa.java.java8.functionalintr;

public class InterfaceDemoImplWithOverriddenDefault  implements InterfaceDemo{
   @Override
    public void printName() {
        System.out.println("Welcome to oberridden");
    }

    public static void main(String[] args) {
        InterfaceDemoImplWithOverriddenDefault d=new InterfaceDemoImplWithOverriddenDefault();
        d.printName();
    }
}
