package b_Medium;

/**
 * Problem: Given an array of non-negative integers where each element represents the maximum jump length at that position, determine if you can reach the last index starting from the first index.
 * Example:
 * Input: [2, 3, 1, 1, 4]
 *
 * Output: true
 * Explanation: Jump 1 step from index 0 to 1, then 3 steps from index 1 to the last index.
 * Approach:
 * 1. Initialize a variable `maxReach` to keep track of the farthest index that can be reached.
 * 2. Iterate through the array, and for each index `i`, check if it is greater than `maxReach`. If it is, return false because it means we cannot reach this index.
 * 3. Update `maxReach` to be the maximum of its current value and `i + jumps[i]`, which represents the farthest index that can be reached from index `i`.
 * 4. If we finish iterating through the array without returning false, it means we can reach the last index, so return true.
 */
public class A_JumpFarthest {
    public static void main(String[] args) {
        int[] jumps = {2, 3, 1, 1, 4};
        System.out.println(canJump(jumps)); // Output: true
    }

    public static boolean canJump(int[] jumps) {
        int maxReach = 0;
        for (int i = 0; i < jumps.length; i++) {
            if (i > maxReach) {
                return false;
            }
            maxReach = Math.max(maxReach, i + jumps[i]);
        }
        return true;
    }
}
