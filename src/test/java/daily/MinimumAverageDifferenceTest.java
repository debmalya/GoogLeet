package daily;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MinimumAverageDifferenceTest {
	
	MinimumAverageDifference minimumAverageDifference = new MinimumAverageDifference();

	@Test
	void testMinimumAverageDifference() {
		int[] nums = new int[] {2,5,3,9,5,3};
		assertEquals(3,minimumAverageDifference.minimumAverageDifference(nums));
	}

}
