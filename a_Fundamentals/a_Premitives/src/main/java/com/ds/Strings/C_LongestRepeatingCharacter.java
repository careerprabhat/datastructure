package com.ds.Strings;

public class C_LongestRepeatingCharacter {
    public static void main(String[] args) {
        String str = "aaabbcaaa";
        int maxLength = longestRepeatingCharacter(str);
        System.out.println("Longest repeating character length: " + maxLength);
    }

    public static int longestRepeatingCharacter(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }

        int maxLength = 1;
        int currentLength = 1;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                currentLength++;
            } else {
                maxLength = Math.max(maxLength, currentLength);
                currentLength = 1;
            }
        }

        // Check for the last sequence of characters
        maxLength = Math.max(maxLength, currentLength);

        return maxLength;
    }
}
