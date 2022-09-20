package com.dsa.java.BS;

public class BSDecOerder {
    public static void main(String[] args) {
        int[] arrDes={19,17,12,11,10,9,8,3,2,1};
        System.out.println(desOrder(arrDes,17));

    }
    static int desOrder(int[] arr,int target){
        if (arr.length==0) return -1;
        int start=0;
        int end=arr.length-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if (target>arr[mid]){
                end=mid-1;
            } else if (target<arr[mid]) {
                start=mid+1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
