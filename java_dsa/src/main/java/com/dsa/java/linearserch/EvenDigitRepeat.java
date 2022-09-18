package com.dsa.java.linearserch;

public class EvenDigitRepeat {
    public static void main(String[] args) {
        int[] nums={12,345,2,6,7896,9876};
        System.out.println(findNumbers(nums));
    }

    public  static int findNumbers(int[] nums) {
        if (nums.length==0) return -1;
        int count=0;
        for (int num: nums) {
            if (evenFind(num)){
                count++;
            }

        }
        return count;

    }

    private static boolean evenFind(int num) {
        int digit= dig(num);
        return digit%2==0;
    }

    private static int dig(int num){
        return (int) (Math.log10(num)+1);
    }

    private static int digits(int num) {
        if (num<0){
            num=num*-1;
        }

        if (num==0){
            return 1;
        }
        int digit=0;
        while (num>0){
            digit++;
            num=num/10;
        }
        return digit;
    }
}
