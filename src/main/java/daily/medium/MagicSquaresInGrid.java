package daily.medium;

public class MagicSquaresInGrid {
  public int numMagicSquaresInside(int[][] grid) {
    int magicSquareCount = 0;
    for (int i = 0; i < grid.length - 2; i++) {
      for (int j = 0; j < grid[i].length - 2; j++) {
        if (isMagicSquare(grid, i, j)) {
          magicSquareCount++;
        }
      }
    }
    return magicSquareCount;
  }

  private boolean isMagicSquare(int[][] grid, int i, int j) {
    int[] count = new int[16]; // 1-9 (total 8 digits)
    for (var row = i; row < i + 3; row++) {
      for (var col = j; col < j + 3; col++) {
        if (grid[row][col] < 1 || grid[row][col] > 9) {
          return false;
        }
        count[grid[row][col]]++;
      }
    }

    for (var k = 1; k <= 9; k++) {
      if (count[k] != 1) {
        return false;
      }
    }

    // check rows
    if (checRows(grid, i, j)) return false;

    // check cols
    if (checkCols(grid, i, j)) return false;

    //    check diagonals
    return grid[i][j] + grid[i + 1][j + 1] + grid[i + 2][j + 2] == 15;
  }

  private static boolean checkCols(int[][] grid, int i, int j) {
    for (var col = j; col < j + 3; col++) {
      var sum = 0;
      for (var row = i; row < i + 3; row++) {
        sum += grid[row][col];
      }
      if (sum != 15) {
        return true;
      }
    }
    return false;
  }

  private static boolean checRows(int[][] grid, int i, int j) {
    for (var row = i; row < i + 3; row++) {
      var sum = 0;
      for (var col = j; col < j + 3; col++) {
        sum += grid[row][col];
      }
      if (sum != 15) {
        return true;
      }
    }
    return false;
  }
}
