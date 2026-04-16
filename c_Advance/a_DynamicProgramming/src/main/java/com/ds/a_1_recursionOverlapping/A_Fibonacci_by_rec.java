package com.ds.a_1_recursionOverlapping;
/**
 * Fibonacci sequence is a series of numbers where each number is the sum of the two preceding ones, usually starting with 0 and 1. The Fibonacci sequence can be defined as follows:
 * Calculating fib(5)
 * Calculating fib(4)
 * Calculating fib(3)
 * Calculating fib(2)
 * Calculating fib(2)
 * Calculating fib(3)
 * Calculating fib(2)
 *
 * fib(5)
 * ├── fib(4)
 * │   ├── fib(3)
 * │   │   ├── fib(2)
 * │   │   │   ├── fib(1) → 1
 * │   │   │   └── fib(0) → 0
 * │   │   └── fib(1) → 1
 * │   └── fib(2)
 * │       ├── fib(1) → 1
 * │       └── fib(0) → 0
 * └── fib(3)
 *     ├── fib(2)
 *     │   ├── fib(1) → 1
 *     │   └── fib(0) → 0
 *     └── fib(1) → 1
 * 5

 */
public class A_Fibonacci_by_rec {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(fib(n));

    }

    public static int fib(int n) {
        if (n <= 1) return n;// Base cases: fib(0) = 0, fib(1) = 1
        System.out.println("Calculating fib(" + n + ")"); // Print statement to show the current calculation
        return fib(n - 1) + fib(n - 2); // Recursive calls for fib(n-1) and fib(n-2)
    }
}
