package googleet.hard;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ShortestPathInAGridWithObstacleEliminationTest {
	ShortestPathInAGridWithObstacleElimination shortestPathInAGridWithObstacleElimination = new ShortestPathInAGridWithObstacleElimination();

	@Test
	void testShortestPath() {
		assertEquals(6, shortestPathInAGridWithObstacleElimination
				.shortestPath(new int[][] { { 0, 0, 0 }, { 1, 1, 0 }, { 0, 0, 0 }, { 0, 1, 1 }, { 0, 0, 0 } }, 1));
		assertEquals(-1, shortestPathInAGridWithObstacleElimination
				.shortestPath(new int[][] { { 0, 1, 1 }, { 1, 1, 1 }, { 1, 0, 0 } }, 1));
	}

}
