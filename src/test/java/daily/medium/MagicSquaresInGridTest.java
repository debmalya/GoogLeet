package daily.medium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MagicSquaresInGridTest {

  MagicSquaresInGrid magicSquaresInGrid = new MagicSquaresInGrid();

  @Test
  void numMagicSquaresInside() {
    assertEquals(
        1,
        magicSquaresInGrid.numMagicSquaresInside(
            new int[][] {{4, 3, 8, 4}, {9, 5, 1, 9}, {2, 7, 6, 2}}));
  }
}
