package hard;

public class NumberOfWays {

    /**
     * You have a pointer at index 0 in an array of size arrLen.
     * At each step, you can move 1 position to the left, 1 position to the right in the array,
     * or stay in the same place (The pointer should not be placed outside the array at any time).
     * <p>
     * Given two integers steps and arrLen, return the number of ways such that your pointer is still at index 0 after exactly steps steps.
     * Since the answer may be too large, return it modulo 10^9 + 7.
     *
     * @param steps  number of steps allowed.
     * @param arrLen array length.
     * @return the number of ways such that your pointer is still at index 0
     * <p>
     * Example 1:
     * <p>
     * Input: steps = 3, arrLen = 2
     * Output: 4
     * Explanation: There are 4 different ways to stay at index 0 after 3 steps.
     * Right, Left, Stay
     * Stay, Right, Left
     * Right, Stay, Left
     * Stay, Stay, Stay
     * <p>
     * <p>
     * Example 2:
     * <p>
     * Input: steps = 2, arrLen = 4
     * Output: 2
     * Explanation: There are 2 different ways to stay at index 0 after 2 steps
     * Right, Left
     * Stay, Stay
     */

    public int numWays(int steps, int arrLen) {
        final int kMod = 1_000_000_007; // Define a modulus value to avoid integer overflow.
        final int n = Math.min(arrLen, steps / 2 + 1); // Calculate the number of positions we need to consider.
        // dp[i] := # of ways to stay on index i
        long[] dp = new long[n]; // Create an array to store the number of ways to stay at each position.
        dp[0] = 1; // Initialize the number of ways to stay at position 0 after 0 steps to 1.

        while (steps-- > 0) { // Loop through each step.
            long[] newDp = new long[n]; // Create a new array to store updated values for each position.
            for (int i = 0; i < n; ++i) { // Iterate through each position.
                newDp[i] = dp[i]; // Initialize with the number of ways to stay at the same position in the previous step.
                if (i - 1 >= 0)
                    newDp[i] += dp[i - 1]; // Add the number of ways to reach the current position by moving left.
                if (i + 1 < n)
                    newDp[i] += dp[i + 1]; // Add the number of ways to reach the current position by moving right.
                newDp[i] %= kMod; // Take the modulo to avoid integer overflow.
            }
            dp = newDp; // Update dp with the newDp array for the next step.
        }

        return (int) dp[0]; // The final result is stored in dp[0], representing the number of ways to reach the initial position after taking the specified number of steps.
    }

}
