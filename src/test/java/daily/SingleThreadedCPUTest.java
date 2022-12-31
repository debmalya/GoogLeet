package daily;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class SingleThreadedCPUTest {
	SingleThreadedCPU singleThreadedCPU = new SingleThreadedCPU();

	@Test
	void testGetOrder1() {
		int[] expected = new int[] { 0, 2, 3, 1 };
		assertArrayEquals(expected, singleThreadedCPU.getOrder(new int[][] { { 1, 2 }, { 2, 4 }, { 3, 2 }, { 4, 1 } }));
	}

	@Test
	void testGetOrder2() {
		int[] expected = new int[] { 0, 2, 3, 1 };
		assertArrayEquals(expected, singleThreadedCPU.getOrder(new int[][] { { 1, 2 }, { 2, 4 }, { 3, 2 }, { 4, 1 } }));
	}

}
