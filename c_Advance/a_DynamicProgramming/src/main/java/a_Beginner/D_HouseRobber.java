package a_Beginner;

/**
 * Problem: House Robber
 * 🟢 Problem 4: House Robber
 * 👉 You are given an array nums[] where: nums[i] = money in house i
 * 👉 Constraint: You cannot rob two adjacent houses
 * 👉 Goal: Maximize the total money robbed
 * 🧠 Key Insight
 * At each house, you have two choices:
 * Rob it → then skip previous house
 * Skip it → take previous result
 * So: dp[i]=max(dp[i−1],nums[i]+dp[i−2])
 *
 * 🧪 Example
 * nums = [2, 7, 9, 3, 1]
 * 🪜 Dry Run (Step-by-Step)
 * Step 0 👉 dp[0] = 2
 * Step 1 👉 dp[1] = max(2, 7) = 7
 * Step 2 👉 dp[2] = max(7, 9 + 2) = max(7, 11) = 11
 * Step 3 👉 dp[3] = max(11, 3 + 7) = max(11, 10) = 11
 * Step 4 👉 dp[4] = max(11, 1 + 11) = max(11, 12) = 12
 * 🎯 Final Answer = 12
 * 🔍 Which houses did we rob?
 * Optimal selection:
 *
 * 2 + 9 + 1 = 12
 * (index 0, 2, 4)
 *
 * 👉 Notice:
 * We skipped adjacent houses
 * DP ensured maximum profit
 */
public class D_HouseRobber {
    public static int rob(int[] nums) {
        int n = nums.length; if (n == 1) return nums[0];

        int prev2 = nums[0];                // dp[i-2]
        int prev1 = Math.max(nums[0], nums[1]); // dp[i-1]

        for (int i = 2; i < n; i++) {
            int curr = Math.max(prev1, nums[i] + prev2);
            prev2 = prev1;
            prev1 = curr;
        }
        return prev1;
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 9, 3, 1};
        System.out.println(rob(nums)); // Output: 12
    }
}
