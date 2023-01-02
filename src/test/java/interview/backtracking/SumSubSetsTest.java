package interview.backtracking;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class SumSubSetsTest {
	SumSubSets sunSubSets = new SumSubSets();

	@Test
	void oneOrTwoElements() {
		int[][] actual = sunSubSets.solution(new int[] { 1, 2, 3, 4, 5 }, 5);
		assertAll(() -> assertEquals(3, actual.length));
	}

	@Test
	void impossibleGreaterThanSum() {
		int[][] actual = sunSubSets.solution(new int[] { 1, 2, 3, 4, 5 }, 16);
		assertAll(() -> assertEquals(0, actual.length));
	}

	@Test
	void possibleEqualSum() {
		int[][] actual = sunSubSets.solution(new int[] { 1, 1, 1, 1, 1, 1, 1, 1, 1 }, 9);
		assertAll(() -> assertEquals(1, actual.length));
	}

	@Test
	void moreThanTwoElements() {
		int[][] actual = sunSubSets.solution(new int[] { 1, 2, 3, 4, 5 }, 6);
		Arrays.asList(actual).stream().forEach(e -> System.out.println(Arrays.toString(e)));
		assertAll(() -> assertEquals(3, actual.length));
	}
}
