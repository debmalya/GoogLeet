package hard;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ConstrainedSubsequenceSumTest {
    ConstrainedSubsequenceSum constrainedSubsequenceSum = new ConstrainedSubsequenceSum();

    @Test
    void constrainedSubsetSum() {
        assertEquals(37, constrainedSubsequenceSum.constrainedSubsetSum(new int[]{10, 2, -10, 5, 20}, 2));
        assertEquals(-1, constrainedSubsequenceSum.constrainedSubsetSum(new int[]{-1, -2, -3}, 1));
        assertEquals(23, constrainedSubsequenceSum.constrainedSubsetSum(new int[]{10, -2, -10, -5, 20}, 2));
    }
}