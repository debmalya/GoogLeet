package googleeet.medium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LongestSubstringWithAtMostTwoDistinctCharactersTest {

	LongestSubstringWithAtMostTwoDistinctCharacters longestSubstringWithAtMostTwoDistinctCharacters = new LongestSubstringWithAtMostTwoDistinctCharacters();

	@Test
	void testLengthOfLongestSubstringTwoDistinct() {
		assertEquals(3, longestSubstringWithAtMostTwoDistinctCharacters.lengthOfLongestSubstringTwoDistinct("eceba"));
		assertEquals(5, longestSubstringWithAtMostTwoDistinctCharacters.lengthOfLongestSubstringTwoDistinct("ccaabbb"));
		assertEquals(2, longestSubstringWithAtMostTwoDistinctCharacters.lengthOfLongestSubstringTwoDistinct("aa"));
	}

	@Test
	void testDistinctCount() {
		assertTrue(longestSubstringWithAtMostTwoDistinctCharacters.matchingCriteria("ece"));
		assertFalse(longestSubstringWithAtMostTwoDistinctCharacters.matchingCriteria("Ece"));
	}

}
