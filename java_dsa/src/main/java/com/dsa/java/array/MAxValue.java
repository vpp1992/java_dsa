package com.dsa.java.array;

public class MAxValue {
    public static void main(String[] args) {
        int[] arr={1,2,3,5,8,23,9};
        maxValueArr(arr);
        System.out.println(maxValueArr(arr));
    }

    private static int maxValueArr(int[] arr) {

        int maxValue=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>maxValue){
                maxValue=arr[i];
            }
        }
        return maxValue;
    }
}
