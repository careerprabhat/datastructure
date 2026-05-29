package a_Beginner;

import java.util.Arrays;

/**
 * Climbing Stairs Problem:
 * You are climbing a staircase. It takes n steps to reach the top.
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 * Example:
 * Input: n = 5
 * Output: 8
 * Explanation: There are 8 distinct ways to climb to the top.
 * 1. 1 + 1 + 1 + 1 + 1
 * 2. 1 + 1 + 1 + 2
 * 3. 1 + 1 + 2 + 1
 * 4. 1 + 2 + 1 + 1
 * 5. 2 + 1 + 1 + 1
 * 6. 1 + 2 + 2
 * 7. 2 + 1 + 2
 * 8. 2 + 2 + 1
 */
public class B1_ClimbingStairsMemo {
    public static int climb(int n, int[] dp) {
        if (n <= 1) return 1;

        if (dp[n] != -1) return dp[n];

        dp[n] = climb(n - 1, dp) + climb(n - 2, dp);
        return dp[n];
    }

    public static void main(String[] args) {
        int n = 5;
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);

        System.out.println(climb(n, dp)); // Output: 8
    }
}
