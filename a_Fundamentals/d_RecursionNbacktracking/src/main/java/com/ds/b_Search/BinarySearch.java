package com.ds.b_Search;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int target = 3;
        int index = recursiveBinarySearch(arr, 0,arr.length-1,target);
        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found in the array.");
        }
    }

    public static int recursiveBinarySearch(int[] arr, int left, int right, int target) {
        //recursive approach
        if (left > right) return -1; // Base case: target not found

        int mid = left + (right - left) / 2; // To avoid overflow

        if (arr[mid] == target) {
            return mid; // Return the index of the target element
        } else if (arr[mid] < target) {
            return recursiveBinarySearch(arr, target, mid + 1, right); // Search in the right half
        } else {
            return recursiveBinarySearch(arr, target, left, mid - 1); // Search in the left half
        }
    }

}
