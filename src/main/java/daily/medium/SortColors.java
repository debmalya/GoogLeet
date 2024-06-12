package daily.medium;

public class SortColors {
  /**
   * @param nums Given an array nums with n objects colored red, white, or blue, sort them in-place
   *     so that objects of the same color are adjacent, with the colors in the order red, white,
   *     and blue.
   *     <p>We will use the integers 0, 1, and 2 to represent the color red, white, and blue,
   *     respectively.
   */
  public void sortColors(int[] nums) {
    var colors = new int[3];
    for (int num : nums) {
      colors[num]++;
    }

    var index = 0;
    for (var colorIndex = 0; colorIndex < 3; colorIndex++) {
      var count = colors[colorIndex];
      while (count > 0) {
        nums[index++] = colorIndex;
        count--;
      }
    }
  }
}
