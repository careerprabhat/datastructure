package a_Arrays;

import java.util.Arrays;

public class C_ContainDuplicate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 1, 9};
        System.out.println(containsDuplicate(arr));
    }

    public static boolean containsDuplicate(int[] arr) {
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++) {
            if (arr[i] == arr[i + 1]) {
                return true;
            }
        }
        return false;
    }
}
