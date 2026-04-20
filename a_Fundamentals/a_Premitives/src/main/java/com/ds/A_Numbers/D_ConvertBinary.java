package com.ds.A_Numbers;

public class D_ConvertBinary {
    public static void main(String[] args) {
        System.out.println("Binary representation of 10 is: " + Integer.toBinaryString(10));
        System.out.println("Binary representation of -10 is: " + Integer.toBinaryString(-10));

        System.out.println("Binary representation of 10 using custom method is: " + toBinaryString(10));
    }

    public static String toBinaryString(int number) {
        StringBuilder binary = new StringBuilder();
        for (int i = 31; i >= 0; i--) {
            System.out.println("i: " + i + ", (number >> i): " + (number >> i) + ", (number >> i) & 1: " + ((number >> i) & 1));
            binary.append((number >> i) & 1);
        }
        return binary.toString();
    }
}
