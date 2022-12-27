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

}
