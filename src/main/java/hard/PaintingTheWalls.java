package hard;

import java.util.Arrays;

public class PaintingTheWalls {
    /**
     * You are given two 0-indexed integer arrays, cost and time, of size n representing the costs and the time taken
     * to paint n different walls respectively. There are two painters available:
     * <p>
     * A paid painter that paints the ith wall in time[i] units of time and takes cost[i] units of money.
     * <p>
     * A free painter that paints any wall in 1 unit of time at a cost of 0.
     * But the free painter can only be used if the paid painter is already occupied.
     *
     * @param cost 0-indexed integer array.
     * @param time 0-indexed integer array.
     * @return the minimum amount of money required to paint the n walls.
     */
    public int paintWalls(int[] cost, int[] time) {
        int n = cost.length; // Get the number of walls
        int[] dp = new int[n + 1]; // Create a dynamic programming array to store the minimum cost
        Arrays.fill(dp, (int) 1e9); // Initialize the array with a very large value (effectively infinity)
        dp[0] = 0; // The minimum cost to paint 0 walls is 0 (base case)

        // Loop through each wall
        for (int i = 0; i < n; ++i) {
            // Loop through the dynamic programming array in reverse order
            for (int j = n; j > 0; --j) {
                // Calculate the minimum cost to paint 'j' walls using the current wall 'i'
                // The minimum cost at 'j' is the minimum of:
                //   - The cost of painting the current wall 'i' + the cost of painting the previous walls (dp[j - time[i] - 1])
                //   - The cost of painting the previous walls without using the current wall 'i' (dp[j])
                dp[j] = Math.min(dp[j], dp[Math.max(j - time[i] - 1, 0)] + cost[i]);
            }
        }
        return dp[n]; // The minimum cost to paint all 'n' walls is stored in dp[n]
    }
}
