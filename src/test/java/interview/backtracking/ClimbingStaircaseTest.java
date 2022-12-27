package interview.backtracking;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ClimbingStaircaseTest {
	ClimbingStaircase climbingStaircase = new ClimbingStaircase();

	@Test
	void test1() {
		int[][] actual = climbingStaircase.solution(4, 2);

		assertAll(() -> assertEquals(5, actual.length), () -> assertArrayEquals(new int[] { 1, 1, 1, 1 }, actual[0]),
				() -> assertArrayEquals(new int[] { 1, 1, 2 }, actual[1]),
				() -> assertArrayEquals(new int[] { 1, 2, 1 }, actual[2]),
				() -> assertArrayEquals(new int[] { 2, 1, 1 }, actual[3]),
				() -> assertArrayEquals(new int[] { 2, 2 }, actual[4]));
	}

	@Test
	void test2() {
		int[][] actual = climbingStaircase.solution(0, 0);
		assertEquals(1, actual.length);
		assertEquals(0, actual[0].length);
	}

}
