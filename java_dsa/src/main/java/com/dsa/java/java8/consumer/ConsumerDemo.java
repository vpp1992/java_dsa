package com.dsa.java.java8.consumer;

import java.util.function.Consumer;

public class ConsumerDemo {
    /* it will consume items  consumer never return any thing
    * take any object and c=save it deatils in databse and dont return any thing
    * */
    public static void main(String[] args) {
        Consumer<Integer> consumer=c-> System.out.println("Taking the value perfom some operation: "+c*c);
        consumer.accept(5);
    }
}
