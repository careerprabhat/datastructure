package com.ds.a_char;

public class A_IntegerTest {
    public static void main(String[] args) {
        int[] arr = new int[26]; // Array to count occurrences of each letter (26 for a-z)
        char[] anagram1 = {'a', 'b', 'c', 'd', 'e','a'};

        for (int i = 0; i < anagram1.length; i++) {
            char original = anagram1[i];
            anagram1[i]++; // Increment each character by 1
            arr[anagram1[i] - 'a']++; // Count the incremented character
            System.out.println("Char: " + original + " -> " + anagram1[i] + ", count: " + arr[anagram1[i] - 'a']);
        }



    }
}
