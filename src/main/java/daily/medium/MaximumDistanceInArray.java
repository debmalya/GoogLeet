package daily.medium;

import java.util.List;

public class MaximumDistanceInArray {
  /**
   * You are given m arrays, where each array is sorted in ascending order.
   *
   * <p>You can pick up two integers from two different arrays (each array picks one) and calculate
   * the distance. We define the distance between two integers a and b to be their absolute
   * difference |a - b|.
   *
   * <p>Return the maximum distance.
   *
   * @param arrays m arrays, where each array is sorted in ascending order.
   * @return the maximum distance.
   */
  public int maxDistance(List<List<Integer>> arrays) {
    var max = Integer.MIN_VALUE;
    var min = Integer.MAX_VALUE;
    var minMax = new int[arrays.size()][2];
    var minIndex = -1;
    var maxIndex = -1;
    var index = 0;

    for (List<Integer> array : arrays) {

      minMax[index][0] = array.getFirst();
      minMax[index][1] = array.getLast();

      if (min > minMax[index][0]) {
        minIndex = index;
        min = minMax[index][0];
      }

      if (minMax[index][1] > max) {
        maxIndex = index;
        max = minMax[index][1];
      }

      index++;
    }

    if (minIndex == maxIndex) {
      var result = Integer.MIN_VALUE;
      for (index = 0; index < arrays.size(); index++) {
        if (index != minIndex) {
          result = Math.max(result, max - arrays.get(index).getFirst());
        }
        if (index != maxIndex) {
          result = Math.max(result, arrays.get(index).getLast() - min);
        }
      }
      return result;
    }
    return max - min;
  }
}
