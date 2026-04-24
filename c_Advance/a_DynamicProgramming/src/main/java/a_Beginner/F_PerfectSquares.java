package a_Beginner;

public class F_PerfectSquares {
    public static int numSquares(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 0;
        for (int i = 1; i <= n; i++) {
            dp[i] = i; // Maximum squares needed is i (1^2 + 1^2 + ... + 1^2)
            for (int j = 1; j * j <= i; j++) {
                dp[i] = Math.min(dp[i], dp[i - j * j] + 1);
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        int n = 12;
        System.out.println("Minimum number of perfect squares that sum to " + n + ": " + numSquares(n)); // Output: 3
    }
}
