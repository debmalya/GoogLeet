package daily.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SpecialPositionInBinaryMatrixTest {

    SpecialPositionInBinaryMatrix specialPositionInBinaryMatrix = new SpecialPositionInBinaryMatrix();

    @Test
    void numSpecial() {
        int[][] mat = new int[][]{{1, 0, 0}, {0, 0, 1}, {1, 0, 0}};
        assertEquals(1, specialPositionInBinaryMatrix.numSpecial(mat));

        mat = new int[][]{{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};
        assertEquals(3, specialPositionInBinaryMatrix.numSpecial(mat));
    }

    @Test
    void numSpecialOne() {
        int[][] mat = new int[][]{{1, 0, 0}, {0, 0, 1}, {1, 0, 0}, {0, 0, 0}};
        assertEquals(1, specialPositionInBinaryMatrix.numSpecial(mat));

        mat = new int[][]{{1, 0, 0}, {0, 0, 1}, {1, 0, 0}, {0, 1, 0}};
        assertEquals(2, specialPositionInBinaryMatrix.numSpecial(mat));

        mat = new int[][]{{1, 0, 0}, {0, 0, 1}, {1, 0, 0}, {0, 0, 1}};
        assertEquals(0, specialPositionInBinaryMatrix.numSpecial(mat));


    }
}