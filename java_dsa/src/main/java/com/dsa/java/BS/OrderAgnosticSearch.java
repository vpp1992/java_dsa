package com.dsa.java.BS;

public class OrderAgnosticSearch {
    public static void main(String[] args) {
       // int[] arr={-18,-12,1,3,4,5,6,7,8,9,12};
        int[] arrDes={19,17,12,11,10,9,8,3,2,1};
        System.out.println(orderAgnosticBs(arrDes,19));
    }

    static int orderAgnosticBs(int[] arr, int target) {
        if (arr.length == 0) return -1;
        int start = 0;
        int end = arr.length - 1;
        boolean asc = arr[start] < arr[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return mid;
            }
            if (asc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

        }
        return -1;
    }

}
