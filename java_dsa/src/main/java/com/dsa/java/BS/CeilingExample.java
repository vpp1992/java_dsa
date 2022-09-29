package com.dsa.java.BS;

public class CeilingExample {
    public static void main(String[] args) {
        int[] arr={-18,-12,1,3,4,5,6,7,8,9,12};
        System.out.println(ceilingNumber(arr,2));
    }

    static int ceilingNumber(int[] arr,int target){
        if (arr.length==0) return -1;
        int start=0;
        int end=arr.length-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if (target<=arr[mid]){
                end=mid-1;
            }
            else if (target>=arr[mid]){
                start=mid+1;
            }
            else {
                return mid;
            }
        }
        return start;
    }
}
