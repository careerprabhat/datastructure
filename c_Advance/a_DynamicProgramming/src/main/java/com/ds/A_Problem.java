package com.ds;

public class A_Problem {

    public static long fibNaive(int n) {
        if (n <= 1) return n;
        return fibNaive(n-1) + fibNaive(n-2);
    }

    public static long fibMemo(int n) {
        Long[] cache = new Long[n+1];
        return fibMemoHelper(n, cache);
    }

    private static long fibMemoHelper(int n, Long[] cache) {
        if (cache[n] != null) return cache[n];
        if (n <= 1) {
            cache[n] = (long) n;
            return cache[n];
        }
        cache[n] = fibMemoHelper(n-1, cache) + fibMemoHelper(n-2, cache);
        return cache[n];
    }

    public static void main(String[] args) {
        
    }
}
