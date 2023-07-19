package com.dsa.java.demo.shallowdeep;

import com.dsa.java.demo.sorting.Employee;

public class MainClass {
    public static void main(String[] args) {
        Emp emp=new Emp();
        emp.setId(1);
        emp.setName("vineet");

        Emp em1=new Emp();
        em1.setId(1);
        em1.setName("vineet");

        System.out.println("Shallow Compare"+(emp==em1));
        System.out.println("Deep Compare" +(emp.equals(em1)));


    }
}
