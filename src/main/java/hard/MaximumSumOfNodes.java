package hard;

public class MaximumSumOfNodes {
  /**
   * There exists an undirected tree with n nodes numbered 0 to n - 1. You are given a 0-indexed 2D
   * integer array edges of length n - 1, where edges[i] = [ui, vi] indicates that there is an edge
   * between nodes ui and vi in the tree. You are also given a positive integer k, and a 0-indexed
   * array of non-negative integers nums of length n, where nums[i] represents the value of the node
   * numbered i.
   *
   * <p>Alice wants the sum of values of tree nodes to be maximum, for which Alice can perform the
   * following operation any number of times (including zero) on the tree:
   *
   * <p>Choose any edge [u, v] connecting the nodes u and v, and update their values as follows:
   * nums[u] = nums[u] XOR k nums[v] = nums[v] XOR k Return the maximum possible sum of the values
   * Alice can achieve by performing the operation any number of times.
   *
   * @param nums
   * @param k
   * @param edges
   * @return
   */
  public long maximumValueSum(int[] nums, int k, int[][] edges) {
    long total = 0;
    for (int num : nums) {
      total += num;
    }

    long totalDiff = 0;
    long diff;
    int positiveCount = 0;
    long minAbsDiff = Long.MAX_VALUE;
    for (int num : nums) {
      diff = (num ^ k) - num;

      if (diff > 0) {
        totalDiff += diff;
        positiveCount++;
      }
      minAbsDiff = Math.min(minAbsDiff, Math.abs(diff));
    }
    if (positiveCount % 2 == 1) {
      totalDiff -= minAbsDiff;
    }
    return total + totalDiff;
  }
}
