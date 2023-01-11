package interview.tree;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class MinimumTimeToCollectApplesTest {
	MinimumTimeToCollectApples minimumTimeToCollectApples = new MinimumTimeToCollectApples();

	@Test
	void testMinTime() {
		assertEquals(0, minimumTimeToCollectApples.minTime(0,
				new int[][] { { 0, 1 }, { 0, 2 }, { 1, 4 }, { 1, 5 }, { 2, 3 }, { 2, 6 } },
				Arrays.asList(false, false, false, false, false, false, false)));
	}

}
