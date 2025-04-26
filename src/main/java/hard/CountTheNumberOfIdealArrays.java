package hard;

public class CountTheNumberOfIdealArrays {
  /**
   * 2338. Count the Number of Ideal Arrays You are given two integers n and maxValue, which are
   * used to describe an ideal array.
   *
   * <p>A 0-indexed integer array arr of length n is considered ideal if the following conditions
   * hold:
   *
   * <p>Every arr[i] is a value from 1 to maxValue, for 0 <= i < n. Every arr[i] is divisible by
   * arr[i - 1], for 0 < i < n. Return the number of distinct ideal arrays of length n. Since the
   * answer may be very large, return it modulo 10**9 + 7.
   *
   * @param n integer.
   * @param maxValue integer.
   * @return
   */
  public int idealArrays(int n, int maxValue) {
    int[][] dp = new int[maxValue + 1][15];
    for (int i = 0; i <= maxValue; i++) {
      dp[i][1] = 1;
    }
    for (int j = 2; j <= 15; j++) {
      for (int i = 1; i <= maxValue; i++) {
        for (int k = i + i; k <= maxValue; k += i) {
          dp[k][j] = (dp[k][j] + dp[i][j - 1]) % 1000000007;
        }
      }
    }
    int ans = 0;
    for (int i = 1; i <= maxValue; i++) {
      ans = (ans + dp[i][n]) % 1000000007;
    }
    return ans;
  }
}
