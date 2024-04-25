package daily.medium;

import java.util.Arrays;

public class LongestIdealSubsequence {
    /**
     * You are given a string s consisting of lowercase letters and an integer k. We call a string t ideal if the following conditions are satisfied:
     * <p>
     * t is a subsequence of the string s.
     * The absolute difference in the alphabet order of every two adjacent letters in t is less than or equal to k.
     * Return the length of the longest ideal string.
     * <p>
     * A subsequence is a string that can be derived from another string by deleting some or no characters without changing the order of the remaining characters.
     * <p>
     * Note that the alphabet order is not cyclic. For example, the absolute difference in the alphabet order of 'a' and 'z' is 25, not 1.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: s = "acfgbd", k = 2
     * Output: 4
     * Explanation: The longest ideal string is "acbd". The length of this string is 4, so 4 is returned.
     * Note that "acfgbd" is not ideal because 'c' and 'f' have a difference of 3 in alphabet order.
     * Example 2:
     * <p>
     * Input: s = "abcd", k = 3
     * Output: 4
     * Explanation: The longest ideal string is "abcd". The length of this string is 4, so 4 is returned.
     * <p>
     * <p>
     * Constraints:
     * <p>
     * 1 <= s.length <= 10^5
     * 0 <= k <= 25
     * s consists of lowercase English letters.
     *
     * @param s
     * @param k
     * @return
     */
    private int solveMemo(String s, int idx, int k, int[][] dp, char ch) {
        // Base Case
        if (idx >= s.length()) {
            return 0;
        }

        // step-2 => if already calculated just return it
        if (dp[idx][ch] != -1) {
            return dp[idx][ch];
        }

        // step-3 => if not calculated yet just calculate it and return
        int take = 0;
        int nontake = 0;
        // Case of take it
        if (Math.abs(ch - s.charAt(idx)) <= k || ch == '#') {
            take = 1 + solveMemo(s, idx + 1, k, dp, s.charAt(idx));
        }
        // case of leave it
        nontake = solveMemo(s, idx + 1, k, dp, ch);

        return dp[idx][ch] = Math.max(take, nontake);
    }


    public int longestIdealString(String s, int k) {
        // DP + Memoization
        int[][] dp = new int[s.length() + 1][130];
        for (int[] d : dp) {
            Arrays.fill(d, -1);
        }
        return solveMemo(s, 0, k, dp, '#');


        // DP + Tabulation
        // int res = 0;
        // int[] dp = new int[150];
        // for (int i = 0; i < s.length(); i++) {
        //     int asci = s.charAt(i);
        //     for (int j = asci - k; j <= asci + k; j++) {
        //         dp[asci] = Math.max(dp[asci], dp[j]);
        //     }
        //     res = Math.max(res, ++dp[asci]);
        // }
        // return res;
    }
}
