package com.ds.n_times;

import java.util.Arrays;

public class CountingSort {
    public static void main(String[] args) {
        int[] arr = {55, 4, 2, 2, 8, 3, 3, 1,};
        countingSort(arr);
        System.out.println("\nSorted array");
        Arrays.stream(arr).forEach(num -> System.out.print(num + " "));
    }

    public static void countingSort(int[] arr) {
        int max = findMax(arr);
        int[] count = new int[max + 1];
        for (int num : arr) {
            System.out.println("num: " + num);
            count[num]++;
        }
        System.out.println("Just count array");
        Arrays.stream(count).forEach(num -> System.out.print(num + " "));

        int index = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[index++] = i;
                count[i]--;
            }
        }
    }

    private static int findMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}
