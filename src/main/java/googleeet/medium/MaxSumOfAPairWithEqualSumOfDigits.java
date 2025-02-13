package googleeet.medium;

import java.util.*;

public class MaxSumOfAPairWithEqualSumOfDigits {
  /**
   * You are given a 0-indexed array nums consisting of positive integers. You can choose two
   * indices i and j, such that i != j, and the sum of digits of the number nums[i] is equal to that
   * of nums[j].
   *
   * <p>Return the maximum value of nums[i] + nums[j] that you can obtain over all possible indices
   * i and j that satisfy the conditions.
   *
   * @param nums
   * @return
   */
  public int maximumSum(int[] nums) {
    Map<Integer, List<Integer>> map = new HashMap<>();
    for (int num : nums) {
      int sum = digSum(num);
      map.putIfAbsent(sum, new ArrayList<>());
      map.get(sum).add(num);
    }
    int maxSum = -1;
    for (List<Integer> arr : map.values()) {
      if (arr.size() >= 2) {
        int firstMax = 0, secondMax = 0;
        for (int x : arr) {
          if (x > firstMax) {
            secondMax = firstMax;
            firstMax = x;
          } else if (x > secondMax) {
            secondMax = x;
          }
        }
        maxSum = Math.max(maxSum, firstMax + secondMax);
      }
    }
    return maxSum;
  }

  private int digSum(int x) {
    int sum = 0;
    while (x != 0) {
      sum += x % 10;
      x /= 10;
    }
    return sum;
  }
}
