package interview.tree;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LongestPathWithDiffAdjacentCharactersTest {
	LongestPathWithDiffAdjacentCharacters longestPathWithDiffAdjacentCharacters = new LongestPathWithDiffAdjacentCharacters();

	@Test
	void testLongestPath() {
		assertEquals(3, longestPathWithDiffAdjacentCharacters.longestPath(new int[] { -1, 0, 0, 1, 1, 2 }, "abacbe"));
	}

	@Test
	void testLongestPath1() {
		assertEquals(3, longestPathWithDiffAdjacentCharacters.longestPath(new int[] { -1, 0, 0, 0 }, "aabc"));
	}

}
