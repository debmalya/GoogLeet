package daily.medium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SortColorsTest {

  SortColors sortColors = new SortColors();

  @Test
  void sortColors() {
    var colors = new int[] {2, 0, 2, 1, 1, 0};
    sortColors.sortColors(colors);
    assertArrayEquals(new int[] {0, 0, 1, 1, 2, 2}, colors);
  }
}
