package daily.easy;

public class MinimumRecolors2GetKConsecutiveBlackBlocks {
  /**
   * You are given a 0-indexed string blocks of length n, where blocks[i] is either 'W' or 'B',
   * representing the color of the ith block. The characters 'W' and 'B' denote the colors white and
   * black, respectively.
   *
   * <p>You are also given an integer k, which is the desired number of consecutive black blocks.
   *
   * <p>In one operation, you can recolor a white block such that it becomes a black block.
   *
   * <p>Return the minimum number of operations needed such that there is at least one occurrence of
   * k consecutive black blocks.
   *
   * @param blocks - 0-indexed string blocks of length n.
   * @param k - the desired number of consecutive black blocks.
   * @return minimum number of operations needed such that there is at least one occurrence of K
   *     consecutive black blocks.
   */
  public int minimumRecolors(String blocks, int k) {
    int min = Integer.MAX_VALUE;
    for (int lo = -1, hi = 0, white = 0; hi < blocks.length(); ++hi) {
      white += blocks.charAt(hi) == 'W' ? 1 : 0;
      if (hi - lo >= k) { // the window reaches size of k.
        min = Math.min(min, white); // update  minimum.
        // slide 1 step right the lower bound of the sliding
        // window and update the value of white count.
        white -= blocks.charAt(++lo) == 'W' ? 1 : 0;
      }
    }
    return min;
  }
}
