package com.dsa.java.array;

public class MaxRange {
    public static void main(String[] args) {
        int[] arr={5,5,7,8,9,23,45,78,10};

        System.out.println(maxRange(arr, 1,5));
    }

    private static int maxRange(int[] arr, int start, int end) {

        int maxValue=arr[start];
        for (int i = start; i <= end; i++) {
         if (arr[i]>maxValue){
             maxValue=arr[i];
         }
        }
        return maxValue;
    }
}
