package googleeet.arrays.strings;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LongestSubstringWithoutRepeatingCharactersTest {

	LongestSubstringWithoutRepeatingCharacters longestSubstringWithoutRepeatingCharacters = new LongestSubstringWithoutRepeatingCharacters();

	@Test
	void testLengthOfLongestSubstring() {
		assertEquals(3, longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("abcabcbb"));
		assertEquals(1, longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("bbbbb"));
		assertEquals(4, longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("tapasi"));
	}

}
