package daily.easy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SortArrayByIncreasingFrequencyTest {

  SortArrayByIncreasingFrequency SortArrayByIncreasingFrequency =
      new SortArrayByIncreasingFrequency();

  @Test
  void frequencySort() {
    var sorted = SortArrayByIncreasingFrequency.frequencySort(new int[] {1, 1, 2, 2, 2, 3});
    assertAll(
        () -> assertEquals(3, sorted[0]),
        () -> assertEquals(1, sorted[1]),
        () -> assertEquals(1, sorted[2]),
        () -> assertEquals(2, sorted[3]),
        () -> assertEquals(2, sorted[4]),
        () -> assertEquals(2, sorted[5]));
  }
}
