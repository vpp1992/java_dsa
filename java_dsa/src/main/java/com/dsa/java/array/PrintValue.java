package com.dsa.java.array;

import java.util.Scanner;

public class PrintValue {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        int[] arr=new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=input.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");;
        }
    }
}
