package com.dsa.java.linearserch;

public class Main {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22,29,30,31,32,33,34,35,36,37};

        int target=2;
        System.out.println(getTarget(numbers, target));
        System.out.println(getTargetElement(numbers, target));
    }

    static int getTargetElement(int[] numbers, int target) {
        if(numbers.length == 0) return-1;
        for (int number : numbers) {
            if(number == target) return number;

        }
        return -1;

    }

    static int getTarget(int[] arrays,int target) {

        if (arrays.length == 0) return-1;
        for (int index=0;index<arrays.length;index++) {

            int element = arrays[index];
            if (element == target) return index;
        }
        return-1;
    }


}
