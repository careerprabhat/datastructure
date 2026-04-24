package a_Beginner;

/**
 * Problem: Min Cost Climbing Stairs
 * 👉 You are given an array cost[] where:
 * Cost = [1,100, 1, 1, 1,100, 1, 1, 100, 1]
 * index   0  1   2  3  4  5   6  7   8  9
 */
public class C_MinCostOptimized {
    public static int minCostClimbingStairs(int[] cost) {
        int n = cost.length;

        int prev2 = cost[0];
        int prev1 = cost[1];

        for (int i = 2; i < n; i++) {
            int curr = cost[i] + Math.min(prev1, prev2);
            prev2 = prev1;
            prev1 = curr;
        }

        return Math.min(prev1, prev2);
    }

    public static void main(String[] args) {
        //int[] cost = {10, 15, 20};
        int[] cost = {1,100, 1, 1, 1,100, 1, 1, 100, 1};
        System.out.println(minCostClimbingStairs(cost)); // Output: 15
    }
}
