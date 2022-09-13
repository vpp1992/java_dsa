package com.dsa.java.linearserch;

public class SearchMinNumber {
    public static void main(String[] args) {
        int[] intArray={18,12,-7,3,14,28};
        System.out.println(min(intArray));
    }

    static int min(int[] arr){
        if (arr.length==0) return -1;
        int ans=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]<ans){
                ans=arr[i];
            }
        }

        return ans;
    }
}
