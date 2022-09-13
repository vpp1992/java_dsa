package com.dsa.java.linearserch;

import java.util.Arrays;

public class Array2DSearch {
    public static void main(String[] args) {
        int [][] array2d={
                {23,4,1},
                {18,12,3,9},
                {78,99,34,56},
                {18,12}
        };

        int[] ints = search2D(array2d, 100);
        System.out.println(Arrays.toString(ints));
    }

    static int[]search2D(int[][] arr,int target){
        if (arr.length==0) return new int[]{-1,-1};
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col]==target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }

}
