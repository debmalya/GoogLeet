package daily.medium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CountSubarraysWhereMaxElementAppearsatLeastKTimesTest {

  @Test
  void countSubarrays() {
    CountSubarraysWhereMaxElementAppearsatLeastKTimes
        countSubarraysWhereMaxElementAppearsatLeastKTimes =
            new CountSubarraysWhereMaxElementAppearsatLeastKTimes();
    assertEquals(
        6,
        countSubarraysWhereMaxElementAppearsatLeastKTimes.countSubarrays(
            new int[] {1, 3, 2, 3, 3}, 2));
  }
}
