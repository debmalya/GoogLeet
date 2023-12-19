package daily.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaximumProductPairDiffTest {
    MaximumProductPairDiff maximumProductPairDiff = new MaximumProductPairDiff();

    @Test
    void maxProductDifference() {
        assertEquals(34, maximumProductPairDiff.maxProductDifference(new int[]{5, 6, 2, 7, 4}));
        assertEquals(64, maximumProductPairDiff.maxProductDifference(new int[]{4, 2, 5, 9, 7, 4, 8}));
    }
}