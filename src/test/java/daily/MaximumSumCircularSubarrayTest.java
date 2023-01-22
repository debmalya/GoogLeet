package daily;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MaximumSumCircularSubarrayTest {

	MaximumSumCircularSubarray maximumSumCircularSubarray = new MaximumSumCircularSubarray();

	@Test
	void testMaxSubarraySumCircular() {
		assertEquals(15, maximumSumCircularSubarray.maxSubarraySumCircular(new int[] { -2, 4, -5, 4, -5, 9, 4 }));
		assertEquals(3, maximumSumCircularSubarray.maxSubarraySumCircular(new int[] { 1, -2, 3, -2 }));
		assertEquals(10, maximumSumCircularSubarray.maxSubarraySumCircular(new int[] { 5, -3, 5 }));
		assertEquals(-2, maximumSumCircularSubarray.maxSubarraySumCircular(new int[] { -3, -2, -3 }));
		assertEquals(4, maximumSumCircularSubarray.maxSubarraySumCircular(new int[] { 3, -1, 2, -1 }));
		assertEquals(15, maximumSumCircularSubarray.maxSubarraySumCircular(new int[] { 3, 1, 3, 2, 6 }));
		assertEquals(19, maximumSumCircularSubarray.maxSubarraySumCircular(new int[] { 2, -2, 2, 7, 8, 0 }));
		
	}

}
