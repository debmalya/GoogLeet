package daily.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MonotonicArrayTest {

    MonotonicArray monotonicArray = new MonotonicArray();

    @Test
    void isMonotonic() {
        assertTrue(monotonicArray.isMonotonic(new int[]{1, 2, 2, 3}));
        assertTrue(monotonicArray.isMonotonic(new int[]{6, 5, 4, 4}));
        assertFalse(monotonicArray.isMonotonic(new int[]{1, 3, 2}));
    }

    @Test
    void isMonotonicOwn() {
        assertTrue(monotonicArray.isMonotonic(new int[]{1, 1, 1, 1}));
    }
}