package daily.medium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AverageWaitingTimeTest {

  AverageWaitingTime averageWaitingTime = new AverageWaitingTime();

  @Test
  void averageWaitingTime() {
    assertEquals(
        5.00000, averageWaitingTime.averageWaitingTime(new int[][] {{1, 2}, {2, 5}, {4, 3}}));
    assertEquals(
        3.25000,
        averageWaitingTime.averageWaitingTime(new int[][] {{5, 2}, {5, 4}, {10, 3}, {20, 1}}));
  }
}
