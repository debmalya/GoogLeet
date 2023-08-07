package interview;

public class RotateImage {
    /**
     * You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).
     * You have to rotate the image in-place, which means you have to modify the input 2D matrix directly.
     * DO NOT allocate another 2D matrix and do the rotation.
     *
     * @param matrix
     */
    public void rotate(int[][] matrix) {
        if (matrix.length > 0) {
            int temp = matrix[0][matrix[0].length - 1];
            int col = matrix[0].length - 1;
            int row = 0;
            boolean started = true;
            for (; col > 0; col--) {
                matrix[row][col] = matrix[row][col - 1];
               
            }

        }


    }
}
