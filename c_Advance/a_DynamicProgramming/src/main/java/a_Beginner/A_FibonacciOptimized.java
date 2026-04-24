package a_Beginner;

/**
 * Fibonacci Sequence: 1, 1, 2, 3, 5, 8, 13, ...
 * F(0) = 0
 * F(1) = 1
 * F(n) = F(n-1) + F(n-2)
 *
 * Problem: recursive approach to calculate the nth Fibonacci number.
 * public static int fib(int n) {
 *         if (n <= 1) return n;
 *         return fib(n - 1) + fib(n - 2);
 *     }
 */
public class A_FibonacciOptimized {

    public static int fib(int n) {
        if (n <= 1) return n;

        int prev2 = 0; // F(0)
        int prev1 = 1; // F(1)

        for (int i = 2; i <= n; i++) {
            int curr = prev1 + prev2;
            prev2 = prev1;
            prev1 = curr;
        }

        return prev1;
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println("Fibonacci of " + n + " is: " + fib(n)); // Output: 55
    }



}
