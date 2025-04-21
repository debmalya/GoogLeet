package daily.medium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RabbitsInForestTest {

  @Test
  void numRabbits() {
    RabbitsInForest rabbitsInForest = new RabbitsInForest();
    int[] answers = {1, 1, 2};
    int expected = 5;
    int actual = rabbitsInForest.numRabbits(answers);
    assertEquals(expected, actual);
  }
}
