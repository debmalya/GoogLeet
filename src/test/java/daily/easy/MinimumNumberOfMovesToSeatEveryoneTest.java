package daily.easy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MinimumNumberOfMovesToSeatEveryoneTest {

  MinimumNumberOfMovesToSeatEveryone minimumNumberOfMovesToSeatEveryone =
      new MinimumNumberOfMovesToSeatEveryone();

  @Test
  void minMovesToSeat() {
    assertEquals(
        4,
        minimumNumberOfMovesToSeatEveryone.minMovesToSeat(
            new int[] {3, 1, 5}, new int[] {2, 7, 4}));
    assertEquals(
        7,
        minimumNumberOfMovesToSeatEveryone.minMovesToSeat(
            new int[] {4, 1, 5, 9}, new int[] {1, 3, 2, 6}));
  }
}
