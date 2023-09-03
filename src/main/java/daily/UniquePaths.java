package daily;

public class UniquePaths {
    /**
     * There is a robot on an m x n grid. The robot is initially located at the top-left corner (i.e., grid[0][0]).
     * The robot tries to move to the bottom-right corner (i.e., grid[m - 1][n - 1]). The robot can only move either down or right
     * at any point in time.
     * <p>
     * Given the two integers m and n, return the number of possible unique paths that the robot can take to reach the bottom-right corner.
     * <p>
     * The test cases are generated so that the answer will be less than or equal to 2 * 10**9.
     *
     * @param m - rows.
     * @param n - columns.
     * @return number of possible unique path.
     */
    public int uniquePaths(int m, int n) {

        long ans = 1;
        for (int i = 1; i <= m - 1; i++) {
            ans = ans * (n - 1 + i) / i;
        }
        return (int) ans;
    }

}
