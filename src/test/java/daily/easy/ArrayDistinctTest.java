package daily.easy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArrayDistinctTest {

  ArrayDistinct arrayDistinct = new ArrayDistinct();

  @Test
  void minimumOperations() {
    assertEquals(2, arrayDistinct.minimumOperations(new int[] {1, 2, 3, 4, 2, 3, 3, 5, 7}));
    assertEquals(0, arrayDistinct.minimumOperations(new int[] {6, 7, 8, 9}));
    assertEquals(2, arrayDistinct.minimumOperations(new int[] {4, 5, 6, 4, 4}));
  }
}
