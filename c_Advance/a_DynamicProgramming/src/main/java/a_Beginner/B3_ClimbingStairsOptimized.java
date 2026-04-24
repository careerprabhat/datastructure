package a_Beginner;

public class B3_ClimbingStairsOptimized {
    public static int climbStairs(int n) {
        if (n <= 1) return 1;

        int prev2 = 1; // f(0)
        int prev1 = 1; // f(1)

        for (int i = 2; i <= n; i++) {
            int curr = prev1 + prev2;
            prev2 = prev1;
            prev1 = curr;
        }

        return prev1;
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(5)); // Output: 8
    }
}
