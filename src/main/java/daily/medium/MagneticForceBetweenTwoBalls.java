package daily.medium;

import java.util.Arrays;

public class MagneticForceBetweenTwoBalls {
  /**
   * In the universe Earth C-137, Rick discovered a special form of magnetic force between two balls
   * if they are put in his new invented basket. Rick has n empty baskets, the ith basket is at
   * position[i], Morty has m balls and needs to distribute the balls into the baskets such that the
   * minimum magnetic force between any two balls is maximum.
   *
   * <p>Rick stated that magnetic force between two different balls at positions x and y is |x - y|.
   *
   * <p>Given the integer array position and the integer m. Return the required force.
   *
   * @param position integer array. Position of each basket.
   * @param m - number of balls.
   * @return
   */
  public int maxDistance(int[] position, int m) {
    Arrays.sort(position);
    var l = 1;
    var r = position[position.length - 1] - position[0];
    var ans = -1;
    while (l <= r) {
      var mid = l + (r - l) / 2;
      var lastPosition = position[0];
      var balls = 1;
      for (int i = 1; i < position.length; i++) {
        if (position[i] - lastPosition >= mid) {
          lastPosition = position[i];
          balls++;
        }
      }
      if (balls >= m) {
        ans = mid;
        l = mid + 1;
      } else {
        r = mid - 1;
      }
    }
    return ans;
  }
}
