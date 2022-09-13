package com.dsa.java.linearserch;

public class SearchRange {
    public static void main(String[] args) {
        int[] intArray={18,12,-7,3,14,28};
        System.out.println(indexSearch(intArray,10,1,3));
    }

    static int indexSearch(int[] arr,int target,int start,int end){
        if (arr.length==0) return -1;
        for (int index = start; index < end; index++) {
            int element=arr[index];
            if (element==target){
                return index;
            }
        }
        return  -1;
    }
}
