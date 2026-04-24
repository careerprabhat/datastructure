package a_Beginner;

public class B_ClimbingStairsRecursive {

    public static int climbStairs(int n) {
        if (n <= 0) return 0;
        if (n == 1) return 1;
        if (n == 2) return 2;

        return climbStairs(n - 1) + climbStairs(n - 2);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Number of ways to climb " + n + " stairs: " + climbStairs(n)); // Output: 8
    }
}
