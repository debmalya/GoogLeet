package daily.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class DifferenceBetweenOnesNZerosInRowNColumnTest {
    DifferenceBetweenOnesNZerosInRowNColumn differenceBetweenOnesNZerosInRowNColumn = new DifferenceBetweenOnesNZerosInRowNColumn();


    @Test
    void example10() {
        int[][] actual = differenceBetweenOnesNZerosInRowNColumn.onesMinusZeros(new int[][]{{0, 1, 1}, {1, 0, 1}, {0, 0, 1}});
        int[][] expected = new int[][]{{0, 0, 4}, {0, 0, 4}, {-2, -2, 2}};
        for (int row = 0; row < expected.length; row++) {
            assertArrayEquals(expected[row], actual[row]);
        }
    }

    @Test
    void example20() {
        int[][] actual = differenceBetweenOnesNZerosInRowNColumn.onesMinusZeros(new int[][]{{1, 1, 1}, {1, 1, 1}});
        int[][] expected = new int[][]{{5, 5, 5}, {5, 5, 5}};
        for (int row = 0; row < expected.length; row++) {
            assertArrayEquals(expected[row], actual[row]);
        }
    }
}