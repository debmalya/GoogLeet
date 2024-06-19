package daily.medium;

import java.util.Arrays;

public class MinimumIncrementToMakeArrayUnique {
  /**
   * You are given an integer array nums. In one move, you can pick an index i where 0 <= i <
   * nums.length and increment nums[i] by 1.
   *
   * <p>Return the minimum number of moves to make every value in nums unique.
   *
   * <p>The test cases are generated so that the answer fits in a 32-bit integer.
   *
   * @param nums - an integer array.
   * @return the minimum number of moves to make every value in nums unique.
   */
  public int minIncrementForUnique(int[] nums) {
    // Sort the array first
    Arrays.sort(nums);

    int numTracker = 0; // Tracks the next unique number that should be set.
    int minIncrement = 0; // Counts the total increments required.

    for (int num : nums) {
      numTracker = Math.max(numTracker, num);
      minIncrement += numTracker - num;
      numTracker += 1; // Increment the tracker for the next number.
    }

    return minIncrement;
  }
}
