package daily.medium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RangeSumOfSortedSubArrayTest {

  RangeSumOfSortedSubArray rangeSumOfSortedSubArray = new RangeSumOfSortedSubArray();

  @Test
  void rangeSum() {
    assertEquals(13, rangeSumOfSortedSubArray.rangeSum(new int[] {1, 2, 3, 4}, 4, 1, 5));
  }
}
