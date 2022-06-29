package com.dsa.java.condition;

import java.util.Scanner;

public class TypeCheckDemo {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        char c=input.next().trim().charAt(0);
        if (c >='a' && c<='z'){
            System.out.println("Lower case");
        }
        else {
            System.out.println("Upper Case");
        }
    }
}
