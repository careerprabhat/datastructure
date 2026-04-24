package a_Beginner;

public class A_FibonacciRecursive {
    public static void main(String[] args) {
        int n = 10;
        System.out.println("Fibonacci of " + n + " is: " + fib(n)); // Output: 55
    }

    private static int fib(int n) {
        if (n <= 1) return n;
        return fib(n - 1) + fib(n - 2);
    }
}
