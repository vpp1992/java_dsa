package com.dsa.java.BS;

import java.util.Arrays;

public class FindFirstLastPosition {
    public static void main(String[] args) {
        int[] arr = {5, 7, 7, 8, 8, 10};
        int target = 8;
        System.out.println(Arrays.toString(searchRange(arr, target)));

    }

    public static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        int first = search(nums, target, true);
        int end = search(nums, target, false);
        ans[0]=first;
        ans[1]=end;
        return ans;

    }

    static int search(int[] nums, int target, boolean findStartIndex) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target <= nums[mid]) {
                end = mid - 1;
            } else if (target >= nums[mid]) {
                start = mid + 1;
            } else {
                ans = mid;
                if (findStartIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return ans;
    }

}
