package daily.medium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CountTotalNumberOfColouredCellsTest {
  CountTotalNumberOfColouredCells countTotalNumberOfColouredCells =
      new CountTotalNumberOfColouredCells();

  @Test
  void coloredCells() {
    assertEquals(1, countTotalNumberOfColouredCells.coloredCells(1));
    assertEquals(5, countTotalNumberOfColouredCells.coloredCells(2));
    assertEquals(13, countTotalNumberOfColouredCells.coloredCells(3));
  }
}
