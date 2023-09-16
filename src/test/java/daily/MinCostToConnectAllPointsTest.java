package daily;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinCostToConnectAllPointsTest {
    MinCostToConnectAllPoints minCostToConnectAllPoints = new MinCostToConnectAllPoints();

    @Test
    void minCostConnectPoints0() {
        int[][] points = new int[][]{{0, 0}, {2, 2}, {3, 10}, {5, 2}, {7, 0}};
        assertEquals(20, minCostToConnectAllPoints.minCostConnectPoints(points));
        points = new int[][]{{0, 0}, {2, 2}, {3, 10}, {5, 2}, {7, 0}};
        assertEquals(20, minCostToConnectAllPoints.minCostConnectPoints(points));

    }
}