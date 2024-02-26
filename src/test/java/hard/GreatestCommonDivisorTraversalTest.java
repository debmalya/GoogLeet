package hard;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class GreatestCommonDivisorTraversalTest {
    GreatestCommonDivisorTraversal greatestCommonDivisorTraversal = new GreatestCommonDivisorTraversal();

    @Test
    void canTraverseAllPairs() {
        assertTrue(greatestCommonDivisorTraversal.canTraverseAllPairs(new int[]{2, 3, 6}));
        assertFalse(greatestCommonDivisorTraversal.canTraverseAllPairs(new int[]{3, 9, 5}));
        assertTrue(greatestCommonDivisorTraversal.canTraverseAllPairs(new int[]{4, 3, 12, 8}));
    }
}