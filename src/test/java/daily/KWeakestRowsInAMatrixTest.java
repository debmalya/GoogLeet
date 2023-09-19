package daily;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class KWeakestRowsInAMatrixTest {
    KWeakestRowsInAMatrix kWeakestRowsInAMatrix = new KWeakestRowsInAMatrix();

    @Test
    void kWeakestRows() {
        int[] actual = kWeakestRowsInAMatrix.kWeakestRows(new int[][]{{1, 1, 0, 0, 0}, {1, 1, 1, 1, 0}, {1, 0, 0, 0, 0}, {1, 1, 0, 0, 0}, {1, 1, 1, 1, 1}}, 3);
        assertArrayEquals(new int[]{2, 0, 3}, actual);

        actual = kWeakestRowsInAMatrix.kWeakestRows(new int[][]{{1, 0, 0, 0}, {1, 1, 1, 1}, {1, 0, 0, 0}, {1, 0, 0, 0}}, 2);
        assertArrayEquals(new int[]{0, 2}, actual);
    }

    @Test
    void kWeakestRows_1() {
        int[] actual = kWeakestRowsInAMatrix.kWeakestRows1(new int[][]{{1, 1, 0, 0, 0}, {1, 1, 1, 1, 0}, {1, 0, 0, 0, 0}, {1, 1, 0, 0, 0}, {1, 1, 1, 1, 1}}, 3);
        assertArrayEquals(new int[]{2, 0, 3}, actual);

        actual = kWeakestRowsInAMatrix.kWeakestRows1(new int[][]{{1, 0, 0, 0}, {1, 1, 1, 1}, {1, 0, 0, 0}, {1, 0, 0, 0}}, 2);
        assertArrayEquals(new int[]{0, 2}, actual);
    }

    @Test
    void kWeakestRows15() {
        int[] actual = kWeakestRowsInAMatrix.kWeakestRows(new int[][]{{1, 0}, {1, 0}, {1, 0}, {1, 1}}, 4);
        assertArrayEquals(new int[]{0, 1, 2, 3}, actual);

    }

    @Test
    void kWeakestRows15_1() {
        int[] actual = kWeakestRowsInAMatrix.kWeakestRows1(new int[][]{{1, 0}, {1, 0}, {1, 0}, {1, 1}}, 4);
        assertArrayEquals(new int[]{0, 1, 2, 3}, actual);

    }
}