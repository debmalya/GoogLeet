package daily.medium;

public class AlternateGroupsII {
  /**
   * 3208. There is a circle of red and blue tiles. You are given an array of integers colors and an
   * integer k. The color of tile i is represented by colors[i]:
   *
   * <p>colors[i] == 0 means that tile i is red. colors[i] == 1 means that tile i is blue. An
   * alternating group is every k contiguous tiles in the circle with alternating colors (each tile
   * in the group except the first and last one has a different color from its left and right
   * tiles).
   *
   * <p>Return the number of alternating groups.
   *
   * <p>Note that since colors represents a circle, the first and the last tiles are considered to
   * be next to each other.
   *
   * @param colors - an array of integers representing the colors of tiles.
   * @param k - the desired number of consecutive black blocks.
   * @return the number of alternating groups.
   */
  public int numberOfAlternatingGroups(int[] colors, int k) {
    int n = colors.length;
    int[] temp = new int[n + k - 1];
    System.arraycopy(colors, 0, temp, 0, n);
    System.arraycopy(colors, 0, temp, n, k - 1);

    int count = 0;
    int left = 0;

    for (int right = 0; right < temp.length; right++) {
      if (right > 0 && temp[right] == temp[right - 1]) {
        left = right;
      }

      if (right - left + 1 >= k) {
        count++;
      }
    }

    return count;
  }
}
