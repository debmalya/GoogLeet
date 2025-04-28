package hard;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CountSubarraysWithScoreLessThanKTest {

  @Test
  void countSubarrays() {
    CountSubarraysWithScoreLessThanK countSubarraysWithScoreLessThanK =
        new CountSubarraysWithScoreLessThanK();
    assertEquals(6, countSubarraysWithScoreLessThanK.countSubarrays(new int[] {2, 1, 4, 3, 5}, 10));
    assertEquals(5, countSubarraysWithScoreLessThanK.countSubarrays(new int[] {1, 1, 1}, 5));
  }
}
