package com.dsa.java.array;

import java.util.Arrays;
import java.util.Scanner;

public class StringObject {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        String[] arr=new String[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=input.next();
        }
        System.out.printf(Arrays.toString(arr));
    }
}
