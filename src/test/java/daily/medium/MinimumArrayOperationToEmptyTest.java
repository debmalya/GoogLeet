package daily.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinimumArrayOperationToEmptyTest {

    MinimumArrayOperationToEmpty minimumArrayOperationToEmpty = new MinimumArrayOperationToEmpty();

    @Test
    void minOperations() {
        assertEquals(-1, minimumArrayOperationToEmpty.minOperations(new int[]{2, 1, 2, 2, 3, 3}));
        assertEquals(4, minimumArrayOperationToEmpty.minOperations(new int[]{2, 3, 3, 2, 2, 4, 2, 3, 4}));

    }

    @Test
    void minOperationsReal() {
        assertEquals(7, minimumArrayOperationToEmpty.minOperations(new int[]{14, 12, 14, 14, 12, 14,
                14, 12, 12, 12, 12, 14, 14, 12, 14, 14, 14, 12, 12}));
        assertEquals(5, minimumArrayOperationToEmpty.minOperations(new int[]{19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19}));
        assertEquals(5, minimumArrayOperationToEmpty.minOperations(new int[]{3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3}));
        assertEquals(6, minimumArrayOperationToEmpty.minOperations(new int[]{11, 11, 11, 11, 19, 11, 11, 11, 11, 11, 19, 11, 11, 11, 11, 11, 19}));
        assertEquals(8, minimumArrayOperationToEmpty.minOperations(new int[]{7, 7, 7, 7, 7, 7, 7, 16, 7, 7, 7, 16, 7, 16, 7, 16, 16, 16, 16, 7}));
    }

    @Test
    void own() {
        assertEquals(3, minimumArrayOperationToEmpty.minOperations(new int[]{7, 7, 7, 7, 7, 7, 7}));
    }

}