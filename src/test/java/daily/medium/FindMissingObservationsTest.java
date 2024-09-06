package daily.medium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FindMissingObservationsTest {

  FindMissingObservations findMissingObservations = new FindMissingObservations();

  @Test
  void missingRolls() {
    var actual = findMissingObservations.missingRolls(new int[] {3, 2, 4, 3}, 4, 2);
    var expected = new int[] {6, 6};
    assertArrayEquals(expected, actual);
  }

  @Test
  void missingRolls1() {
    var actual = findMissingObservations.missingRolls(new int[] {1, 5, 6}, 3, 4);
    var expected = new int[] {3, 2, 2, 2};
    assertArrayEquals(expected, actual);
  }

  @Test
  void missingRolls2() {
    var actual = findMissingObservations.missingRolls(new int[] {1, 2, 3, 4}, 6, 4);
    var expected = new int[] {};
    assertArrayEquals(expected, actual);
  }

  @Test
  void missingRolls3() {
    var actual = findMissingObservations.missingRolls(new int[] {6, 6, 6, 6}, 6, 4);
    var expected = new int[] {6, 6, 6, 6};
    assertArrayEquals(expected, actual);
  }

  @Test
  void missingRolls4() {
    var actual = findMissingObservations.missingRolls(new int[] {6, 3, 4, 3, 5, 3}, 1, 6);
    var expected = new int[] {};
    assertArrayEquals(expected, actual);
  }

  @Test
  void missingRolls5() {
    var actual =
        findMissingObservations.missingRolls(
            new int[] {
              4, 2, 2, 5, 4, 5, 4, 5, 3, 3, 6, 1, 2, 4, 2, 1, 6, 5, 4, 2, 3, 4, 2, 3, 3, 5, 4, 1, 4,
              4, 5, 3, 6, 1, 5, 2, 3, 3, 6, 1, 6, 4, 1, 3
            },
            2,
            53);
    var expected = new int[] {};
    assertArrayEquals(expected, actual);
  }
}
