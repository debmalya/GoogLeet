package daily.easy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ClearDigitsTest {

  ClearDigits clearDigits = new ClearDigits();

  @Test
  void clearDigits() {
    assertEquals("abc", clearDigits.clearDigits("abc"));
    assertEquals("abc", clearDigits.clearDigits("cb34"));
  }
}
