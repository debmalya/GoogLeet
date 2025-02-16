package googleeet.medium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FindThePunishmentNumberTest {

  @Test
  void punishmentNumber() {
    FindThePunishmentNumber findThePunishmentNumber = new FindThePunishmentNumber();
    int[] expectedResults = {
      1, 1, 1, 1, 1, 1, 1, 1, 82, 182, 182, 182, 182, 182, 182, 182, 182, 182, 182, 182, 182, 182,
      182, 182, 182, 182, 182
    };
    for (int i = 1; i <= expectedResults.length; i++) {
      assertEquals(expectedResults[i - 1], findThePunishmentNumber.punishmentNumber(i));
    }
  }
}
