package com.ds.Strings;

public class A_SimplifyArrayIncrement {
    public static void main(String[] args) {
        //array for char
        char[] arr = {'a', 'b', 'c', 'd', 'e'};
        int[]letters = new int[26];// Array to count occurrences of each letter
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Before incrementing: " + arr[i]);
                arr[i]++; // Increment each character by 1 using the increment operator
            System.out.println("After incrementing: " + arr[i]);

            System.out.println("Before incrementing1: " + arr[i]);
            letters[i-'a']++; // Increment each character by 1 using the increment operator
            System.out.println("After incrementing1: " + letters[i]);


            //arr[i] = (char) (arr[i] + 1); // Increment each character by 1
        }
        // Print the modified array
        for (char c : arr) {
            System.out.print(c + " ");  // Output: b c d e f
        }
    }
}
