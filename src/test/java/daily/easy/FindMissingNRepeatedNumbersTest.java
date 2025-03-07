package daily.easy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FindMissingNRepeatedNumbersTest {
  FindMissingNRepeatedNumbers findMissingNRepeatedNumbers = new FindMissingNRepeatedNumbers();

  @Test
  void findMissingAndRepeatedValues() {
    var actual =
        findMissingNRepeatedNumbers.findMissingAndRepeatedValues(new int[][] {{1, 3}, {2, 2}});
    var expected = new int[] {2, 4};
    assertArrayEquals(expected, actual);
  }
}
