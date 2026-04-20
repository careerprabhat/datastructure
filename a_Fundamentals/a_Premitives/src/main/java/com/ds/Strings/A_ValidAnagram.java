package com.ds.Strings;

public class A_ValidAnagram {
    public static void main(String[] args) {
        String s = "anag";
        String t = "naga";
        System.out.println(isAnagram(s, t));
    }

    public static boolean isAnagram(String source, String target) {
        if (source.length() != target.length()) {
            return false;
        }
        int[] count = new int[26];// Array to count occurrences of each letter
        for (int i = 0; i < source.length(); i++) {

            count[source.charAt(i) - 'a']++;// Increment the count for the character in the source string
          //  System.out.println("i: " + i + ", incrementing count[" + (source.charAt(i) - 'a') + "] to " + count[source.charAt(i) - 'a']);
            count[target.charAt(i) - 'a']--;// Decrement the count for the character in the target string
         //   System.out.println("Source char: " + source.charAt(i) + ", Target char: " + target.charAt(i));
      //      System.out.println(count[source.charAt(i)-'a'] + "->" + count[target.charAt(i) - 'a']);
        }
        for (int c : count) {
            if (c != 0) {
                return false;
            }
        }
        return true;
    }
}
