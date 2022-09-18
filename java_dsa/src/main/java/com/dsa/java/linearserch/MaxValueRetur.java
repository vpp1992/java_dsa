package com.dsa.java.linearserch;

public class MaxValueRetur {



    public static void main(String[] args) {
        int [][] array2d={
                {23,4,1},
                {18,12,3,9},
                {78,99,34,56},
                {18,12}
        };

        System.out.println(maxValue(array2d));
    }

    static int maxValue(int[][] array2d){
        if (array2d.length==0) return -1;
        int max=Integer.MIN_VALUE;
        for (int row = 0; row < array2d.length; row++) {
            for (int col = 0; col < array2d[row].length; col++) {
                if (array2d[row][col]> max){
                     max=array2d[row][col];
                }
            }
        }
        return max;
    }
}
