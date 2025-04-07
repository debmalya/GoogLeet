package daily.medium;

public class PartitionArray {
  /**
   * 416. Partition Equal Subset Sum XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
   *
   * <p
   * Given a non-empty array nums containing only positive integers, find if the array can be partitioned into two subsets such that the sum of elements in both subsets is equal.
   *<p>Example
   * 1: Input: nums = [1,5,11,5] Output: true Explanation: The array can be partitioned as [1, 5, 5]
   * and [11].
   *
   * <p>Example 2: Input: nums = [1,2,3,5] Output: false Explanation: The array cannot be
   * partitioned into equal sum subsets.
   *
   * <p>Constraints:
   *
   * <p>1 <= nums.length <= 200 1 <= nums[i] <= 100
   *
   * <p>Related Topics: Array, Dynamic Programming
   *
   * <p>Solution:
   */
  public boolean canPartition(int[] nums) {
    int sum = 0;
    for (int num : nums) {
      sum += num;
    }
    if (sum % 2 != 0) {
      return false;
    }
    sum /= 2;
    boolean[] dp = new boolean[sum + 1];
    dp[0] = true;
    for (int num : nums) {
      for (int i = sum; i >= num; i--) {
        dp[i] = dp[i] || dp[i - num];
      }
    }
    return dp[sum];
  }
}
