package a_Beginner;

import java.util.Arrays;

/**
 * Coin Change Problem:
 * Given a set of coin denominations and a total amount, determine the number of ways to make the amount using the given denominations.
 * Example:
 * Coin denominations: [1, 2, 3]
 * Total amount: 4
 * Output: 4
 * Explanation: The combinations are:
 * 1. 1 + 1 + 1 + 1
 * 2. 1 + 1 + 2
 * 3. 1 + 3
 * 4. 2 + 2
 */
public class E_CoinChange {
    public static int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];

        Arrays.fill(dp, amount + 1); // treat as infinity
        dp[0] = 0;

        for (int i = 1; i <= amount; i++) {
            for (int coin : coins) {
                if (i - coin >= 0) {
                    dp[i] = Math.min(dp[i], 1 + dp[i - coin]);
                }
            }
        }

        return dp[amount] > amount ? -1 : dp[amount];
    }

    public static void main(String[] args) {
        int[] coins = {3, 2, 5};
        int amount = 7;
        System.out.println("Number of ways to make amount " + amount + " with coins " + java.util.Arrays.toString(coins) + ": " + coinChange(coins, amount)); // Output: 4
    }
}
