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
    Arrays.sort(nums);
    int count = 0;
    int prev = nums[0];
    for (var index = 1; index < nums.length; index++) {
      while (nums[index] <= prev) {
        nums[index]++;
        count++;
      }
      prev = nums[index];
    }
    System.out.println(Arrays.toString(nums));
    return count;
  }
}
