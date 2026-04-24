package a_Beginner;

import java.util.Arrays;

public class A_FibonacciTabulation {
    public static int fib(int n) {
        if (n <= 1) return n;

        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        Arrays.stream(dp).forEach(x -> System.out.print(x + " ")); // Print the dp array for visualization
        System.out.println();

        return dp[n];
    }

    public static void main(String[] args) {
        System.out.println(fib(5)); // Output: 5
    }
}
