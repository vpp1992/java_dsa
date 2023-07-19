package com.dsa.java.demo.sorting;

import java.util.Arrays;

public class MainSortClass {
    public static void main(String[] args) {

        Employee[] employees=new Employee[4];
        employees[0]=new Employee(5,"John");
        employees[1]=new Employee(0,"Paul");
        employees[2]=new Employee(1,"Amit");
       // Arrays.sort(employees);
        System.out.println("sorted"+ Arrays.toString(employees));
    }
}
