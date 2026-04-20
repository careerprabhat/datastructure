package com.ds.A_Numbers;

public class A_SwapTwoNumbersWithoutTemp {
    public static void main(String[] args) {
        int i=10;
        int j=20;
        System.out.println("Before swap: i = " + i + ", j = " + j);
        i = i + j;
        j = i - j;
        i = i - j;
        System.out.println("After swap: i = " + i + ", j = " + j);
    }
}
