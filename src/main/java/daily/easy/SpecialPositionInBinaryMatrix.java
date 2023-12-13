package daily.easy;

public class SpecialPositionInBinaryMatrix {
    /**
     * A position (i, j) is called special if mat[i][j] == 1 and
     * all other elements in row i and column j are 0 (rows and columns are 0-indexed).
     *
     * @param mat an m x n binary matrix.
     * @return the number of special positions.
     */
    public int numSpecial(int[][] mat) {
        int count = 0;
        boolean[] colVisited = new boolean[mat[0].length];

        for (int row = 0; row < mat.length; row++) {
            int rowCount = 0;
            int colNo = -1;
            for (int col = 0; col < mat[row].length; col++) {
                if (mat[row][col] == 1) {
                    rowCount++;
                    colNo = col;
                }
            }
            if (rowCount == 1) {
                int colCount = 0;
                for (int rowNo = 0; rowNo < mat.length; rowNo++) {
                    if (mat[rowNo][colNo] == 1) {
                        colCount++;
                    }
                }
                if (colCount == 1) {
                    count++;
                }
            }
        }


        return count;
    }
}
