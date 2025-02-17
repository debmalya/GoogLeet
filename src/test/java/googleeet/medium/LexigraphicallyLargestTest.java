package googleeet.medium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LexigraphicallyLargestTest {

  @Test
  void constructDistancedSequence() {
    LexigraphicallyLargest lexigraphicallyLargest = new LexigraphicallyLargest();
    assertArrayEquals(
        new int[] {3, 1, 2, 3, 2}, lexigraphicallyLargest.constructDistancedSequence(3));
    assertArrayEquals(
        new int[] {5, 3, 1, 4, 3, 5, 2, 4, 2},
        lexigraphicallyLargest.constructDistancedSequence(5));
  }
}
