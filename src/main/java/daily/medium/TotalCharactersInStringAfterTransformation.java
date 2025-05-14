package daily.medium;

public class TotalCharactersInStringAfterTransformation {

  /**
   * 3335. Total Characters in String After Transformations I.
   *
   * <p>You are given a string s and an integer t, representing the number of transformations to
   * perform. In one transformation, every character in s is replaced according to the following
   * rules:
   *
   * <p>If the character is 'z', replace it with the string "ab". Otherwise, replace it with the
   * next character in the alphabet. For example, 'a' is replaced with 'b', 'b' is replaced with
   * 'c', and so on. Return the length of the resulting string after exactly t transformations.
   *
   * <p>Since the answer may be very large, return it modulo 10**9 + 7.
   *
   * @param s
   * @param t
   * @return
   */
  private static final long mod = 1000000007;

  private long mod_add(long a, long b) {
    a %= mod;
    b %= mod;
    return ((a + b) % mod + mod) % mod;
  }

  public int lengthAfterTransformations(String s, int t) {
    long[] nums = new long[26];
    for (char ch : s.toCharArray()) nums[ch - 'a']++;
    while (t-- > 0) {
      long[] cur = new long[26];
      for (int j = 0; j < 26; j++) {
        if (j == 25 && nums[j] > 0) {
          cur[0] = mod_add(cur[0], nums[j]);
          cur[1] = mod_add(cur[1], nums[j]);
        } else {
          if (j < 25) cur[j + 1] = mod_add(cur[j + 1], nums[j]);
        }
      }
      nums = cur;
    }
    long cnt = 0;
    for (long i : nums) cnt = mod_add(cnt, i);
    return (int) cnt;
  }
}
