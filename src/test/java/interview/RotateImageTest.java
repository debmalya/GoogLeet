package interview;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;


class RotateImageTest {
    RotateImage rotateImage = new RotateImage();

    @Test
    void rotate() {
        int[][] matrix = new int[][]{{5, 1, 9, 11}, {2, 4, 8, 10}, {13, 3, 6, 7}, {15, 14, 12, 16}};
        int[][] expected = new int[][]{{15, 13, 2, 5}, {14, 3, 4, 1}, {12, 6, 8, 9}, {16, 7, 10, 11}};
        rotateImage.rotate(matrix);
        for (int row = 0; row < expected.length; row++) {
            assertArrayEquals(expected[row], matrix[row]);
        }
    }
}