package daily.medium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CloestPrimeNumberInRangeTest {

  CloestPrimeNumberInRange cloestPrimeNumberInRange = new CloestPrimeNumberInRange();

  @Test
  void closestPrimes() {
    var actual = cloestPrimeNumberInRange.closestPrimes(10, 19);
    var expected = new int[] {11, 13};
    assertArrayEquals(expected, actual);

    actual = cloestPrimeNumberInRange.closestPrimes(4, 6);
    expected = new int[] {-1, -1};
    assertArrayEquals(expected, actual);
  }
}
