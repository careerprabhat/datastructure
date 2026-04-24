package a_Beginner;

public class J_SubsetSum {
    public static boolean subsetSum(int[] nums, int target) {
        int n = nums.length;

        boolean[][] dp = new boolean[n + 1][target + 1];

        // Base case
        for (int i = 0; i <= n; i++) {
            dp[i][0] = true;
        }

        for (int i = 1; i <= n; i++) {
            for (int t = 1; t <= target; t++) {

                // Not pick
                dp[i][t] = dp[i - 1][t];

                // Pick
                if (nums[i - 1] <= t) {
                    dp[i][t] = dp[i][t] || dp[i - 1][t - nums[i - 1]];
                }
            }
        }

        return dp[n][target];
    }

    public static boolean subsetSum1(int[] nums, int target) {
        boolean[] dp = new boolean[target + 1];

        dp[0] = true;

        for (int num : nums) {
            for (int t = target; t >= num; t--) {
                dp[t] = dp[t] || dp[t - num];
            }
        }

        return dp[target];
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 7, 8, 10};
        int target = 11;

        System.out.println(subsetSum(nums, target)); // Output: true
        System.out.println("optimize"+subsetSum1(nums,target));
    }
}
