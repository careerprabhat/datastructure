package a_Arrays;

import java.util.Arrays;

public class B_MinJumpGame {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 1, 4, 1};
        Arrays.stream(arr).forEach(i -> System.out.print(i + " "));
        System.out.println();
        System.out.println(minJumps(arr)); // Output: 2
    }

    public static int minJumps(int[] arr) {
        if (arr == null || arr.length == 0) {
            return -1; // No jumps needed for an empty array
        }

        int jumps = 0; // Tracks the total jumps made.
        int currentEnd = 0; // The farthest index reachable with the current number of jumps.
        int farthest = 0;   // The maximum index reachable from any position in the current range.

        for (int i = 0; i < arr.length - 1; i++) {//2,3,1,1,4
            farthest = Math.max(farthest, (i + arr[i]));//2,4,8
            System.out.println("i: " + i + ", arr[i]: " + arr[i] + ", farthest: " + farthest + ", currentEnd: " + currentEnd + ", jumps: " + jumps);
            if (i == currentEnd) {
                jumps++;
                currentEnd = farthest;

                if (currentEnd >= arr.length - 1) {
                    break; // We can reach or exceed the end of the array
                }
            }
        }

        return jumps;
    }
}
