package daily.easy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LuckyNumbersInMatrixTest {
  LuckyNumbersInMatrix luckyNumbersInMatrix = new LuckyNumbersInMatrix();

  @Test
  void luckyNumbers1() {
    var luckier =
        luckyNumbersInMatrix.luckyNumbers(new int[][] {{3, 7, 8}, {9, 11, 13}, {15, 16, 17}});
    assertAll(() -> assertEquals(1, luckier.size()), () -> assertEquals(15, luckier.getFirst()));
  }

  @Test
  void luckyNumbers2() {
    var luckier =
        luckyNumbersInMatrix.luckyNumbers(
            new int[][] {{1, 10, 4, 2}, {9, 3, 8, 7}, {15, 16, 17, 12}});
    assertAll(() -> assertEquals(1, luckier.size()), () -> assertEquals(12, luckier.getFirst()));
  }

  @Test
  void getRowMin() {
    var matrix = new int[][] {{3, 7, 8}, {9, 11, 13}, {15, 16, 17}};
    var coords = luckyNumbersInMatrix.getRowMin(matrix, 0);
    assertEquals(0, coords[0]);
    assertEquals(0, coords[1]);

    coords = luckyNumbersInMatrix.getRowMin(matrix, 1);
    assertEquals(1, coords[0]);
    assertEquals(0, coords[1]);

    coords = luckyNumbersInMatrix.getRowMin(matrix, 2);
    assertEquals(2, coords[0]);
    assertEquals(0, coords[1]);

    matrix = new int[][] {{1, 10, 4, 2}, {9, 3, 8, 7}, {15, 16, 17, 12}};
    coords = luckyNumbersInMatrix.getRowMin(matrix, 0);
    assertEquals(0, coords[0]);
    assertEquals(0, coords[1]);

    coords = luckyNumbersInMatrix.getRowMin(matrix, 1);
    assertEquals(1, coords[0]);
    assertEquals(1, coords[1]);

    coords = luckyNumbersInMatrix.getRowMin(matrix, 2);
    assertEquals(2, coords[0]);
    assertEquals(3, coords[1]);
  }

  @Test
  void getColMax() {
    var matrix = new int[][] {{3, 7, 8}, {9, 11, 13}, {15, 16, 17}};
    var coords = luckyNumbersInMatrix.getColMax(matrix, 0);
    assertEquals(2, coords[0]);
    assertEquals(0, coords[1]);

    coords = luckyNumbersInMatrix.getColMax(matrix, 1);
    assertEquals(2, coords[0]);
    assertEquals(1, coords[1]);

    coords = luckyNumbersInMatrix.getColMax(matrix, 2);
    assertEquals(2, coords[0]);
    assertEquals(2, coords[1]);

    matrix = new int[][] {{1, 10, 4, 2}, {9, 3, 8, 7}, {15, 16, 17, 12}};
    coords = luckyNumbersInMatrix.getColMax(matrix, 0);
    assertEquals(2, coords[0]);
    assertEquals(0, coords[1]);

    coords = luckyNumbersInMatrix.getColMax(matrix, 1);
    assertEquals(2, coords[0]);
    assertEquals(1, coords[1]);

    coords = luckyNumbersInMatrix.getColMax(matrix, 2);
    assertEquals(2, coords[0]);
    assertEquals(2, coords[1]);

    coords = luckyNumbersInMatrix.getColMax(matrix, 3);
    assertEquals(2, coords[0]);
    assertEquals(3, coords[1]);
  }
}
