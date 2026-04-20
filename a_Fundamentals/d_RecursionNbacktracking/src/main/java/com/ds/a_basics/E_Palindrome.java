package com.ds.a_basics;

public class E_Palindrome {
    public static void main(String[] args) {
        String str = "madam";
        System.out.println(isPalindrome(str, 0, str.length() - 1));

    }

    public static boolean isPalindrome(String str, int left, int right) {
        if (left >= right) return true; // Base case: if pointers meet or cross, it's a palindrome
        if (str.charAt(left) != str.charAt(right)) return false; // If characters don't match, it's not a palindrome
        return isPalindrome(str, left + 1, right - 1); // Recursive case: move inward
    }
}
