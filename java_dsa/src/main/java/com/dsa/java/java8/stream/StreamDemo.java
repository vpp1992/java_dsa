package com.dsa.java.java8.stream;

import java.util.List;

public class StreamDemo {
    /* if we want to process bulk objects of collection then go for stream concepts

    * its a special iterator class that allows processing colection of objects
    * Diff between streams and collections
    Streams-if we want to perform operation on bulk objects than we should go streams
    colections-to represnts group of collection as single entity than we should go collection cocepts
    * */
    public static void main(String[] args) {

        List<Integer> integerList = List.of(1,2,3,4,5,6);
        integerList.stream().filter(x->x%2==0).forEach(System.out::println);

        //integerList.stream().map(i->i*i).forEach(System.out::println);

    }
}
