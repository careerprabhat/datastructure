package a_Beginner;

import java.util.Arrays;

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
