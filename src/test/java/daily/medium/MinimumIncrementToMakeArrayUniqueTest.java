package daily.medium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MinimumIncrementToMakeArrayUniqueTest {

  MinimumIncrementToMakeArrayUnique minimumIncrementToMakeArrayUnique =
      new MinimumIncrementToMakeArrayUnique();

  @Test
  void minIncrementForUnique() {
    var arr = new int[] {3, 2, 1, 2, 1, 7};
    assertEquals(6, minimumIncrementToMakeArrayUnique.minIncrementForUnique(arr));
  }
}
