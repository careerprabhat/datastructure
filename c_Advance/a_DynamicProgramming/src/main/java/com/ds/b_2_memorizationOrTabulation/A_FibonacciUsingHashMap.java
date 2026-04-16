package com.ds.b_2_memorizationOrTabulation;

import java.util.Map;

public class A_FibonacciUsingHashMap {
    static Map<Integer, Integer> memo = new java.util.HashMap<>();
    public static void main(String[] args) {
        int n = 10;
        System.out.println(fibonacci(n));

        memo.entrySet().forEach((x) -> System.out.println("Fibonacci(" + x.getKey() + ") = " + x.getValue()));
    }

    private static int fibonacci(int n) {
        if (n <= 1) return n;
        if (memo.containsKey(n)) return memo.get(n);
        int result = fibonacci(n - 1) + fibonacci(n - 2);
        memo.put(n, result);
        return result;
    }


}
