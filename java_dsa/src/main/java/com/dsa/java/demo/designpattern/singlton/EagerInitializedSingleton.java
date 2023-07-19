package com.dsa.java.demo.designpattern.singlton;

public class EagerInitializedSingleton {


    private static EagerInitializedSingleton initializedSingleton=new EagerInitializedSingleton();

    private EagerInitializedSingleton(){

    }

    public static EagerInitializedSingleton getInstance(){
        return initializedSingleton;
    }
}
