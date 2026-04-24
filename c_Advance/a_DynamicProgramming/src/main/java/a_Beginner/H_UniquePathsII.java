package a_Beginner;

/**
 * 👉 Same as before:
 *
 * Move only Right → or Down ↓
 *
 * 👉 But now:
 *
 * Some cells are blocked (1)
 * Free cells are 0
 *
 * 👉 Return number of ways to reach bottom-right
 * Step 1: Initialize
 * 1  1  1
 * 1  X  ?
 * 1  ?  ?
 *
 * 👉 X = obstacle → 0
 *
 * Step 2: Fill DP
 * 1  1  1
 * 1  0  1
 * 1  1  2
 *
 * 👉 Final Answer = 2
 */
public class H_UniquePathsII {
    public static int uniquePathsWithObstacles(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int[][] dp = new int[m][n];

        // Start cell
        if (grid[0][0] == 1) return 0;
        dp[0][0] = 1;

        // First column
        for (int i = 1; i < m; i++) {
            if (grid[i][0] == 0)
                dp[i][0] = dp[i - 1][0];
        }

        // First row
        for (int j = 1; j < n; j++) {
            if (grid[0][j] == 0)
                dp[0][j] = dp[0][j - 1];
        }

        // Fill rest
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {

                if (grid[i][j] == 1) {
                    dp[i][j] = 0; // obstacle
                } else {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                }
            }
        }

        return dp[m - 1][n - 1];
    }

    public static void main(String[] args) {
        int[][] grid = {
                {0,0,0},
                {0,1,0},
                {0,0,0}
        };

        System.out.println(uniquePathsWithObstacles(grid)); // Output: 2
    }
}
