package com.dsa.java.array;

import java.util.Arrays;
import java.util.Scanner;

public class PrintArratToString {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int[] arr=new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=input.nextInt();
        }
        System.out.printf(Arrays.toString(arr));
    }
}
