package com.dsa.java.demo.designpattern.singlton;

public class ThreadSafeSingleton {

    private static ThreadSafeSingleton singleton=null;

    private ThreadSafeSingleton(){}

    public static synchronized ThreadSafeSingleton getInstance(){
        if (singleton==null){
            return new ThreadSafeSingleton();
        }
        return singleton;
    }
}
