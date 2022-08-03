package com.dsa.java.array;

import java.util.Arrays;
import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
         int[][] arr=new int[3][3];

       /* int[][] arr2D = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9,10}

        };*/
   ///input
        for (int row = 0; row <arr.length ; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col]=input.nextInt();
            }
        }

        //output

      /*  for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.printf(arr[row][col]+ " ");
            }
            System.out.println();
        }*/

        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));
        }

       // System.out.printf(Arrays.toString(arr));






    }
}
