package daily.medium;

public class DifferenceBetweenOnesNZerosInRowNColumn {
    /**
     * You are given a 0-indexed m x n binary matrix grid.
     * <p>
     * Let the number of ones in the ith row be onesRowi.
     * Let the number of ones in the jth column be onesColj.
     * Let the number of zeros in the ith row be zerosRowi.
     * Let the number of zeros in the jth column be zerosColj.
     * diff[i][j] = onesRowi + onesColj - zerosRowi - zerosColj
     *
     * @param grid 0-indexed m x n binary matrix.
     * @return the difference matrix diff.
     */


    public int[][] onesMinusZeros(int[][] grid) {
        int[][] diff = new int[grid.length][grid[0].length];
        int[] row = new int[grid.length];
        int[] col = new int[grid[0].length];

        for (int rowIndex = 0; rowIndex < grid.length; rowIndex++) {
            for (int colIndex = 0; colIndex < grid[rowIndex].length; colIndex++) {
                row[rowIndex] += grid[rowIndex][colIndex];
                col[colIndex] += grid[rowIndex][colIndex];
            }
        }

        for (int rowIndex = 0; rowIndex < grid.length; rowIndex++) {
            for (int colIndex = 0; colIndex < grid[rowIndex].length; colIndex++) {
                diff[rowIndex][colIndex] = row[rowIndex] + col[colIndex] - (grid.length - col[colIndex]) - (grid[rowIndex].length - row[rowIndex]);
            }
        }
        return diff;
    }
}
