package googleeet.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class LongestPalindromeByConcatenatingTwoLetterWordsTest {

	LongestPalindromeByConcatenatingTwoLetterWords longestPalindromeByConcatenatingTwoLetterWords = new LongestPalindromeByConcatenatingTwoLetterWords();

	@Test
	void testLongestPalindrome() {
		assertEquals(6,
				longestPalindromeByConcatenatingTwoLetterWords.longestPalindrome(new String[] { "lc", "cl", "gg" }));
		assertEquals(8, longestPalindromeByConcatenatingTwoLetterWords
				.longestPalindrome(new String[] { "ab", "ty", "yt", "lc", "cl", "ab" }));
		assertEquals(2,
				longestPalindromeByConcatenatingTwoLetterWords.longestPalindrome(new String[] { "cc", "ll", "xx" }));
	}

}
