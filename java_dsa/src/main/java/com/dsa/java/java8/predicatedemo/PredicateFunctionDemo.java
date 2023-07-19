package com.dsa.java.java8.predicatedemo;

import java.util.function.Predicate;

public class PredicateFunctionDemo {

    /*
    * Predicate is predefined functional interface
    * only one SAM test(T t)
    * we are cheking only boolena condtion if any
    * */
    public static void main(String[] args) {
        Predicate<String> stringPredicate=s->s.length()>=5;
        System.out.println("The length of string is greater than 5 :" +stringPredicate.test("code decode test"));
    }
}
