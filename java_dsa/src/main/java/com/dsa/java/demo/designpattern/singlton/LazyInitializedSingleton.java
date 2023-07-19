package com.dsa.java.demo.designpattern.singlton;

public class LazyInitializedSingleton {

    private  static LazyInitializedSingleton singleton;

    private LazyInitializedSingleton(){}

    public static LazyInitializedSingleton getInstance(){
        if (singleton==null){
            return new LazyInitializedSingleton();
        }
        return singleton;
    }

}
