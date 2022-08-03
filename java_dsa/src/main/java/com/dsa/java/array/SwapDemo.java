package com.dsa.java.array;

import java.util.Arrays;

public class SwapDemo {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        swapNu(arr,1,4);
        System.out.println(Arrays.toString(arr));
    }

    private static void swapNu(int[] arr, int i, int i1) {
        int temp=arr[i];
        arr[i]=arr[i1];
        arr[i1]=temp;
    }
}
