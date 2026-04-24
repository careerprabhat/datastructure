package a_Beginner;

import java.util.Arrays;

public class C_MinCostMemo {
    public static int solve(int i, int[] cost, int[] dp) {
        if (i < 0) return 0;
        if (i == 0 || i == 1) return cost[i];

        if (dp[i] != -1) return dp[i];

        dp[i] = cost[i] + Math.min(
                solve(i - 1, cost, dp),
                solve(i - 2, cost, dp)
        );

        return dp[i];
    }

    public static int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n];
        Arrays.fill(dp, -1);

        return Math.min(
                solve(n - 1, cost, dp),
                solve(n - 2, cost, dp)
        );
    }
    public static void main(String[] args) {
        int[] cost = {10, 15, 20};
        System.out.println(minCostClimbingStairs(cost)); // Output: 15
    }
}
