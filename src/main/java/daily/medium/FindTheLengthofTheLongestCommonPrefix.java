package daily.medium;

import java.util.HashMap;

public class FindTheLengthofTheLongestCommonPrefix {
  /**
   * You are given two arrays with positive integers arr1 and arr2.
   *
   * <p>A prefix of a positive integer is an integer formed by one or more of its digits, starting
   * from its leftmost digit. For example, 123 is a prefix of the integer 12345, while 234 is not.
   *
   * <p>A common prefix of two integers a and b is an integer c, such that c is a prefix of both a
   * and b. For example, 5655359 and 56554 have a common prefix 565 while 1223 and 43456 do not have
   * a common prefix.
   *
   * <p>You need to find the length of the longest common prefix between all pairs of integers (x,
   * y) such that x belongs to arr1 and y belongs to arr2.
   *
   * @param arr1 first integer array.
   * @param arr2 second integer array.
   * @implNote Find the length of the longest common prefix between the two arrays.
   * @return the length of the longest common prefix among all pairs. If no common prefix exists
   *     among them, return 0.
   */
  public int longestCommonPrefix(int[] arr1, int[] arr2) {
    HashMap<String, Integer> prefixMap = new HashMap<>();

    // Step 1: Build the prefix map for arr1
    for (int num : arr1) {
      var strNum = Integer.toString(num);
      var prefix = new StringBuilder();
      for (char ch : strNum.toCharArray()) {
        prefix.append(ch);
        prefixMap.put(prefix.toString(), prefixMap.getOrDefault(prefix.toString(), 0) + 1);
      }
    }

    int maxLength = 0;

    // Step 2: Check for common prefixes in arr2
    for (int num : arr2) {
      String strNum = Integer.toString(num);
      StringBuilder prefix = new StringBuilder();
      for (char ch : strNum.toCharArray()) {
        prefix.append(ch);
        if (prefixMap.containsKey(prefix.toString())) {
          maxLength = Math.max(maxLength, prefix.length());
        }
      }
    }

    return maxLength;
  }
}
