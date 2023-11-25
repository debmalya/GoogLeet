package daily.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SumOfAbsoluteDifferenceSortedArrayTest {
    SumOfAbsoluteDifferenceSortedArray sumOfAbsoluteDifferenceSortedArray = new SumOfAbsoluteDifferenceSortedArray();

    @Test
    void getSumAbsoluteDifferences() {
        assertArrayEquals(new int[]{24, 15, 13, 15, 21}, sumOfAbsoluteDifferenceSortedArray.getSumAbsoluteDifferences(new int[]{1, 4, 6, 8, 10}));
        assertArrayEquals(new int[]{4, 3, 5}, sumOfAbsoluteDifferenceSortedArray.getSumAbsoluteDifferences(new int[]{2, 3, 5}));
    }

    @Test
    void getSumAbsoluteDifferences0() {
        assertArrayEquals(new int[]{24, 15, 13, 15, 21}, sumOfAbsoluteDifferenceSortedArray.getSumAbsoluteDifferences0(new int[]{1, 4, 6, 8, 10}));
        assertArrayEquals(new int[]{4, 3, 5}, sumOfAbsoluteDifferenceSortedArray.getSumAbsoluteDifferences0(new int[]{2, 3, 5}));
    }
}