package com.ds.Strings;

public class A_SimplifyArrayIncrement {
    public static void main(String[] args) {
        // Array of characters to increment
        char[] arr = {'a', 'b', 'c', 'd', 'e'};
        // Array to count occurrences of each letter (26 for a-z)
        int[] letters = new int[26];

        for (int i = 0; i < arr.length; i++) {
            char original = arr[i];
            arr[i]++; // Increment each character by 1
            letters[arr[i] - 'a']++; // Count the incremented character
            System.out.println("Char: " + original + " -> " + arr[i] + ", count: " + letters[arr[i] - 'a']);
        }

        // Print the modified array
        System.out.print("Modified array: ");
        for (char c : arr) {
            System.out.print(c + " ");  // Output: b c d e f
        }
        System.out.println();
    }
}
