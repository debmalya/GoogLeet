package daily.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Pattern132Test {

    Pattern132 pattern132 = new Pattern132();

    @Test
    void find132pattern() {
        assertFalse(pattern132.find132pattern(new int[]{1, 2, 3, 4}));
        assertTrue(pattern132.find132pattern(new int[]{3, 1, 4, 2}));
        assertTrue(pattern132.find132pattern(new int[]{-1, 3, 2, 0}));
    }

    @Test
    void find132pattern0() {
        assertFalse(pattern132.find132pattern0(new int[]{1, 2, 3, 4}));
        assertTrue(pattern132.find132pattern0(new int[]{3, 1, 4, 2}));
        assertTrue(pattern132.find132pattern0(new int[]{-1, 3, 2, 0}));
    }

    @Test
    void actualTestCase() {
        assertTrue(pattern132.find132pattern(new int[]{1, 3, 2, 4, 5, 6, 7, 8, 9, 10}));
    }

}