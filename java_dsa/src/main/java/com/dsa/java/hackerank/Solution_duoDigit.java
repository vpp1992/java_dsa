package com.dsa.java.hackerank;

import java.util.HashSet;
import java.util.Set;

public class Solution_duoDigit {

    public static String isDuoDigit(int number) {
        /* Write your code here */
        boolean isDuoDigit = Integer.toString(number).replace("-", "").chars().distinct().count() <= 2;
        return isDuoDigit ? "y" : "n";
        
    }

    public static void main(String[] args) {

        //System.out.println(Solution_duoDigit.isDuoDigit(12));
       // System.out.println(Solution_duoDigit.isDuoDigit(110));
        //System.out.println(Solution_duoDigit.isDuoDigit(102));
        System.out.println(Solution_duoDigit.isDuoDigit(-2021));

    }
}