package daily;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LexicographicallySmallestEquivalentStringTest {

	LexicographicallySmallestEquivalentString lexicographicallySmallestEquivalentString = new LexicographicallySmallestEquivalentString();

	@Test
	void testSmallestEquivalentString() {
		assertEquals("makkek",lexicographicallySmallestEquivalentString.smallestEquivalentString("parker", "morris", "parser"));
	}
	
	@Test
	void testSmallestEquivalentString1() {
		assertEquals("hdld",lexicographicallySmallestEquivalentString.smallestEquivalentString("hello", "world", "hold"));
	}
	
	@Test
	void testSmallestEquivalentString2() {
		assertEquals("aauaaaaada",lexicographicallySmallestEquivalentString.smallestEquivalentString("leetcode", "programs", "sourcecode"));
	}


}
