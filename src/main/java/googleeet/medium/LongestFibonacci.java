package googleeet.medium;

public class LongestFibonacci {
  /**
   * A sequence X_1, X_2, ..., X_n is fibonacci-like if:
   *
   * <p>n >= 3 X_i + X_{i+1} = X_{i+2} for all i + 2 <= n
   *
   * <p>Given a strictly increasing array A of positive integers forming a sequence, find the length
   * of the longest fibonacci-like subsequence of A. If one does not exist, return 0.
   *
   * <p>(Recall that a subsequence is derived from another sequence A by deleting any number of
   * elements (including none) from A, without changing the order of the remaining elements. For
   * example, [3, 5, 8] is a subsequence of [3, 4, 5, 6, 7, 8].)
   *
   * @param A strictly increasing array A of positive integers.
   * @return the length of the longest fibonacci-like subsequence of A.
   */
  public int lenLongestFibSubseq(int[] A) {
    int n = A.length;
    int[][] dp = new int[n][n];
    int max = 0;
    for (int i = 2; i < n; i++) {
      int l = 0, r = i - 1;
      while (l < r) {
        int sum = A[l] + A[r];
        if (sum < A[i]) {
          l++;
        } else if (sum > A[i]) {
          r--;
        } else {
          dp[r][i] = dp[l][r] + 1;
          max = Math.max(max, dp[r][i]);
          l++;
          r--;
        }
      }
    }
    return max == 0 ? 0 : max + 2;
  }
}
