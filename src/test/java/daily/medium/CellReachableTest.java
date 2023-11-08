package daily.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CellReachableTest {

    CellReachable cellReachable = new CellReachable();

    @Test
    void isReachableAtTime() {
        assertTrue(cellReachable.isReachableAtTime(2, 4, 7, 7, 6));
        assertFalse(cellReachable.isReachableAtTime(3, 1, 7, 3, 3));
    }
}