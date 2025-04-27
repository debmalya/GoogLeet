package hard;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CountSubarraysWithFixedBoundsTest {

  @Test
  void countSubarrays() {
    CountSubarraysWithFixedBounds countSubarraysWithFixedBounds =
        new CountSubarraysWithFixedBounds();
    assertEquals(
        2, countSubarraysWithFixedBounds.countSubarrays(new int[] {1, 3, 5, 2, 7, 5}, 1, 5));
    assertEquals(10, countSubarraysWithFixedBounds.countSubarrays(new int[] {1, 1, 1, 1}, 1, 1));
  }
}
