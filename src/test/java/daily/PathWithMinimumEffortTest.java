package daily;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PathWithMinimumEffortTest {
    PathWithMinimumEffort minimumEffort = new PathWithMinimumEffort();

    @Test
    void minimumEffortPath() {
        assertEquals(2, minimumEffort.minimumEffortPath(new int[][]{{1, 2, 2}, {3, 8, 2}, {5, 3, 5}}));
    }
}