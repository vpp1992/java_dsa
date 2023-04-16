package com.dsa.java.hackerank;

import java.util.Arrays;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] numbers= {1, 6 ,4 ,8 ,2};
        System.out.println(findSmallestInterval(numbers));
    }

    public static int findSmallestInterval (int [] numbers) {
        // we write the code here

        Arrays.sort(numbers);//i sorted it
        int diff = numbers[1] - numbers[0];
        int diffNeu = 0;

        for(int i = 1; i < numbers.length-1; i++)
        {
            diffNeu = numbers[i + 1] - numbers[i];
            if(diffNeu < diff)
            {
                diff = diffNeu;
            }
        }
        return diffNeu;
    }

}
