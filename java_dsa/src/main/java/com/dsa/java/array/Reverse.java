package com.dsa.java.array;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        int[] arr={1,3,2,23,8};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void reverse(int[] arr) {

        int start=0;
        int end=arr.length-1;
        while (start < end){
            swapArray(arr,start,end);
            start++;
            end--;
        }
    }

    private static void swapArray(int[] arr, int start, int end) {

        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=arr[temp];
    }
}
