package daily.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinimumTimeTest {
    MinimumTime minimumTime = new MinimumTime();

    @Test
    void minTimeToVisitAllPoints() {
        assertEquals(5, minimumTime.minTimeToVisitAllPoints(new int[][]{{3, 2}, {-2, 2}}));
        assertEquals(7, minimumTime.minTimeToVisitAllPoints(new int[][]{{1, 1}, {3, 4}, {-1, 0}}));

    }
}