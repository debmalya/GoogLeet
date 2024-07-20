package daily.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LuckyNumbersInMatrix {
  /**
   * Given an m x n matrix of distinct numbers, return all lucky numbers in the matrix in any order.
   *
   * <p>A lucky number is an element of the matrix such that it is the minimum element in its row
   * and maximum in its column.
   *
   * @param matrix - double dimension integer array.
   * @return - list of lucky number.
   */
  public List<Integer> luckyNumbers(int[][] matrix) {
    var luckier = new ArrayList<Integer>();
    int nRows = matrix.length;

    for (var rowIndex = 0; rowIndex < nRows; rowIndex++) {
      var minRowCoordinates = getRowMin(matrix, rowIndex);
      var maxColCoordinates = getColMax(matrix, minRowCoordinates[1]);
      if (Arrays.equals(minRowCoordinates, maxColCoordinates)) {
        luckier.add(matrix[minRowCoordinates[0]][minRowCoordinates[1]]);
      }
    }

    return luckier;
  }

  public int[] getRowMin(int[][] matrix, int rowNum) {
    var nCols = matrix[0].length;
    int[] coordinates = new int[2];
    int min = Integer.MAX_VALUE;
    for (var index = 0; index < nCols; index++) {
      if (matrix[rowNum][index] < min) {
        min = matrix[rowNum][index];
        coordinates[0] = rowNum;
        coordinates[1] = index;
      }
    }
    return coordinates;
  }

  public int[] getColMax(int[][] matrix, int colNum) {
    var nRows = matrix.length;
    int[] coordinates = new int[2];
    int max = Integer.MIN_VALUE;
    for (var index = 0; index < nRows; index++) {
      if (matrix[index][colNum] > max) {
        max = matrix[index][colNum];
        coordinates[0] = index;
        coordinates[1] = colNum;
      }
    }
    return coordinates;
  }
}
