package a_Beginner;

/**
 * Problem 9: Unique Paths
 *
 * 👉 You are given a grid of size m x n
 *
 * 👉 You start at top-left (0,0)
 * 👉 You need to reach bottom-right (m-1, n-1)
 *
 * 👉 You can only move:
 *
 * Right →
 * Down ↓
 *
 * 👉 Return the number of unique paths
 *
 * m = 3, n = 3
 * S → →
 * ↓    ↓
 * ↓ →  E
 * 👉 Output = 6
 *
 * 1  1  1
 * 1  ?  ?
 * 1  ?  ?
 *
 *
 * 1  1  1
 * 1  2  3
 * 1  3  6
 */
public class G_UniquePaths {
    public static int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];

        // Initialize first row & column
        for (int i = 0; i < m; i++) dp[i][0] = 1;
        for (int j = 0; j < n; j++) dp[0][j] = 1;

        // Fill rest
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }

        return dp[m-1][n-1];
    }

    public static void main(String[] args) {
        System.out.println(uniquePaths(3, 3));//6
    }

}
