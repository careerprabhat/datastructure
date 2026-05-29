package b_Medium;

public class A_Minimumjumps {
    public static void main(String[] args) {
        //Greedy approach
        int[] arr = {2, 3, 1, 1, 4};
        int jumps = minJumps(arr);
        System.out.println("Minimum jumps to reach the end: " + jumps);
    }

    public static int minJumps(int[] arr) {
        int arrayLength = arr.length;
        if (arrayLength <= 1) return 0;
        if (arr[0] == 0) return -1;

        int jumps = 1;
        int maxReach = arr[0];// The farthest we can reach with the current number of jumps
        int steps = arr[0];// Number of steps we can still take

        for (int i = 1; i < arrayLength; i++) {
            if (i == arrayLength - 1) return jumps;

            maxReach = Math.max(maxReach, i + arr[i]);
            steps--;

            if (steps == 0) {
                jumps++;
                steps = maxReach - i;
            }
        }

        return -1;
    }


}
