package daily.easy;

public class CountSubarraysLth3WithCondition {
  /**
   * 3392. Count Subarrays of Length Three With a Condition
   *
   * <p>Given an integer array nums, return the number of subarrays of length 3 such that the sum of
   * the first and third numbers equals exactly half of the second number.
   *
   * @param nums integer array.
   * @return return the number of subarrays of length 3.
   */
  public int countSubarrays(int[] nums) {
    int count = 0;
    for (int i = 1; i < nums.length - 1; i++) {
      if (nums[i] == (nums[i - 1] + nums[i + 1]) * 2) {
        count++;
      }
    }
    return count;
  }
}
