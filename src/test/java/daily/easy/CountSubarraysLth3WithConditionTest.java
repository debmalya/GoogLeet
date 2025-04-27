package daily.easy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CountSubarraysLth3WithConditionTest {

  @Test
  void countSubarrays() {
    CountSubarraysLth3WithCondition countSubarraysLth3WithCondition =
        new CountSubarraysLth3WithCondition();
    assertEquals(1, countSubarraysLth3WithCondition.countSubarrays(new int[] {1, 2, 1, 4, 1}));
    assertEquals(0, countSubarraysLth3WithCondition.countSubarrays(new int[] {1, 1, 1}));
  }
}
