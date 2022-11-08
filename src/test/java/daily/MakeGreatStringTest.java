package daily;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MakeGreatStringTest {
	MakeGreatString makeGreatString = new MakeGreatString();

	@Test
	void testMakeGood() {
		assertEquals("leetcode", makeGreatString.makeGood("leEeetcode"));
		assertEquals("", makeGreatString.makeGood("abBAcC"));
		assertEquals("s", makeGreatString.makeGood("s"));
	}

}
