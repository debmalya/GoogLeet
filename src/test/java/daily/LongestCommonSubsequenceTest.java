package daily;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LongestCommonSubsequenceTest {
	
	LongestCommonSubsequence longestCommonSubsequence = new LongestCommonSubsequence();

	@Test
	void testLongestCommonSubsequence() {
		assertEquals(3,longestCommonSubsequence.longestCommonSubsequence("abcde", "ace"));
		assertEquals(3,longestCommonSubsequence.longestCommonSubsequence("abc", "abc"));
		assertEquals(0,longestCommonSubsequence.longestCommonSubsequence("abc", "def"));
	}

}
