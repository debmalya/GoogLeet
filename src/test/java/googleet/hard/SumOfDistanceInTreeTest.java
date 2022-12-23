package googleet.hard;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class SumOfDistanceInTreeTest {

	SumOfDistanceInTree sumOfDistanceInTree = new SumOfDistanceInTree();

	@Test
	void testSumOfDistancesInTree() {
		int[][] edges = new int[][] { { 0, 1 }, { 0, 2 }, { 2, 3 }, { 2, 4 }, { 2, 5 } };
		int[] actual = sumOfDistanceInTree.sumOfDistancesInTree(6, edges);
		System.out.println(Arrays.toString(actual));
		int[] expected = new int[] { 8, 12, 6, 10, 10, 10 };
		assertArrayEquals(expected, actual);

	}

}
