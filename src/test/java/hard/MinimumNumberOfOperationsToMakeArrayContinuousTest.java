package hard;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinimumNumberOfOperationsToMakeArrayContinuousTest {
    MinimumNumberOfOperationsToMakeArrayContinuous minimumNumberOfOperationsToMakeArrayContinuous
            = new MinimumNumberOfOperationsToMakeArrayContinuous();

    @Test
    void minOperations0() {
        assertEquals(0, minimumNumberOfOperationsToMakeArrayContinuous.minOperations0(new int[]{4, 2, 5, 3}));
        assertEquals(1, minimumNumberOfOperationsToMakeArrayContinuous.minOperations0(new int[]{1, 2, 3, 5, 6}));
        assertEquals(3, minimumNumberOfOperationsToMakeArrayContinuous.minOperations0(new int[]{1, 10, 100, 1000}));
    }

    @Test
    void minOperationsOwn0() {
        assertEquals(1, minimumNumberOfOperationsToMakeArrayContinuous.minOperations0(new int[]{2, 3, 5, 6}));
    }

    @Test
    void minOperations() {
        assertEquals(0, minimumNumberOfOperationsToMakeArrayContinuous.minOperations(new int[]{4, 2, 5, 3}));
        assertEquals(1, minimumNumberOfOperationsToMakeArrayContinuous.minOperations(new int[]{1, 2, 3, 5, 6}));
        assertEquals(3, minimumNumberOfOperationsToMakeArrayContinuous.minOperations(new int[]{1, 10, 100, 1000}));
    }

    @Test
    void minOperationsOwn() {
        assertEquals(1, minimumNumberOfOperationsToMakeArrayContinuous.minOperations(new int[]{2, 3, 5, 6}));
    }
}