package a_Beginner;

/**
 * nums = [1, 5, 11, 5]
 * 20/2=11
 * subset sum = S / 2
 * Subset1 = [1, 5, 5] → sum = 11
 * Subset2 = [11]      → sum = 11
 */
public class K_EqualPartition {
    public static boolean canPartition(int[] nums) {
        int sum = 0;

        for (int num : nums) {
            sum += num;
        }

        // If sum is odd, cannot split
        if (sum % 2 != 0) return false;

        int target = sum / 2;

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
        int[] nums = {1, 5, 11, 5};
        System.out.println(canPartition(nums)); // Output: true
    }
}
