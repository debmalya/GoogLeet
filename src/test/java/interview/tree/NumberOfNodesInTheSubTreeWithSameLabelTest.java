package interview.tree;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class NumberOfNodesInTheSubTreeWithSameLabelTest {

	NumberOfNodesInTheSubTreeWithSameLabel numberOfNodesInTheSubTreeWithSameLabel = new NumberOfNodesInTheSubTreeWithSameLabel();

	@Test
	void testCountSubTrees0() {
		int[] actual = numberOfNodesInTheSubTreeWithSameLabel.countSubTrees(7,
				new int[][] { { 0, 1 }, { 0, 2 }, { 1, 4 }, { 1, 5 }, { 2, 3 }, { 2, 6 } }, "abaedcd");

		int[] expected = new int[] { 2, 1, 1, 1, 1, 1, 1 };
		assertArrayEquals(expected, actual,
				String.format("Expected :%s Actual :%s", Arrays.toString(expected), Arrays.toString(actual)));
	}

	@Test
	void testCountSubTrees1() {
		int[] actual = numberOfNodesInTheSubTreeWithSameLabel.countSubTrees(4,
				new int[][] { { 0, 1 }, { 1, 2 }, { 0, 3 } }, "bbbb");
		int[] expected = new int[] { 4, 2, 1, 1 };
		assertArrayEquals(expected, actual,
				String.format("Expected :%s Actual :%s", Arrays.toString(expected), Arrays.toString(actual)));
	}

	@Test
	void testCountSubTrees2() {
		int[] actual = numberOfNodesInTheSubTreeWithSameLabel.countSubTrees(5,
				new int[][] { { 0, 1 }, { 0, 2 }, { 1, 3 }, { 0, 4 } }, "aabab");
		int[] expected = new int[] { 3, 2, 1, 1, 1 };
		assertArrayEquals(expected, actual,
				String.format("Expected :%s Actual :%s", Arrays.toString(expected), Arrays.toString(actual)));
	}

	@Test
	void testCountSubTrees3() {
		int[] actual = numberOfNodesInTheSubTreeWithSameLabel.countSubTrees(7,
				new int[][] { { 0, 1 }, { 1, 2 }, { 2, 3 }, { 3, 4 }, { 4, 5 }, { 5, 6 } }, "aaabaaa");
		int[] expected = new int[] { 6, 5, 4, 1, 3, 2, 1 };

		assertArrayEquals(expected, actual,
				String.format("Expected :%s Actual :%s", Arrays.toString(expected), Arrays.toString(actual)));
	}

	@Test
	void testCountSubTrees4() {
		int[] actual = numberOfNodesInTheSubTreeWithSameLabel.countSubTrees(4,
				new int[][] { { 0, 2 }, { 0, 3 }, { 1, 2 } }, "aeed");
		int[] expected = new int[] { 1,1,2,1 };

		assertArrayEquals(expected, actual,
				String.format("Expected :%s Actual :%s", Arrays.toString(expected), Arrays.toString(actual)));
	}
}
