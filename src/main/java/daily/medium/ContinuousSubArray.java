package daily.medium;

import java.util.HashMap;
import java.util.Map;

public class ContinuousSubArray {
  /**
   * Given an integer array nums and an integer k, return true if nums has a good sub array or false
   * otherwise.
   *
   * <p>A good sub array is a sub array where:
   *
   * <p>its length is at least two, and the sum of the elements of the subarray is a multiple of k.
   * Note that:
   *
   * <p>A subarray is a contiguous part of the array. An integer x is a multiple of k if there
   * exists an integer n such that x = n * k. 0 is always a multiple of k. L
   *
   * @param nums - integer array.
   * @param k
   * @return
   */
  public boolean checkSubarraySum(int[] nums, int k) {
    int n = nums.length;
    Map<Integer, Integer> remainderMap = new HashMap<>();
    int cumulativeSum = 0;

    // Step 1: Initialize Remainder Map
    remainderMap.put(0, -1);

    // Step 2: Iterate Through the List
    for (int i = 0; i < n; i++) {
      // Step 3: Calculate Cumulative Sum
      cumulativeSum += nums[i];

      // Step 4: Calculate Remainder
      int remainder = k == 0 ? cumulativeSum : cumulativeSum % k;

      // Step 5: Update Remainder Map
      if (remainderMap.containsKey(remainder)) {
        // Check if segment length is at least two
        if (i - remainderMap.get(remainder) > 1) {
          return true;
        }
      } else {
        remainderMap.put(remainder, i);
      }
    }

    // Step 6: Return the Result
    return false;
  }
}
