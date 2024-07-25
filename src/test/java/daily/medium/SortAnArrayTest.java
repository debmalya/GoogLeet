package daily.medium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SortAnArrayTest {
  SortAnArray sortAnArray = new SortAnArray();

  @Test
  void sortArray() {
    var expected = new int[] {1, 2, 3, 5};
    var actual = sortAnArray.sortArray(new int[] {5, 2, 3, 1});
    assertArrayEquals(expected,actual);
  }
}
