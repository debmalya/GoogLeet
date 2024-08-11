package hard;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MinimumNoOfDaysToDisconnectTest {

  MinimumNoOfDaysToDisconnect minimumNoOfDaysToDisconnect = new MinimumNoOfDaysToDisconnect();

  @Test
  void minDays() {
    assertEquals(
        2,
        minimumNoOfDaysToDisconnect.minDays(
            new int[][] {{0, 1, 1, 0}, {0, 1, 1, 0}, {0, 0, 0, 0}}));
  }
}
