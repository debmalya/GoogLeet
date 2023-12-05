package daily.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;


class MergeSortedArrayTest {
    MergeSortedArray mergeSortedArray = new MergeSortedArray();

    @Test
    void merge() {
        int[] expected = new int[]{1, 2, 2, 3, 5, 6};
        int[] actual = new int[]{1, 2, 3, 0, 0, 0};
        mergeSortedArray.merge(actual, 3, new int[]{2, 5, 6}, 3);
        assertArrayEquals(expected, actual);
    }

    @Test
    void merge1() {
        int[] expected = new int[]{1, 2, 2, 3, 5, 6};
        int[] actual = new int[]{2, 5, 6, 0, 0, 0};
        mergeSortedArray.merge(actual, 3, new int[]{1, 2, 3}, 3);
        assertArrayEquals(expected, actual);
    }
}