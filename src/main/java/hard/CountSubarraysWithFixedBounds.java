package hard;

public class CountSubarraysWithFixedBounds {
  /**
   * 2444. Count Sub arrays With Fixed Bounds
   *
   * <p>You are given an integer array nums and two integers minK and maxK.
   *
   * <p>A fixed-bound sub array of nums is a sub array that satisfies the following conditions:
   *
   * <p>The minimum value in the sub array is equal to minK. The maximum value in the sub array is
   * equal to maxK. Return the number of fixed-bound sub arrays.
   *
   * <p>A subarray is a contiguous part of an array.
   */
  public long countSubarrays(int[] nums, int minK, int maxK) {
    long result = 0;
    int minIndex = -1, maxIndex = -1, leftBound = -1;

    for (int i = 0; i < nums.length; i++) {
      if (nums[i] < minK || nums[i] > maxK) {
        leftBound = i;
      }
      if (nums[i] == minK) {
        minIndex = i;
      }
      if (nums[i] == maxK) {
        maxIndex = i;
      }
      result += Math.max(0, Math.min(minIndex, maxIndex) - leftBound);
    }
    return result;

  }
}
