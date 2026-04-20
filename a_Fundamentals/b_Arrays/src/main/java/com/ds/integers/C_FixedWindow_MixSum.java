package com.ds.integers;

public class C_FixedWindow_MixSum {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int k = 3;
        int target = 15;
        System.out.println(findMixSum(nums, k, target));
    }

    public static boolean findMixSum(int[] nums, int k, int target) {
        if (nums.length < k) return false;

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        if (sum == target) return true;

        for (int i = k; i < nums.length; i++) {
            sum += nums[i] - nums[i - k]; // Slide the window
            if (sum == target) return true;
        }
        return false;
    }
}
