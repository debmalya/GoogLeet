package daily.easy;

public class ImageSmoother {
    /**
     * An image smoother is a filter of the size 3 x 3 that can be applied to each cell of an image
     * by rounding down the average of the cell and the eight surrounding cells
     * (i.e., the average of the nine cells in the blue smoother).
     * If one or more of the surrounding cells of a cell is not present, we do not consider
     * it in the average (i.e., the average of the four cells in the red smoother).
     *
     * @param img m x n integer matrix.
     * @return the image after applying the smoother on each cell of it.
     */
    public int[][] imageSmoother(int[][] img) {
        int rows = img.length;
        int cols = img[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; ++i) {
            for (int j = 0; j < cols; ++j) {
                int totalSum = 0;
                int count = 0;

                for (int x = Math.max(0, i - 1); x < Math.min(rows, i + 2); ++x) {
                    for (int y = Math.max(0, j - 1); y < Math.min(cols, j + 2); ++y) {
                        totalSum += img[x][y];
                        count += 1;
                    }
                }

                result[i][j] = totalSum / count;
            }
        }

        return result;
    }
}
