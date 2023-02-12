package googleeet.medium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ShortestPathWithAlternateColorTest {

	ShortestPathWithAlternateColor shortestPathWithAlternateColor = new ShortestPathWithAlternateColor();

	@Test
	void example1() {
		int[] actual = shortestPathWithAlternateColor.shortestAlternatingPaths(3, new int[][] { { 0, 1 }, { 1, 2 } },
				new int[][] {});
		int[] expected = new int[] { 0, 1, -1 };
		assertArrayEquals(expected, actual);
	}

	@Test
	void example2() {
		int[] actual = shortestPathWithAlternateColor.shortestAlternatingPaths(3, new int[][] { { 0, 1 } },
				new int[][] { { 2, 1 } });
		int[] expected = new int[] { 0, 1, -1 };
		assertArrayEquals(expected, actual);
	}

	@Test
	void ownExample1() {
		int[] actual = shortestPathWithAlternateColor.shortestAlternatingPaths(3, new int[][] { { 0, 1 } },
				new int[][] { { 1, 2 } });
		int[] expected = new int[] { 0, 1, 2 };
		assertArrayEquals(expected, actual);
	}

	@Test
	void ownExample2() {
		int[] actual = shortestPathWithAlternateColor.shortestAlternatingPaths(3, new int[][] { { 1, 1 }, { 2, 2 } },
				new int[][] { { 1, 1 } });
		int[] expected = new int[] { 0, -1, -1 };
		assertArrayEquals(expected, actual);
	}

	@Test
	void ownExample3() {
		int[] actual = shortestPathWithAlternateColor.shortestAlternatingPaths(4, new int[][] { { 0, 1 }, { 2, 3 } },
				new int[][] { { 1, 2 }, { 1, 3 } });
		int[] expected = new int[] { 0, 1, 2, 2 };
		assertArrayEquals(expected, actual);
	}

	@Test
	void ownExample4() {
		int[] actual = shortestPathWithAlternateColor.shortestAlternatingPaths(3, new int[][] { { 1, 1 }, { 2, 2 } },
				new int[][] { { 1, 1 } });
		int[] expected = new int[] { 0, -1, -1 };
		assertArrayEquals(expected, actual);
	}

	@Test
	void ownExample5() {
		int[] actual = shortestPathWithAlternateColor.shortestAlternatingPaths(4,
				new int[][] { { 0, 1 }, { 2, 3 }, { 1, 3 } }, new int[][] { { 1, 2 } });
		int[] expected = new int[] { 0, 1, 2, 3 };
		assertArrayEquals(expected, actual);
	}

	@Test
	void ownExample6() {
		int[] actual = shortestPathWithAlternateColor.shortestAlternatingPaths(5, new int[][] { { 1, 2 }, { 3, 4 } },
				new int[][] { { 0, 1 }, { 2, 3 } });
		int[] expected = new int[] { 0, 1, 2, 3, 4 };
		assertArrayEquals(expected, actual);
	}

}
