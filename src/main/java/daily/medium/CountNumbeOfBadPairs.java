package daily.medium;

import java.util.HashMap;
import java.util.Map;

public class CountNumbeOfBadPairs {
  /**
   * You are given a 0-indexed integer array nums. A pair of indices (i, j) is a bad pair if i < j
   * and j - i != nums[j] - nums[i].
   *
   * <p>Return the total number of bad pairs in nums.
   */
  public long countBadPairs(int[] nums) {
    long count = 0;
    long totalPairs = (long) nums.length * (nums.length - 1) / 2;
    Map<Integer, Integer> map = new HashMap<>();

    for (int i = 0; i < nums.length; i++) {
      int diff = nums[i] - i;
      count += map.getOrDefault(diff, 0);
      map.put(diff, map.getOrDefault(diff, 0) + 1);
    }

    return totalPairs - count;
  }
}
