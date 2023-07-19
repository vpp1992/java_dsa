package com.dsa.java.java8.supplier;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierDemo {
    /*
    * Supplier<R> ->it will just apply required objects and will not take any input
    *
    *
    * */

    public static void main(String[] args) {
        Supplier<Date> currentDate= Date::new;
        System.out.println(currentDate.get());

    }
}
