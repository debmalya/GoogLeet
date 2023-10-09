package daily.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class FindFirstNLastPositionOfElementInSortedArrayTest {
    FindFirstNLastPositionOfElementInSortedArray findFirstNLastPositionOfElementInSortedArray = new FindFirstNLastPositionOfElementInSortedArray();


    @Test
    void searchRange() {
        int[] actual = findFirstNLastPositionOfElementInSortedArray.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8);
        int[] expected = new int[]{3, 4};
        assertArrayEquals(expected, actual);
        actual = findFirstNLastPositionOfElementInSortedArray.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 6);
        expected = new int[]{-1, -1};
        assertArrayEquals(expected, actual);
        findFirstNLastPositionOfElementInSortedArray.searchRange(new int[]{}, 0);
        assertArrayEquals(expected, actual);
    }


    @Test
    void searchRangeRealTestCase() {
        int[] actual = findFirstNLastPositionOfElementInSortedArray.searchRange(new int[]{1}, 1);
        int[] expected = new int[]{0, 0};
        assertArrayEquals(expected, actual);
    }
}