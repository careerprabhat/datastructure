package a_Arrays;

public class A_MergeSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8};
        int[] mergedArray = mergeSortedArrays(arr1, arr2);

        // Print the merged array
        for (int num : mergedArray) {
            System.out.print(num + " ");
        }
    }

    public static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
        int[] merged = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;

        // Merge the two arrays
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                merged[k++] = arr1[i++];
            } else {
                merged[k++] = arr2[j++];
            }
        }

        // If there are remaining elements in arr1
        while (i < arr1.length) {
            merged[k++] = arr1[i++];
        }

        // If there are remaining elements in arr2
        while (j < arr2.length) {
            merged[k++] = arr2[j++];
        }

        return merged;
    }
}