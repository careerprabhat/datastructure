package com.ds.a_char;

public class A_IncreaseCharByOne {
    public static void main(String[] args) {
        char[] chars = {'A', 'B', 'C', 'D', 'E'};

        for (int i = 0; i < chars.length; i++) {
            chars[i] = (char) (chars[i] + 1); // Incrementing the character by 1
        }

        // Print the modified array
        System.out.print("Modified array: ");
        for (char c : chars) {
            System.out.print(c + " ");  // Output: B C D E F
        }
    }
}
