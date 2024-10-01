package daily.medium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CheckIfArrayPairsAreDivisibleByKTest {

  @Test
  void canArrange() {
    CheckIfArrayPairsAreDivisibleByK solution = new CheckIfArrayPairsAreDivisibleByK();
    int[] arr = {1, 2, 3, 4, 5, 10, 7, 8, 9, 6};
    int k = 5;
    boolean expected = true;
    boolean result = solution.canArrange(arr, k);
    assertEquals(expected, result);
  }

  @Test
  void canNotArrange() {
    CheckIfArrayPairsAreDivisibleByK solution = new CheckIfArrayPairsAreDivisibleByK();
    int[] arr = {1, 2, 3, 4, 5, 10, 7, 8, 9, 4};
    int k = 5;
    boolean expected = false;
    boolean result = solution.canArrange(arr, k);
    assertEquals(expected, result);
  }
}
