package daily;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ReverseVowelsOfAStringTest {
	ReverseVowelsOfAString reverseVowelsOfAString = new ReverseVowelsOfAString();

	@Test
	void testReverseVowels() {
		assertEquals("holle",reverseVowelsOfAString.reverseVowels("hello"));
		assertEquals("leotcede",reverseVowelsOfAString.reverseVowels("leetcode"));
		assertEquals("dabmalye",reverseVowelsOfAString.reverseVowels("debmalya"));
		assertEquals("andiI",reverseVowelsOfAString.reverseVowels("India"));
	}

}
