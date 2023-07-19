package com.dsa.java.demo.designpattern.solid.DI;

public class CreditCard implements Card {

    @Override
    public void doTransaction() {
        System.out.println("Credit Card");
    }
}
