package googleet.hard;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MaxPointInALineTest {

	MaxPointInALine maxPointInALine = new MaxPointInALine();

	@Test
	void testMaxPointsAllInSameLine() {
		assertEquals(3, maxPointInALine.maxPointsOwn(new int[][] { { 1, 1 }, { 2, 2 }, { 3, 3 } }));
	}

//	@Test
	void testMaxPointsTwoDifferentLines() {
		assertEquals(4,
				maxPointInALine.maxPointsOwn(new int[][] { { 1, 1 }, { 3, 2 }, { 5, 3 }, { 4, 1 }, { 2, 3 }, { 1, 4 } }));
	}

}
