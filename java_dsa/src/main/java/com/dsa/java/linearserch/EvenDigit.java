package com.dsa.java.linearserch;

public class EvenDigit {
    public static void main(String[] args) {
        int[] nums={12,345,2,6,7896};
        System.out.println(findEvenNumber(nums));
    }

    static  int findEvenNumber(int[] nums){
        if (nums.length==0) return -1;
        int count=0;
        for (int num:nums) {
            if (even(num)){
                count++;
            }
        }
        return count;

    }

    private static boolean even(int num) {
        int digits = digits(num);
        return digits % 2 == 0;
    }
    private static int digits(int num){
        int count=0;
        while (num>0){
            count++;
            num=num/10;
        }
        return count;
    }

}
