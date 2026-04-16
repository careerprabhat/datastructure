package com.ds.b_2_memorizationOrTabulation;

public class B_FibonacciUsingHashArray {
    private static int n = 10;
    static int[] memo = new int[n + 1];
    public static void main(String[] args) {

        System.out.println(fibonacci(n)); // Output: 55
    }

    private static int fibonacci(int n) {
        if (n <= 1) return n;
        if (memo[n] != 0) return memo[n];
        memo[n] = fibonacci(n - 1) + fibonacci(n - 2);
        return memo[n];
    }
}
