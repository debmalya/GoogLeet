package daily.medium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolvingQuestionsWithBrainpowerTest {

  SolvingQuestionsWithBrainpower s = new SolvingQuestionsWithBrainpower();

  @Test
  void mostPoints() {
    assertEquals(5, s.mostPoints(new int[][] {{3, 2}, {4, 3}, {4, 4}, {2, 5}}));
    assertEquals(7, s.mostPoints(new int[][] {{1, 1}, {2, 2}, {3, 3}, {4, 4}, {5, 5}}));
  }
}
