package hard;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ReachingPointsTest {
    ReachingPoints reachingPoints = new ReachingPoints();


    @Test
    void reachingPoints() {
        assertTrue(reachingPoints.reachingPoints(1, 1, 3, 2));
        assertFalse(reachingPoints.reachingPoints(1, 1, 2, 2));
        assertTrue(reachingPoints.reachingPoints(1, 1, 1, 1));
        assertTrue(reachingPoints.reachingPoints(1, 1, 1, 1));
//        assertTrue(reachingPoints.reachingPoints(1, 1, 2, 5));
//        assertTrue(reachingPoints.reachingPoints(1, 1, 3, 5));
    }
}