package com.ds.basics;

public class C_Fibonacci {
    public static void main(String[] args) {
        int n=5;
        System.out.println(fibonacci(n));
    }

    public static int fibonacci(int n) {
        if(n<=1)  return 1; // Base case: fib(0) = 0, fib(1) = 1
        return fibonacci(n-1)+fibonacci(n-2); // Recursive case: fib(n) = fib(n-1) + fib(n-2)
    }
}
