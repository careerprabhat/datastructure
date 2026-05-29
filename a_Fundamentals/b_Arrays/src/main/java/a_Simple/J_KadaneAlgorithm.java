package a_Simple;

/**
 * Kadane's Algorithm is a popular algorithm used to find the maximum sum of a contiguous subarray within a one-dimensional array of numbers. It is an efficient way to solve the problem of finding the maximum subarray sum in linear time.
 * The algorithm works by iterating through the array and keeping track of the current sum of the subarray. If the current sum becomes negative, it resets to zero, as a negative sum would not contribute to a maximum sum in future iterations. The algorithm also keeps track of the maximum sum encountered so far.
 * The time complexity of Kadane's Algorithm is O(n), where n is the number of elements in the array, making it an efficient solution for this problem.
 * Example:
 * Input: arr = [-2,1,-3,4,-1,2,1,-5,4]
 * Output: 6
 * Explanation: The contiguous subarray [4,-1,2,1] has the largest sum = 6.
 * CurrentSum=max(arr[i],CurrentSum+arr[i])
 * MaxSoFar=max(MaxSoFar,CurrentSum)
 *
 */
public class J_KadaneAlgorithm {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int maxSum = kadane(arr);
        System.out.println("Maximum subarray sum is: " + maxSum); // Output: 6
    }

    public static int kadane(int[] arr) {
        int maxSoFar = arr[0];
        int maxEndingHere = arr[0];

        for (int i = 1; i < arr.length; i++) {
            maxEndingHere = Math.max(arr[i], maxEndingHere + arr[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }

        return maxSoFar;
    }
}
