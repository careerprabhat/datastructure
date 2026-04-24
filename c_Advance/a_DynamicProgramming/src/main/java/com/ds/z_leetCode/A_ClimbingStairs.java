package com.ds.z_leetCode;

import java.util.Arrays;

public class A_ClimbingStairs {
    public static void main(String[] args) {
        System.out.println("value="+ climbingStair(3));
    }

    public static int climbingStair(int n) {
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;

        for(int i=2;i<n;i++) {
            dp[i]=dp[i-1] + dp[i-2];
        }
        Arrays.stream(dp).forEach(System.out::println);
        return dp[n-1];
    }
}
