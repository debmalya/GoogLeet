package daily;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class LongestSubsequenceWithLimitedSumTest {
	LongestSubsequenceWithLimitedSum longestSubsequenceWithLimitedSum = new LongestSubsequenceWithLimitedSum();

	@Test
	void testAnswerQueries() {
		int[] actual = longestSubsequenceWithLimitedSum.answerQueries(new int[] { 4, 5, 2, 1 },
				new int[] { 3, 10, 21 });
		System.out.println(Arrays.toString(actual));
		assertArrayEquals(new int[] { 2, 3, 4 }, actual);
	}

}
