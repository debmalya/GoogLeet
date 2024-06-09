package daily.medium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContinuousSubArrayTest {

  ContinuousSubArray continuousSubArray = new ContinuousSubArray();

  @Test
  void checkSubarraySum() {
    assertFalse(continuousSubArray.checkSubarraySum(new int[] {0, 1, 0, 3, 0, 4, 0, 4, 0}, 5));
    assertTrue(continuousSubArray.checkSubarraySum(new int[] {23, 2, 4, 6, 7}, 6));
  }
}
