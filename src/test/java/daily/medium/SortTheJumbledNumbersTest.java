package daily.medium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SortTheJumbledNumbersTest {
  SortTheJumbledNumbers sortTheJumbledNumbers = new SortTheJumbledNumbers();

  @Test
  void sortJumbled() {
    var expected = new int[] {338, 38, 991};
    var actual =
        sortTheJumbledNumbers.sortJumbled(
            new int[] {8, 9, 4, 0, 2, 1, 3, 5, 7, 6}, new int[] {991, 338, 38});
    assertArrayEquals(expected, actual);
  }

  @Test
  void getMappedNum() {
    assertEquals(
        669, sortTheJumbledNumbers.getMappedNum(new int[] {8, 9, 4, 0, 2, 1, 3, 5, 7, 6}, 991));
    assertEquals(
        7, sortTheJumbledNumbers.getMappedNum(new int[] {8, 9, 4, 0, 2, 1, 3, 5, 7, 6}, 38));
    assertEquals(
        7, sortTheJumbledNumbers.getMappedNum(new int[] {8, 9, 4, 0, 2, 1, 3, 5, 7, 6}, 338));
  }
}
