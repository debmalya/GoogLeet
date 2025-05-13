package daily.easy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ThreeConsecutiveOddTest {

  @Test
  void threeConsecutiveOdds() {
    ThreeConsecutiveOdd threeConsecutiveOdd = new ThreeConsecutiveOdd();
    assertFalse(threeConsecutiveOdd.threeConsecutiveOdds(new int[] {1, 2, 3, 4, 5}));
    assertFalse(threeConsecutiveOdd.threeConsecutiveOdds(new int[] {2, 4, 6}));
    assertTrue(threeConsecutiveOdd.threeConsecutiveOdds(new int[] {1, 3, 5, 7}));
    assertFalse(threeConsecutiveOdd.threeConsecutiveOdds(new int[] {1, 2, 4, 6}));
    assertTrue(threeConsecutiveOdd.threeConsecutiveOdds(new int[] {1, 3, 5, 7, 9}));
    assertFalse(threeConsecutiveOdd.threeConsecutiveOdds(new int[] {2, 4, 6, 8}));
    assertTrue(threeConsecutiveOdd.threeConsecutiveOdds(new int[] {1, 3, 5}));
    assertFalse(threeConsecutiveOdd.threeConsecutiveOdds(new int[] {0}));
    assertFalse(threeConsecutiveOdd.threeConsecutiveOdds(new int[] {}));
  }
}
