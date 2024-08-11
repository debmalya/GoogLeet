package daily.medium;

import java.util.ArrayList;
import java.util.List;

public class FindValidMatrixGivenRowColSum {
  /**
   * You are given two arrays rowSum and colSum of non-negative integers where rowSum[i] is the sum
   * of the elements in the ith row and colSum[j] is the sum of the elements of the jth column of a
   * 2D matrix. In other words, you do not know the elements of the matrix, but you do know the sums
   * of each row and column.
   *
   * <p>Find any matrix of non-negative integers of size rowSum.length x colSum.length that
   * satisfies the rowSum and colSum requirements.
   *
   * <p>Return a 2D array representing any matrix that fulfills the requirements. It's guaranteed
   * that at least one matrix that fulfills the requirements exists.
   *
   * @param rowSum - non-negative integer array. rowSum[i] is the sum of elements of row i of a 2D
   *     matrix.
   * @param colSum - - non-negative integer array. colSum[j] is the sum of the elements of the jth
   *     column of a 2D matrix.
   * @return - a 2D array matrix matching rowSum and colSum.
   */
  public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
    int nRows = rowSum.length;
    int nCols = colSum.length;
    int[][] result = new int[nRows][nCols];
    List<Integer> completedRows = new ArrayList<>();
    List<Integer> completedCols = new ArrayList<>();

    while (completedRows.size() < nRows && completedCols.size() < nCols) {
      var minRowIndex = getMinIndexSum(rowSum, completedRows);
      for (var index = 0; index < nCols; index++) {
        if (!completedCols.contains(index)) {
          result[minRowIndex][index] = rowSum[minRowIndex];
          break;
        } else {
          rowSum[minRowIndex] -= result[minRowIndex][index];
        }
      }

      var minColIndex = getMinIndexSum(colSum, completedCols);
      var minColSum = 0;
      for (var index = 0; index < nRows; index++) {
        minColSum += result[index][minColIndex];
        if (index == nCols - 1) {
          result[index][minColIndex] = colSum[minColIndex] - minColSum;
        }
      }
    }

    return result;
  }

  /**
   * @param rowSum - array containing row sums.
   * @param completedRows - list of rows already processed.
   * @return - min sum from unprocessed rows.
   */
  public int getMinIndexSum(int[] rowSum, List<Integer> completedRows) {
    int min = Integer.MAX_VALUE;
    int minIndex = -1;
    for (var index = 0; index < rowSum.length; index++) {
      if (!completedRows.contains(index) && rowSum[index] < min) {
        min = rowSum[index];
        minIndex = index;
        completedRows.add(index);
      }
    }
    return minIndex;
  }
}
