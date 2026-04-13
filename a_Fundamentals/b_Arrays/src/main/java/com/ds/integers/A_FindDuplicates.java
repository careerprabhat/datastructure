package com.ds.integers;

import java.util.Arrays;

public class A_FindDuplicates {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 2, 5, 6, 7, 8, 9, 10};
        Arrays.sort(nums);
        for(int i:nums) {
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("Sorted array:"+ removeDuplicates(nums));
        for(int i:nums) {
            System.out.print(i+" ");
        }

    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int slow = 0;  // Points to last unique element
        for (int fast = 1; fast < nums.length; fast++) {
            if (nums[slow] != nums[fast]) {
                slow++;
                nums[slow] = nums[fast];
            }
        }
        return slow + 1;
    }
}
