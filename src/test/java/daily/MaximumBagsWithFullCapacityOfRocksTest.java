package daily;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MaximumBagsWithFullCapacityOfRocksTest {

	MaximumBagsWithFullCapacityOfRocks maximumBagsWithFullCapacityOfRocks = new MaximumBagsWithFullCapacityOfRocks();

	@Test
	void testMaximumBags() {
		assertEquals(3,
				maximumBagsWithFullCapacityOfRocks.maximumBags(new int[] { 2, 3, 4, 5 }, new int[] { 1, 2, 4, 4 }, 2));
		assertEquals(3,
				maximumBagsWithFullCapacityOfRocks.maximumBags(new int[] { 10, 2, 2 }, new int[] { 2, 2, 0 }, 100));
	}

	@Test
	void specialCases() {
		assertEquals(1, maximumBagsWithFullCapacityOfRocks.maximumBags(new int[] { 91, 54, 63, 99, 24, 45, 78 },
				new int[] { 35, 32, 45, 98, 6, 1, 25 }, 17));
	}
}
