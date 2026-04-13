package com.ds.basics;

public class A_PrintMyName {
    public static void main(String[] args) {
        printMyName(5);
    }

    public static void printMyName(int i) {
        if (i == 0) return; // Base case: stop when n is 0 or negative
        System.out.println("My name is DS "+ i); // Print the name
        printMyName(--i); // Recursive call with decremented n
    }
}
