package a_Beginner;

import java.util.Arrays;

public class A_FibonacciMemoization {

    public static int fib(int n, int[] dp) {
        System.out.println("Calculating fib(" + n + ")"+ "\t DP Array: " + Arrays.toString(dp));
        if (n <= 1) return n;

        if (dp[n] != -1) return dp[n];

        dp[n] = fib(n - 1, dp) + fib(n - 2, dp);
        return dp[n];
    }

    public static void main(String[] args) {
        int n = 5;
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);

        System.out.println(fib(n, dp)); // Output: 5
        System.out.println("DP Array: " + Arrays.toString(dp)); // Print the dp array for visualization
    }
}
