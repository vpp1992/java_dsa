package com.dsa.java.linearserch;

public class SerarchInt {
    public static void main(String[] args) {

        int[] a = {1,5,6,7,8,9,10,11,12,13,14,15,16};
     //   get(a,10);
        System.out.println(get(a,10));
    }

    static int get(int[] array,int target) {
        if(array.length == 0) return-1;
        for(int i=0; i<array.length; i++) {
            int element=array[i];
            if(element == target) return i;

        }
        return -1;

    }
}
