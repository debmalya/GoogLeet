package daily.easy;

public class FindMissingNRepeatedNumbers {
  /**
   * You are given a 0-indexed 2D integer matrix grid of size n * n with values in the range [1,
   * n2]. Each integer appears exactly once except a which appears twice and b which is missing. The
   * task is to find the repeating and missing numbers a and b.
   *
   * <p>Return a 0-indexed integer array ans of size 2 where ans[0] equals to a and ans[1] equals to
   * b.
   *
   * @param grid - 0-indexed 2D integer matrix grid.
   * @return a 0-indexed integer array ans of size 2 where ans[0] equals to a and ans[1] equals to
   *     b.
   */
  public int[] findMissingAndRepeatedValues(int[][] grid) {
    var frequency = new int[grid.length * grid.length];
    var result = new int[2];

    for (var i = 0; i < grid.length; i++) {
      for (var j = 0; j < grid.length; j++) {
        frequency[grid[i][j] - 1]++;
      }
    }

    for (var i = 0; i < frequency.length; i++) {
      if (frequency[i] > 1) {
        result[0] = i + 1;
      } else if (frequency[i] == 0) {
        result[1] = i + 1;
      }
    }

    return result;
  }
}
