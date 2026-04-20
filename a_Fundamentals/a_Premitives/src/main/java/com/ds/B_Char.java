package com.ds;

public class B_Char {
    public static void main(String[] args) {
        char c1 = 'A';
        char c2 = 65; // ASCII value of 'A'
        char c3 = '\u0041'; // Unicode representation of 'A'

        System.out.println("c1: " + c1); // Output: A
        System.out.println("c2: " + c2); // Output: A
        System.out.println("c3: " + c3); // Output: A

        // Demonstrating that char can be used in arithmetic operations
        char c4 = (char) (c1 + 1); // This will give 'B'
        System.out.println("c4: " + c4); // Output: B
    }
}
