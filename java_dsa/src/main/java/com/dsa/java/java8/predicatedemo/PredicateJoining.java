package com.dsa.java.java8.predicatedemo;

import java.util.function.Predicate;

public class PredicateJoining {
    /* three-way predicate joining
    * and
    * or
    * negate
    * */
    public static void main(String[] args) {
        Predicate<String> checkLength=s->s.length()>5;
        System.out.println("The lenght of string is greater than 5: "+checkLength.test("Vineet Pandey"));

        Predicate<String> checkEvenLength=s->s.length()%2==0;
        System.out.println("String is even or not : "+checkEvenLength.test("vineet"));

        System.out.println("After merging with and :"+checkLength.and(checkEvenLength).test("vineet"));
        System.out.println("After merging with or :"+checkLength.or(checkEvenLength).test("vineet pan"));
        System.out.println("After merging with negate :"+checkLength.negate().test("vineet pan"));





    }
}
