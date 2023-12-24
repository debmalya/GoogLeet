package daily.easy;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

class PathCrossingTest {

    PathCrossing pathCrossing = new PathCrossing();

    @Test
    void isPathCrossing() {
        assertFalse(pathCrossing.isPathCrossing0("NES"));
        assertTrue(pathCrossing.isPathCrossing0("NESWW"));
    }
}