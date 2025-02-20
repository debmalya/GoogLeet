package googleeet.medium;

public class KthLexicographicalStringOfAllHappyStringsofLengthN {
  /**
   * XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
   * A happy string is a string that:
   *
   * <p>consists only of letters of the set ['a', 'b', 'c']. s[i] != s[i + 1] for all values of i
   * from 1 to s.length - 1 (string is 1-indexed). For example, strings "abc", "ac", "a" and
   * "abcbabcbcb" are all happy strings and strings "aa", "baa" and "ababbc" are not happy strings.
   *
   * <p>Given two integers n and k, consider a list of all happy strings of length n. Return the kth
   * string of this list or return an empty string if there are less than k happy strings of length
   * n.
   *
   * <p>Example 1:
   *
   * <p>Input: n = 1, k = 3 Output: "c" Explanation: The list ["a", "b", "c"] contains all happy
   * strings of length 1. The third string is "c". Example 2:
   *
   * <p>Input: n = 1, k = 4 Output: "" Explanation: There are only 3 happy strings of length 1 ["a",
   * "b", "c"]. Example 3:
   *
   * <p>Input: n = 3, k = 9 Output: "cab" Explanation: There are 12 different happy string of length
   * 3 ["aba", "abc", "aca", "acb", "bab", "bac", "bca", "bcb", "cab", "cac", "cba", "cbc"]. You
   * will find the 9th string = "cab" Example 4:
   *
   * <p>Input: n = 2, k = 7 Output: "" Explanation: There are 68 different happy string of length 2.
   * The 7th string is "lab". Example 5:
   *
   * <p>Input: n = 10, k = 100 Output: "abacbabacb"
   *
   * <p>Constraints:
   *
   * <p>1 <= n <= 10 1 <= k <= 100
   *
   * @param n length of string.
   * @param k kth string.
   * @return kth happy string of length n.
   */
  int n2;

  public String getHappyString(int n, int k) {
    n2 = n;
    return dfs(new StringBuilder(), n, k);
  }

  public String dfs(StringBuilder prefix, int n, int k) {
    if (n == 0) return prefix.toString();
    for (char c = 'a'; c <= 'c'; c++) {
      if (prefix.length() > 0 && c == prefix.charAt(prefix.length() - 1)) continue;
      int cnt = (int) Math.pow(2, n2 - prefix.length() - 1);
      if (cnt >= k) return dfs(prefix.append(c), n - 1, k);
      else k -= cnt;
    }
    return "";
  }
}
