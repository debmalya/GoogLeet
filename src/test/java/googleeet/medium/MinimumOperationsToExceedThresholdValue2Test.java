package googleeet.medium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MinimumOperationsToExceedThresholdValue2Test {

  @Test
  void minOperations() {
    MinimumOperationsToExceedThresholdValue2 solution =
        new MinimumOperationsToExceedThresholdValue2();
    assertEquals(3, solution.minOperations(new int[] {1, 2, 3, 4, 5}, 5));
  }
}
