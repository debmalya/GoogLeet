package hard;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class NumbersOfFlowerInFullBloomTest {

    NumbersOfFlowerInFullBloom numbersOfFlowerInFullBloom = new NumbersOfFlowerInFullBloom();

    @Test
    void fullBloomFlowers0() {
        int[] actual = numbersOfFlowerInFullBloom.fullBloomFlowers0(
                new int[][]{{1, 6}, {3, 7}, {9, 12}, {4, 13}},
                new int[]{2, 3, 7, 11});
        int[] expected = new int[]{1, 2, 2, 2};
        assertArrayEquals(expected, actual);

        actual = numbersOfFlowerInFullBloom.fullBloomFlowers0(
                new int[][]{{1, 10}, {3, 3}},
                new int[]{3, 3, 2});
        expected = new int[]{2, 2, 1};
        assertArrayEquals(expected, actual);
    }

    @Test
    void fullBloomFlowersActual0() {
        int[] actual = numbersOfFlowerInFullBloom.fullBloomFlowers0(
                new int[][]{{19, 37}, {19, 38}, {19, 35}},
                new int[]{6, 7, 21, 1, 13, 37, 5, 37, 46, 43});
        int[] expected = new int[]{0, 0, 3, 0, 0, 2, 0, 2, 0, 0};
        System.out.println(Arrays.toString(actual));
        assertArrayEquals(expected, actual);
    }

    @Test
    void fullBloomFlowers() {
        int[] actual = numbersOfFlowerInFullBloom.fullBloomFlowers(
                new int[][]{{1, 6}, {3, 7}, {9, 12}, {4, 13}},
                new int[]{2, 3, 7, 11});
        int[] expected = new int[]{1, 2, 2, 2};
        assertArrayEquals(expected, actual);

        actual = numbersOfFlowerInFullBloom.fullBloomFlowers(
                new int[][]{{1, 10}, {3, 3}},
                new int[]{3, 3, 2});
        expected = new int[]{2, 2, 1};
        assertArrayEquals(expected, actual);
    }

    @Test
    void fullBloomFlowersActual() {
        int[] actual = numbersOfFlowerInFullBloom.fullBloomFlowers(
                new int[][]{{19, 37}, {19, 38}, {19, 35}},
                new int[]{6, 7, 21, 1, 13, 37, 5, 37, 46, 43});
        int[] expected = new int[]{0, 0, 3, 0, 0, 2, 0, 2, 0, 0};
        System.out.println(Arrays.toString(actual));
        assertArrayEquals(expected, actual);
    }
}