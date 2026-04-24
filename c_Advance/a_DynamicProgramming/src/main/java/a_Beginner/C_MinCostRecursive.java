package a_Beginner;

/**
 * Problem: Min Cost Climbing Stairs
 * 👉 You are given an array cost[] where:
 *
 * cost[i] = cost of stepping on stair i
 *
 * 👉 You can:
 *
 * Start from step 0 or 1
 * Move 1 or 2 steps
 *
 * 👉 Return the minimum cost to reach the top (beyond last index)
 *
 */
public class C_MinCostRecursive {
    public static int solve(int i, int[] cost) {
        if (i < 0) return 0;
        if (i == 0 || i == 1) return cost[i];

        return cost[i] + Math.min(solve(i - 1, cost), solve(i - 2, cost));
    }

    public static int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        return Math.min(solve(n - 1, cost), solve(n - 2, cost));
    }

    public static void main(String[] args) {
        int[] cost = {10, 15, 20};
        System.out.println(minCostClimbingStairs(cost)); // Output: 15
    }
}
