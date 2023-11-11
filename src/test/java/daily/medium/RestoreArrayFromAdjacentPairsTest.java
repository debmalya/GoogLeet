package daily.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class RestoreArrayFromAdjacentPairsTest {
    RestoreArrayFromAdjacentPairs restoreArrayFromAdjacentPairs = new RestoreArrayFromAdjacentPairs();

    @Test
    void restoreArray() {
        int[] expected = new int[]{1, 2, 3, 4};
        assertArrayEquals(expected, restoreArrayFromAdjacentPairs.restoreArray(new int[][]{{2, 1}, {3, 4}, {3, 2}}));
    }
}