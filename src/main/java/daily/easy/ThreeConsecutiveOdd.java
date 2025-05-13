package daily.easy;

import java.util.stream.IntStream;

public class ThreeConsecutiveOdd {
  /**
   * 1550. Three Consecutive Odds
   *
   * @param arr integer array.
   * @return true if there are three consecutive odd numbers in the array, false otherwise.
   */
  public boolean threeConsecutiveOdds(int[] arr) {
    return IntStream.range(0, arr.length - 2)
        .anyMatch(i -> arr[i] % 2 != 0 && arr[i + 1] % 2 != 0 && arr[i + 2] % 2 != 0);
  }
}
