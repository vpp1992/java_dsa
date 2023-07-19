package com.dsa.java.demo.designpattern.singlton;

public class ThreadSafeDoubleCheckingLocking {
    private  static ThreadSafeDoubleCheckingLocking threadSafeDoubleCheckingLocking;

    private  ThreadSafeDoubleCheckingLocking(){

    }

    public static ThreadSafeDoubleCheckingLocking getInstance(){

        if (threadSafeDoubleCheckingLocking==null){

            synchronized (ThreadSafeDoubleCheckingLocking.class){
                if (threadSafeDoubleCheckingLocking==null){
                    new ThreadSafeDoubleCheckingLocking();
                }
            }

        }
        return threadSafeDoubleCheckingLocking;
    }
}
