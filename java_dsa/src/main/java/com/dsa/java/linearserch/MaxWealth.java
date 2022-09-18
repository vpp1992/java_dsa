package com.dsa.java.linearserch;

public class MaxWealth {
    public static void main(String[] args) {

        int[][] arr2DWealth= {
                {1,2,3},
                {3,2,1}
        };

        System.out.println(maximumWealth(arr2DWealth));
    }

    public static int maximumWealth(int[][] accounts) {
        int ans=Integer.MIN_VALUE;
        for (int person = 0; person < accounts.length; person++) {
            int sum=0;
            for (int account = 0; account <accounts[person].length ; account++) {
                sum+=accounts[person][account];
            }
            if (sum>ans){
                ans=sum;
            }
        }
        return ans;

    }
    
}
