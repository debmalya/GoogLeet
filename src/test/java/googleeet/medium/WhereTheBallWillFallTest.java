package googleeet.medium;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class WhereTheBallWillFallTest {

	WhereTheBallWillFall whereTheBallWillFall = new WhereTheBallWillFall();

	@Test
	void testFindBall() {
		int[][] arr = new int[][] { { 1, 1, 1, -1, -1 }, { 1, 1, 1, -1, -1 }, { -1, -1, -1, 1, 1 }, { 1, 1, 1, 1, -1 },
				{ -1, -1, -1, -1, -1 } };
		int[] actual = whereTheBallWillFall.findBall(arr);
		int[] expected = new int[] {1,-1,-1,-1,-1};
		assertArrayEquals(expected, actual);
	}

}
