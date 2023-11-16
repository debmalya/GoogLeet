package daily.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaximumElementAfterDecreasingRearrangingTest {
    MaximumElementAfterDecreasingRearranging maximumElementAfterDecreasingRearranging = new MaximumElementAfterDecreasingRearranging();

    @Test
    void maximumElementAfterDecrementingAndRearranging() {
        assertEquals(2, maximumElementAfterDecreasingRearranging.maximumElementAfterDecrementingAndRearranging(new int[]{2, 2, 1, 2, 1}));
    }
}