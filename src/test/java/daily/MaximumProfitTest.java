package daily;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class MaximumProfitTest {

	MaximumProfit maximumProfit = new MaximumProfit();

	@Test
	void testGetMaxProfit() {
		assertEquals(8, maximumProfit.getMaxProfit(new int[] { 2, 3, 10, 6, 4, 8, 1 }));
		assertEquals(6, maximumProfit.getMaxProfit(new int[] { 10, 3, 2, 6, 4, 8, 1 }));
		assertEquals(9, maximumProfit.getMaxProfit(new int[] { 1, 3, 2, 6, 4, 8, 10 }));
	}

	@Test
	void getMaxProfit() {
		assertEquals(3, maximumProfit.maxProfit(new int[] { 1, 2, 3, 0, 2 }));
		assertEquals(0, maximumProfit.maxProfit(new int[] { 1 }));
	}

	@Test
	void testMerge() {
//		Input [ 3, 4, 6, 8, 10], [1,2,4,5,9], Output [10,9,8,6,5,4,4,3,2,1]
		int[] arr1 = new int[] { 3, 4, 6, 8, 10 };
		int[] arr2 = new int[] { 1, 2, 4, 5, 9 };
		int[] actual = maximumProfit.merge2sortedArrays(arr1, arr2);
		int[] expected = new int[] { 10, 9, 8, 6, 5, 4, 4, 3, 2, 1 };
		System.out.println(Arrays.toString(actual));
		assertArrayEquals(expected, actual);
	}
}
