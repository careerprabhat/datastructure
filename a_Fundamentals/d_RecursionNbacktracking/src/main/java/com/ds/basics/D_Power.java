package com.ds.basics;

public class D_Power {
    public static void main(String[] args) {
        double x = 2.0;
        int n = 10;
        System.out.println(myPow(x, n));
    }

    public static double myPow(double x, int n) {
        if (n == 0) return 1; // Base case: any number to the power of 0 is 1
        if (n < 0) {
            x = 1 / x; // Invert x for negative powers
            n = -n;    // Make n positive
        }
        double half = myPow(x, n / 2); // Recursive call for half the exponent
        if (n % 2 == 0) {
            return half * half; // If n is even, return half squared
        } else {
            return half * half * x; // If n is odd, multiply by x one more time
        }
    }
}
