package a_Beginner;

/**
 * nums = [1, 2, 3, 3]
 * target = 6
 *
 * [1,2,3]
 * [1,2,3]   (second 3)
 * [3,3]
 *
 *
 */
public class L_CountSubsets {
    public static int countSubsets(int[] nums, int target) {
        int[] dp = new int[target + 1];

        dp[0] = 1;

        for (int num : nums) {
            for (int t = target; t >= num; t--) {
                dp[t] += dp[t - num];
            }
        }

        return dp[target];
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 3};
        int target = 6;

        System.out.println(countSubsets(nums, target)); // Output: 3
    }
}
