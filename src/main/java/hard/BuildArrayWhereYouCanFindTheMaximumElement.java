package hard;

public class BuildArrayWhereYouCanFindTheMaximumElement {
    /**
     * You are given three integers n, m and k.
     * Consider the following algorithm to find the maximum element of an array of positive integers:
     * <p>
     * maximum_value = -1
     * maximum_index = -1
     * n = arr.length
     * search_cost = 0
     * for (i = 0; i < n; i++){
     * if (arr[i] > maximum_value){
     * maximum_value = arr[i]
     * maximum_index = i
     * search_cost = search_cost + 1
     * }
     * }
     * <p>
     * You should build the array arr which has the following properties:
     * <p>
     * arr has exactly n integers.
     * 1 <= arr[i] <= m where (0 <= i < n).
     * After applying the mentioned algorithm to arr, the value search_cost is equal to k.
     * Return the number of ways to build the array arr under the mentioned conditions.
     * As the answer may grow large, the answer must be computed modulo 10^9 + 7.
     *
     * @param n
     * @param m
     * @param k
     * @return
     */
    public int numOfArrays(int n, int m, int k) {
        final int mod = 1000000007;

        int[][] dp = new int[m + 1][k + 1];
        int[][] prefix = new int[m + 1][k + 1];
        int[][] prevDp = new int[m + 1][k + 1];
        int[][] prevPrefix = new int[m + 1][k + 1];

        for (int j = 1; j <= m; j++) {
            prevDp[j][1] = 1;
            prevPrefix[j][1] = j;
        }

        for (int i = 2; i <= n; i++) {
            for (int maxNum = 1; maxNum <= m; maxNum++) {
                for (int cost = 1; cost <= k; cost++) {
                    dp[maxNum][cost] = (int) (((long) maxNum * prevDp[maxNum][cost]) % mod);

                    if (maxNum > 1 && cost > 1) {
                        dp[maxNum][cost] = (dp[maxNum][cost] + prevPrefix[maxNum - 1][cost - 1]) % mod;
                    }

                    prefix[maxNum][cost] = (prefix[maxNum - 1][cost] + dp[maxNum][cost]) % mod;
                }
            }

            for (int j = 1; j <= m; j++) {
                System.arraycopy(dp[j], 0, prevDp[j], 0, k + 1);
                System.arraycopy(prefix[j], 0, prevPrefix[j], 0, k + 1);
            }
        }

        return prefix[m][k];
    }

}
