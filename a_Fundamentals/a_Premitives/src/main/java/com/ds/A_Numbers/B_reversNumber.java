package com.ds.A_Numbers;

public class B_reversNumber {
    public static void main(String[] args) {
        int number = 12345;
        int reversed = reverseNumber(number);
        System.out.println("Original number: " + number);
        System.out.println("Reversed number: " + reversed);
    }

    public static int reverseNumber(int num) {
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10; // Get the last digit
            reversed = (reversed * 10) + digit; // Append the digit to the reversed number
            num /= 10; // Remove the last digit
        }
        return reversed;
    }
}
