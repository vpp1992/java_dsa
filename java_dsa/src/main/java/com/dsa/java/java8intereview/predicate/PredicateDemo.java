package com.dsa.java.java8intereview.predicate;

import java.util.function.Predicate;

public class PredicateDemo {

    /*
    * predicate is pre defined functional interface
    * public boolean test()
    * when ever we want check some boolean condition than we can go predicate
    * */
    public static void main(String[] args) {
        Predicate<String> stringPredicate=s->s.length()>=5 && s.contains("*");

        System.out.println("Predicate value :" +stringPredicate.test("Hello V*Ineet"));

    }
}
