package daily.easy;

public class MinCostClimbingStairs {
    /**
     * You are given an integer array cost where cost[i] is the cost of ith step on a staircase.
     * Once you pay the cost, you can either climb one or two steps.
     * <p>
     * You can either start from the step with index 0, or the step with index 1.
     * <p>
     * Return the minimum cost to reach the top of the floor.
     *
     * @param cost an integer array cost where cost[i] is the cost of ith step on a staircase.
     * @return the minimum cost to reach the top of the floor.
     */
    public int minCostClimbingStairs(int[] cost) {

        int noOfSteps = cost.length;
//        Initialize an array dp of length n + 1, where n is the length of the cost array.
//        Each element dp[i] will store the minimum cost to reach the i-th step.
        int[] dp = new int[noOfSteps + 1];


        // Start iterating from the 2nd step (index 2) to the n-th step.
        for (int index = 2; index <= noOfSteps; index++) {
//             For each step i, calculate the cost of reaching it from the previous step (i - 1) and from two steps back (i - 2).
            dp[index] = Math.min(dp[index - 2] + cost[index - 2], dp[index - 1] + cost[index - 1]);

        }
        return dp[noOfSteps];
    }
}
