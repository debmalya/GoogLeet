package daily.easy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NoOfDominosPairTest {

  @Test
  void numEquivDominoPairs() {
    NoOfDominosPair noOfDominosPair = new NoOfDominosPair();
    int[][] dominoes = {{1, 2}, {2, 1}, {3, 4}, {5, 6}};
    int result = noOfDominosPair.numEquivDominoPairs(dominoes);
    assertEquals(1, result);
  }
}
