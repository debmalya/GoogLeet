package daily.medium;

import java.util.Arrays;

public class MaximumNumber {
    /**
     * There are 3n piles of coins of varying size, you and your friends will take piles of coins as follows:
     * <p>
     * In each step, you will choose any 3 piles of coins (not necessarily consecutive).
     * Of your choice, Alice will pick the pile with the maximum number of coins.
     * You will pick the next pile with the maximum number of coins.
     * Your friend Bob will pick the last pile.
     * Repeat until there are no more piles of coins.
     * Given an array of integers piles where piles[i] is the number of coins in the ith pile.
     * <p>
     * Return the maximum number of coins that you can have.
     *
     * @param piles
     * @return
     */
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int j = piles.length - 1;
        int ans = 0;
        for (int i = 0; i < piles.length / 3; i++) {
            j--;
            ans += piles[j];
            j--;
        }
        return ans;
    }
}
