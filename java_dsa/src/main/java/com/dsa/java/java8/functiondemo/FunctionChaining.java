package com.dsa.java.java8.functiondemo;

import java.util.function.Function;

public class FunctionChaining {

    /*We can combine /chain multiple function together with andThen
    *  two types of combine
    * f1.andThen(f2).apply(input) -> first f1 then f2
    * f1.compose(f2).apply(input) -> first f2 then f1
    *
    * */
    public static void main(String[] args) {

        Function<Integer ,Integer> doubleIt=d->d*d;
        System.out.println("Double it : "+doubleIt.apply(2));

        Function<Integer,Integer> tripleIt=t->t*t*t;
        System.out.println("Triple It :"+tripleIt.apply(2));

        System.out.println("First double using apply andThen: "+doubleIt.andThen(tripleIt).apply(2));
        System.out.println("First double using apply compose: "+doubleIt.compose(tripleIt).apply(2));

    }
}
