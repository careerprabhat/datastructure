package com.ds.n_square;

public class A_BubbleSort {
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-i-1; j++){//important <arr.length-i-1
                if(arr[j]>arr[j+1]){
                    //swap arr[j] and arr[j+1]
                    swap(arr, j, j+1);
                }
            }
        }
        System.out.println("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
