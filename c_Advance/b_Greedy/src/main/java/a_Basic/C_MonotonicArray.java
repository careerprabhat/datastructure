package a_Basic;

public class C_MonotonicArray {
    public static void main(String[] args) {
        // Greedy approach: Check if the array is either non-increasing or non-decreasing
        int[] arr = {1, 2, 2, 3};
        boolean isMonotonic = true;
        boolean increasing = true;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                increasing = false; // Not increasing
            }
            if (arr[i] > arr[i - 1]) {
                isMonotonic = false; // Not non-decreasing
            }
        }
        System.out.println("Is the array monotonic? " + isMonotonic);
        System.out.println("Is the array increasing? " + increasing);
    }
}
