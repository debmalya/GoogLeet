package daily.medium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SumOfPowerOfThreeTest {

  SumOfPowerOfThree sumOfPowerOfThree = new SumOfPowerOfThree();

  @Test
  void checkPowersOfThree() {
    assertTrue(sumOfPowerOfThree.checkPowersOfThree(12));
    assertTrue(sumOfPowerOfThree.checkPowersOfThree(91));
    assertFalse(sumOfPowerOfThree.checkPowersOfThree(21));
  }
}
