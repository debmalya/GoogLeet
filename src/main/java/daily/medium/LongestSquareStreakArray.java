package daily.medium;

import java.util.Arrays;

public class LongestSquareStreakArray {
  public int longestSquareStreak(int[] nums) {
    var length = -1;
    Arrays.sort(nums);
    for (var num : nums) {
      var current = (int) Math.pow(num, 2);
      if (Arrays.binarySearch(nums, current) > -1) {
        var count = 2;
        while (true) {
          current = (int) Math.pow(current, 2);
          if (Arrays.binarySearch(nums, current) > -1) {
            count++;
          } else {
            break;
          }
        }
        length = Math.max(length, count);
      }
    }
    return length;
  }
}
