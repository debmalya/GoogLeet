package googleeet.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxSumOfAPairWithEqualSumOfDigitsTest {
  MaxSumOfAPairWithEqualSumOfDigits maxSumOfAPairWithEqualSumOfDigits =
      new MaxSumOfAPairWithEqualSumOfDigits();

  @Test
  void maximumSum() {
    assertEquals(93, maxSumOfAPairWithEqualSumOfDigits.maximumSum(new int[] {51, 71, 17, 42}));
  }
}
